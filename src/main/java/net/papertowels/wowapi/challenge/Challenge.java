package net.papertowels.wowapi.challenge;

import java.util.List;

public class Challenge {
	private List<ChallengeGroup> groups;

	public static class ChallengeGroup {
		private String date;
		private String faction;
		private boolean isRecurring;
		private String medal;
		private List<Member> members;
	}

	public static class Member {
		private ChallengeMemberCharacter character;
		private ChallengeMemberSpec spec;

		public ChallengeMemberCharacter getCharacter() {
			return character;
		}

		public void setCharacter(ChallengeMemberCharacter character) {
			this.character = character;
		}

		public ChallengeMemberSpec getSpec() {
			return spec;
		}

		public void setSpec(ChallengeMemberSpec spec) {
			this.spec = spec;
		}

	}

	public static class ChallengeMemberCharacter {
		private long achievementPoints;
		private String battlegroup;
		private int characterClass;
		private int gender;
		private String guild;
		private String guildRealm;
		private int level;
		private String name;
		private int race;
		private String Realm;
		private ChallengeMemberSpec spec;
		private String thumbnail;

		public long getAchievementPoints() {
			return achievementPoints;
		}

		public void setAchievementPoints(long achievementPoints) {
			this.achievementPoints = achievementPoints;
		}

		public String getBattlegroup() {
			return battlegroup;
		}

		public void setBattlegroup(String battlegroup) {
			this.battlegroup = battlegroup;
		}

		public int getCharacterClass() {
			return characterClass;
		}

		public void setCharacterClass(int characterClass) {
			this.characterClass = characterClass;
		}

		public int getGender() {
			return gender;
		}

		public void setGender(int gender) {
			this.gender = gender;
		}

		public String getGuild() {
			return guild;
		}

		public void setGuild(String guild) {
			this.guild = guild;
		}

		public String getGuildRealm() {
			return guildRealm;
		}

		public void setGuildRealm(String guildRealm) {
			this.guildRealm = guildRealm;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRace() {
			return race;
		}

		public void setRace(int race) {
			this.race = race;
		}

		public String getRealm() {
			return Realm;
		}

		public void setRealm(String realm) {
			Realm = realm;
		}

		public ChallengeMemberSpec getSpec() {
			return spec;
		}

		public void setSpec(ChallengeMemberSpec spec) {
			this.spec = spec;
		}

		public String getThumbnail() {
			return thumbnail;
		}

		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}

	}

	public static class ChallengeMemberSpec {

	}
}
