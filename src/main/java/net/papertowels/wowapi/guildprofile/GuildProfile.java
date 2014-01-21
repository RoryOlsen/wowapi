package net.papertowels.wowapi.guildprofile;

import java.util.Date;
import java.util.List;

import net.papertowels.wowapi.challenge.Challenge;
import net.papertowels.wowapi.challenge.Challenge.ChallengeMemberCharacter;
import net.papertowels.wowapi.characterprofile.CharacterProfileAchievement;

public class GuildProfile {

	public static enum GuildProfileField {
		MEMBERS("members"), ACHIEVEMENTS("achievements"), NEWS("news"), CHALLENGE("challenge");

		private String guildProfileField;

		GuildProfileField(String field) {
			this.guildProfileField = field;
		}

		public String getGuildProfileField() {
			return guildProfileField;
		}
	}

	private int achievementPoints;
	private CharacterProfileAchievement achievements;
	private String battlegroup;
	private int level;
	private String name;
	private String realm;
	private Emblem emblem;
	private Date lastModified;
	private List<ChallengeMemberCharacter> members;
	private List<NewsItem> news;
	private Challenge challenge;
	private long side;

	public List<NewsItem> getNews() {
		return news;
	}

	public void setNews(List<NewsItem> news) {
		this.news = news;
	}

	public long getSide() {
		return side;
	}

	public void setSide(long side) {
		this.side = side;
	}

	public CharacterProfileAchievement getAchievements() {
		return achievements;
	}

	public void setAchievements(CharacterProfileAchievement achievements) {
		this.achievements = achievements;
	}

	public List<ChallengeMemberCharacter> getMembers() {
		return members;
	}

	public void setMembers(List<ChallengeMemberCharacter> members) {
		this.members = members;
	}

	public Challenge getChallenge() {
		return challenge;
	}

	public void setChallenge(Challenge challenge) {
		this.challenge = challenge;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public int getAchievementPoints() {
		return achievementPoints;
	}

	public void setAchievementPoints(int achievementPoints) {
		this.achievementPoints = achievementPoints;
	}

	public String getBattlegroup() {
		return battlegroup;
	}

	public void setBattlegroup(String battlegroup) {
		this.battlegroup = battlegroup;
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

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public Emblem getEmblem() {
		return emblem;
	}

	public void setEmblem(Emblem emblem) {
		this.emblem = emblem;
	}

	public class Emblem {
		private String backgroundColor;
		private int border;
		private String borderColor;
		private int icon;
		private String iconColor;

		public String getBackgroundColor() {
			return backgroundColor;
		}

		public void setBackgroundColor(String backgroundColor) {
			this.backgroundColor = backgroundColor;
		}

		public int getBorder() {
			return border;
		}

		public void setBorder(int border) {
			this.border = border;
		}

		public String getBorderColor() {
			return borderColor;
		}

		public void setBorderColor(String borderColor) {
			this.borderColor = borderColor;
		}

		public int getIcon() {
			return icon;
		}

		public void setIcon(int icon) {
			this.icon = icon;
		}

		public String getIconColor() {
			return iconColor;
		}

		public void setIconColor(String iconColor) {
			this.iconColor = iconColor;
		}
	}

	public static class NewsItem {
		private String character;
		private long itemId;
		private Date timestamp;
		private String type;
		public String getCharacter() {
			return character;
		}
		public void setCharacter(String character) {
			this.character = character;
		}
		public long getItemId() {
			return itemId;
		}
		public void setItemId(long itemId) {
			this.itemId = itemId;
		}
		public Date getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
	}
}
