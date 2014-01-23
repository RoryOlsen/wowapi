package net.roryolsen.wowapi.dataresource;

import java.util.List;

import net.roryolsen.wowapi.Achievement;

public class AchievementList {

	private List<AchievementCategory> achievements;

	public List<AchievementCategory> getAchievements() {
		return achievements;
	}

	public void setAchievements(List<AchievementCategory> achievements) {
		this.achievements = achievements;
	}

	public static class AchievementCategory {
		private List<Achievement> achievements;
		private List<AchievementCategory> categories;
		private long id;
		private String name;

		public List<AchievementCategory> getCategories() {
			return categories;
		}

		public void setCategories(List<AchievementCategory> categories) {
			this.categories = categories;
		}

		public List<Achievement> getAchievements() {
			return achievements;
		}

		public void setAchievements(List<Achievement> achievements) {
			this.achievements = achievements;
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

	}
}
