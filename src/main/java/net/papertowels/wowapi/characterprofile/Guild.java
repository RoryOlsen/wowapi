package net.papertowels.wowapi.characterprofile;

import java.util.Date;

public class Guild {

	private int achievementPoints;
	private String battlegroup;
	private int level;
	private int members;
	private String name;
	private String realm;
	private Emblem emblem;
	private Date lastModified;

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

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
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
}
