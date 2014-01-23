package net.roryolsen.wowapi.challenge;

import java.util.List;

import net.roryolsen.wowapi.characterprofile.Guild;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Challenge {
	private List<ChallengeGroup> groups;
	private ChallengeMap map;
	private ChallengeRealm realm;

	public ChallengeRealm getRealm() {
		return realm;
	}

	public void setRealm(ChallengeRealm realm) {
		this.realm = realm;
	}

	public ChallengeMap getMap() {
		return map;
	}

	public void setMap(ChallengeMap map) {
		this.map = map;
	}

	public List<ChallengeGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<ChallengeGroup> groups) {
		this.groups = groups;
	}

	public static class ChallengeGroup {
		private String date;
		private String faction;
		private boolean isRecurring;
		private String medal;
		private List<Member> members;
		private int ranking;
		private ChallengeTime time;
		private Guild guild;

		public Guild getGuild() {
			return guild;
		}

		public void setGuild(Guild guild) {
			this.guild = guild;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getFaction() {
			return faction;
		}

		public void setFaction(String faction) {
			this.faction = faction;
		}

		public boolean getIsRecurring() {
			return isRecurring;
		}

		public void setIsRecurring(boolean isRecurring) {
			this.isRecurring = isRecurring;
		}

		public String getMedal() {
			return medal;
		}

		public void setMedal(String medal) {
			this.medal = medal;
		}

		public List<Member> getMembers() {
			return members;
		}

		public void setMembers(List<Member> members) {
			this.members = members;
		}

		public int getRanking() {
			return ranking;
		}

		public void setRanking(int ranking) {
			this.ranking = ranking;
		}

		public ChallengeTime getTime() {
			return time;
		}

		public void setTime(ChallengeTime time) {
			this.time = time;
		}

	}

	public static class Member {
		private ChallengeMemberCharacter character;
		private ChallengeMemberSpec spec;
		private long rank;

		public ChallengeMemberSpec getSpec() {
			return spec;
		}

		public void setSpec(ChallengeMemberSpec spec) {
			this.spec = spec;
		}

		public long getRank() {
			return rank;
		}

		public void setRank(long rank) {
			this.rank = rank;
		}

		public ChallengeMemberCharacter getCharacter() {
			return character;
		}

		public void setCharacter(ChallengeMemberCharacter character) {
			this.character = character;
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

		@JsonGetter("class")
		public int getCharacterClass() {
			return characterClass;
		}

		@JsonSetter("class")
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
		private String backgroundImage;
		private String description;
		private String icon;
		private String name;
		private int order;
		private String role;

		public String getBackgroundImage() {
			return backgroundImage;
		}

		public void setBackgroundImage(String backgroundImage) {
			this.backgroundImage = backgroundImage;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getOrder() {
			return order;
		}

		public void setOrder(int order) {
			this.order = order;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

	}

	public static class ChallengeTime {
		private int hours;
		private boolean isPositive;
		private long milliseconds;
		private int minutes;
		private long seconds;
		private long time;

		public int getHours() {
			return hours;
		}

		public void setHours(int hours) {
			this.hours = hours;
		}

		public boolean getIsPositive() {
			return isPositive;
		}

		public void setIsPositive(boolean isPositive) {
			this.isPositive = isPositive;
		}

		public long getMilliseconds() {
			return milliseconds;
		}

		public void setMilliseconds(long milliseconds) {
			this.milliseconds = milliseconds;
		}

		public int getMinutes() {
			return minutes;
		}

		public void setMinutes(int minutes) {
			this.minutes = minutes;
		}

		public long getSeconds() {
			return seconds;
		}

		public void setSeconds(long seconds) {
			this.seconds = seconds;
		}

		public long getTime() {
			return time;
		}

		public void setTime(long time) {
			this.time = time;
		}

	}

	public static class ChallengeMap {
		private ChallengeTime bronzeCriteria;
		private ChallengeTime goldCriteria;
		private boolean hasChallengeMode;
		private long id;
		private String name;
		private ChallengeTime silverCriteria;
		private String slug;

		public ChallengeTime getBronzeCriteria() {
			return bronzeCriteria;
		}

		public void setBronzeCriteria(ChallengeTime bronzeCriteria) {
			this.bronzeCriteria = bronzeCriteria;
		}

		public ChallengeTime getGoldCriteria() {
			return goldCriteria;
		}

		public void setGoldCriteria(ChallengeTime goldCriteria) {
			this.goldCriteria = goldCriteria;
		}

		public boolean getHasChallengeMode() {
			return hasChallengeMode;
		}

		public void setHasChallengeMode(boolean hasChallengeMode) {
			this.hasChallengeMode = hasChallengeMode;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ChallengeTime getSilverCriteria() {
			return silverCriteria;
		}

		public void setSilverCriteria(ChallengeTime silverCriteria) {
			this.silverCriteria = silverCriteria;
		}

		public String getSlug() {
			return slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}
	}

	public static class ChallengeRealm {
		private String battlegroup;
		private String locale;
		private String name;
		private String slug;
		private String timezone;

		public String getBattlegroup() {
			return battlegroup;
		}

		public void setBattlegroup(String battlegroup) {
			this.battlegroup = battlegroup;
		}

		public String getLocale() {
			return locale;
		}

		public void setLocale(String locale) {
			this.locale = locale;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSlug() {
			return slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}

		public String getTimezone() {
			return timezone;
		}

		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}

	}
}
