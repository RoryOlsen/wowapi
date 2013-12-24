package net.papertowels.wowapi;

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
	}
}
