package net.papertowels.wowapi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WowApi {

	private String host;
	private ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {
		WowApi poop = new WowApi("us");
		CharacterProfile character = poop.getCharacterProfileByRealmAndName("sargeras", "papërtowels");
		System.out.println(new ReflectionToStringBuilder(character).toString());
	}

	public WowApi(String region) {
		this(region, false);
	}

	public WowApi(String region, boolean testMode) {
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

	public Auction getAuctionByRealm(String realm) {
		return readValue("/api/wow/auction/data/" + realm, Auction.class);
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
		return readValue("/api/wow/character/" + realmName + "/" + characterName, CharacterProfile.class);
	}

	public CharacterProfile getCharacterProfileWithOptions(String realmName, String characterName, CharacterProfile.CharacterProfileField ... fields) {
		return getCharacterProfileWithOptions(realmName, characterName, Arrays.asList(fields));
	}
	
	public CharacterProfile getCharacterProfileWithOptions(String realmName, String characterName, List<CharacterProfile.CharacterProfileField> fields) {
		StringBuilder optionsParameter = new StringBuilder();
		for (CharacterProfile.CharacterProfileField option : fields) {
			if (!optionsParameter.toString().isEmpty()) {
				optionsParameter.append(",");
			}
			optionsParameter.append(option.getCharacterProfileField());
		}
		return readValue("/api/wow/character/" + realmName + "/" + characterName + "?fields=" + optionsParameter, CharacterProfile.class);
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
}
