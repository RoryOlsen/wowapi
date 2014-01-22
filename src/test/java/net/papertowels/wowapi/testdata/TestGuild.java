package net.papertowels.wowapi.testdata;

public class TestGuild {

	private String region;
	private String realmName;
	private String guildName;
	
	public TestGuild(String region, String realmName, String guildName) {
		this.region = region;
		this.realmName = realmName;
		this.guildName = guildName;
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

	public String getGuildName() {
		return guildName;
	}

	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}

}
