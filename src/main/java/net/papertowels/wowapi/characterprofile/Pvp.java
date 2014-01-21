package net.papertowels.wowapi.characterprofile;

import java.util.Map;

public class Pvp {

	private Map<String, Bracket> brackets;

	public Map<String, Bracket> getBrackets() {
		return brackets;
	}

	public void setBrackets(Map<String, Bracket> brackets) {
		this.brackets = brackets;
	}

	public static class Bracket {
		private int rating;
		private int seasonLost;
		private int seasonPlayed;
		private int seasonWon;
		private String slug;
		private int weeklyLost;
		private int weeklyPlayed;
		private int weeklyWon;

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public int getSeasonLost() {
			return seasonLost;
		}

		public void setSeasonLost(int seasonLost) {
			this.seasonLost = seasonLost;
		}

		public int getSeasonPlayed() {
			return seasonPlayed;
		}

		public void setSeasonPlayed(int seasonPlayed) {
			this.seasonPlayed = seasonPlayed;
		}

		public int getSeasonWon() {
			return seasonWon;
		}

		public void setSeasonWon(int seasonWon) {
			this.seasonWon = seasonWon;
		}

		public String getSlug() {
			return slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}

		public int getWeeklyLost() {
			return weeklyLost;
		}

		public void setWeeklyLost(int weeklyLost) {
			this.weeklyLost = weeklyLost;
		}

		public int getWeeklyPlayed() {
			return weeklyPlayed;
		}

		public void setWeeklyPlayed(int weeklyPlayed) {
			this.weeklyPlayed = weeklyPlayed;
		}

		public int getWeeklyWon() {
			return weeklyWon;
		}

		public void setWeeklyWon(int weeklyWon) {
			this.weeklyWon = weeklyWon;
		}

	}
}
