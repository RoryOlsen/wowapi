package net.papertowels.wowapi.testdata;

public class TestCharacter {

	private String region;
	private String realmName;
	private String characterName;

	public TestCharacter(String region, String realmName, String characterName) {
		this.region = region;
		this.realmName = realmName;
		this.characterName = characterName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRealmName() {
		return realmName;
	}

	public void setRealmName(String realmName) {
		this.realmName = realmName;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

}
