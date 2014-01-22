package net.papertowels.wowapi;

import static net.papertowels.wowapi.utils.UrlUtils.encodeUrl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import net.papertowels.wowapi.battlepet.BattlePetAbility;
import net.papertowels.wowapi.battlepet.BattlePetSpecies;
import net.papertowels.wowapi.battlepet.BattlePetStats;
import net.papertowels.wowapi.challenge.ChallengeSet;
import net.papertowels.wowapi.characterprofile.CharacterProfile;
import net.papertowels.wowapi.characterprofile.CharacterProfile.CharacterProfileField;
import net.papertowels.wowapi.guildprofile.GuildProfile;
import net.papertowels.wowapi.guildprofile.GuildProfile.GuildProfileField;
import net.papertowels.wowapi.pvp.Pvp;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WowApi {

	private String host;
	private ObjectMapper mapper = new ObjectMapper();
	private boolean testMode;

	public WowApi(String region) {
		this(region, false);
	}

	public WowApi(String region, boolean testMode) {
		this.testMode = testMode;
		if (!testMode) {
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		}
		switch (region.toUpperCase()) {
		case "US":
			host = "us.battle.net";
			break;
		case "EU":
		case "EUROPE":
			host = "eu.battle.net";
			break;
		case "KR":
		case "KOREA":
			host = "kr.battle.net";
			break;
		case "TW":
		case "TAIWAN":
			host = "tw.battle.net";
			break;
		case "CN":
		case "CHINA":
			host = "www.battle.com.cn";
			break;
		}
	}

	public URL makeUrl(String path) {
		try {
			URL url = new URL("http://" + host + path);
			System.out.println(url);
			return url;
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	public <T> T readValue(String path, Class<T> clazz) {
		try {
			return mapper.readValue(makeUrl(path), clazz);
		} catch (JsonMappingException e) {
			if (testMode) {
				System.err.println("Encountered exception while calling: " + path);
				e.printStackTrace();
			}
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public Achievement getAchievementById(long achievementId) {
		return readValue("/api/wow/achievement/" + achievementId, Achievement.class);
	}

	public Item getItemById(long itemId) {
		return readValue("/api/wow/item/" + itemId, Item.class);
	}

	public Spell getSpellById(long spellId) {
		return readValue("/api/wow/spell/" + spellId, Spell.class);
	}

	public Auction getAuctionByRealm(String realmName) {
		return readValue("/api/wow/auction/data/" + encodeUrl(realmName), Auction.class);
	}

	public BattlePetAbility getBattlePetAbilityById(long abilityId) {
		return readValue("/api/wow/battlePet/ability/" + abilityId, BattlePetAbility.class);
	}

	public BattlePetSpecies getBattlePetSpeciesById(long speciesId) {
		return readValue("/api/wow/battlePet/species/" + speciesId, BattlePetSpecies.class);
	}

	public BattlePetStats getBattlePetStatsById(long speciesId) {
		return readValue("/api/wow/battlePet/stats/" + speciesId, BattlePetStats.class);
	}

	public CharacterProfile getCharacterProfileByRealmAndName(String realmName, String characterName) {
		return readValue("/api/wow/character/" + encodeUrl(realmName) + "/" + encodeUrl(characterName), CharacterProfile.class);
	}

	public CharacterProfile getCharacterProfileWithOptions(String realmName, String characterName, CharacterProfileField... fields) {
		return getCharacterProfileWithOptions(realmName, characterName, Arrays.asList(fields));
	}

	public CharacterProfile getCharacterProfileWithOptions(String realmName, String characterName, List<CharacterProfileField> fields) {
		StringBuilder optionsParameter = new StringBuilder();
		for (CharacterProfileField option : fields) {
			if (!optionsParameter.toString().isEmpty()) {
				optionsParameter.append(",");
			}
			optionsParameter.append(option.getCharacterProfileField());
		}
		return readValue(
				"/api/wow/character/" + encodeUrl(realmName) + "/" + encodeUrl(characterName) + "?fields=" + optionsParameter,
				CharacterProfile.class);
	}

	public Quest getQuestById(long questId) {
		return readValue("/api/wow/quest/" + questId, Quest.class);
	}

	public RealmStatus getRealmStatus() {
		return readValue("/api/wow/realm/status", RealmStatus.class);
	}

	public Recipe getRecipeById(long id) {
		return readValue("/api/wow/recipe/" + id, Recipe.class);
	}

	public ChallengeSet getChallengesForRealm(String realm) {
		return readValue("/api/wow/challenge/" + realm, ChallengeSet.class);
	}

	public Pvp getPvpRankingsByBracket(Pvp.Bracket bracket) {
		return readValue("/api/wow/leaderboard/" + bracket.getBracket(), Pvp.class);
	}

	public GuildProfile getGuildProfileByRealmAndName(String realmName, String guildName, GuildProfileField... fields) {
		return getGuildProfileByRealmAndName(realmName, guildName, Arrays.asList(fields));

	}

	public GuildProfile getGuildProfileByRealmAndName(String realmName, String guildName, List<GuildProfileField> fields) {
		StringBuilder optionsParameter = new StringBuilder();
		for (GuildProfileField option : fields) {
			if (!optionsParameter.toString().isEmpty()) {
				optionsParameter.append(",");
			}
			optionsParameter.append(option.getGuildProfileField());
		}
		return readValue("/api/wow/guild/" + encodeUrl(realmName) + "/" + encodeUrl(guildName) + "?fields=" + optionsParameter, GuildProfile.class);
	}
}
