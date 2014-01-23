package net.roryolsen.wowapi;

import java.util.List;

import net.roryolsen.wowapi.characterprofile.CharacterProfile;
import net.roryolsen.wowapi.characterprofile.CharacterProfile.CharacterProfileField;
import net.roryolsen.wowapi.characterprofile.Talent;
import net.roryolsen.wowapi.characterprofile.Talent.TalentSelection;
import net.roryolsen.wowapi.guildprofile.GuildProfile.GuildProfileField;
import net.roryolsen.wowapi.pvp.Pvp;
import net.roryolsen.wowapi.testdata.TestCharacter;
import net.roryolsen.wowapi.testdata.TestDataLoader;
import net.roryolsen.wowapi.testdata.TestGuild;

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
		CharacterProfile profile = usApi.getCharacterProfileWithOptions("sargeras", "papërtowels", CharacterProfileField.values());
		List<Talent> talents = profile.getTalents();
		List<TalentSelection> selections = talents.get(0).getTalents();
		usApi.getSpellById(selections.get(0).getSpell().getId());
		
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
