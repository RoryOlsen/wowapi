package net.papertowels.wowapi;

import net.papertowels.wowapi.characterprofile.CharacterProfile.CharacterProfileField;

import org.junit.Test;

public class WowApiTest {

	@Test
	public void testApiParsing() {
		WowApi api = new WowApi("us", true);
		api.getAchievementById(2144);
		api.getAuctionByRealm("sargeras");
		api.getBattlePetAbilityById(640);
		api.getBattlePetSpeciesById(258);
		api.getBattlePetStatsById(258);
		api.getCharacterProfileByRealmAndName("sargeras", "papërtowels");
		api.getItemById(18803);
		api.getQuestById(13146);
		api.getSpellById(8056);
		api.getRealmStatus();
		api.getRecipeById(33994);
		api.getCharacterProfileWithOptions("sargeras", "papërtowels", CharacterProfileField.values());
		api.getChallengesForRealm("Sargeras");
	}

}
