package net.papertowels.wowapi;

import net.papertowels.wowapi.characterprofile.CharacterProfile.CharacterProfileField;
import net.papertowels.wowapi.guildprofile.GuildProfile.GuildProfileField;
import net.papertowels.wowapi.pvp.Pvp;
import net.papertowels.wowapi.testdata.TestCharacter;
import net.papertowels.wowapi.testdata.TestDataLoader;
import net.papertowels.wowapi.testdata.TestGuild;

import org.junit.Test;

public class WowApiTest {

	@Test
	public void testApiParsing() {
		WowApi usApi = new WowApi("us", true);
		usApi.getAchievementById(2144);
		usApi.getAuctionByRealm("sargeras");
		usApi.getBattlePetAbilityById(640);
		usApi.getBattlePetSpeciesById(258);
		usApi.getBattlePetStatsById(258);
		usApi.getCharacterProfileByRealmAndName("sargeras", "papërtowels");
		usApi.getItemById(18803);
		usApi.getQuestById(13146);
		usApi.getSpellById(8056);
		usApi.getRealmStatus();
		usApi.getRecipeById(33994);
		usApi.getChallengesForRealm("Sargeras");
		for (Pvp.Bracket bracket : Pvp.Bracket.values()) {
			usApi.getPvpRankingsByBracket(bracket);
		}
	}

	@Test
	public void testApiParsingForCharacters() {
		for (TestCharacter testCharacter : new TestDataLoader().generateTestCharacterList()) {
			WowApi api = new WowApi(testCharacter.getRegion(), true);
			api.getCharacterProfileWithOptions(testCharacter.getRealmName(), testCharacter.getCharacterName(), CharacterProfileField.values());
			api.getCharacterProfileByRealmAndName(testCharacter.getRealmName(), testCharacter.getCharacterName());
		}
	}

	@Test
	public void testApiParsingForGuilds() {
		for (TestGuild testGuild : new TestDataLoader().generateTestGuildList()) {
			WowApi api = new WowApi(testGuild.getRegion(), true);
			api.getGuildProfileByRealmAndName(testGuild.getRealmName(), testGuild.getGuildName(), GuildProfileField.values());
		}
	}
}
