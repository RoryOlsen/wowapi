package net.papertowels.wowapi.pvp;

import java.util.List;

public class Pvp {

	public static enum Bracket {
		TWOVTWO("2v2"), THREEVTHREE("3v3"), FIVEVFIVE("5v5"), RBG("rbg");

		private String bracket;

		Bracket(String bracket) {
			this.bracket = bracket;
		}

		public String getBracket() {
			return bracket;
		}

	}

	private List<PvpPlayer> rows;

	public List<PvpPlayer> getRows() {
		return rows;
	}

	public void setRows(List<PvpPlayer> rows) {
		this.rows = rows;
	}

	public static class PvpPlayer {
		private int classId;
		private int factionId;
		private int genderId;
		private String name;
		private int raceId;
		private long ranking;
		private long rating;
		private long realmId;
		private String realmName;
		private String realmSlug;
		private int seasonLosses;
		private int seasonWins;
		private long specId;
		private int weeklyLosses;
		private int weeklyWins;

		public int getClassId() {
			return classId;
		}

		public void setClassId(int classId) {
			this.classId = classId;
		}

		public int getFactionId() {
			return factionId;
		}

		public void setFactionId(int factionId) {
			this.factionId = factionId;
		}

		public int getGenderId() {
			return genderId;
		}

		public void setGenderId(int genderId) {
			this.genderId = genderId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRaceId() {
			return raceId;
		}

		public void setRaceId(int raceId) {
			this.raceId = raceId;
		}

		public long getRanking() {
			return ranking;
		}

		public void setRanking(long ranking) {
			this.ranking = ranking;
		}

		public long getRating() {
			return rating;
		}

		public void setRating(long rating) {
			this.rating = rating;
		}

		public long getRealmId() {
			return realmId;
		}

		public void setRealmId(long realmId) {
			this.realmId = realmId;
		}

		public String getRealmName() {
			return realmName;
		}

		public void setRealmName(String realmName) {
			this.realmName = realmName;
		}

		public String getRealmSlug() {
			return realmSlug;
		}

		public void setRealmSlug(String realmSlug) {
			this.realmSlug = realmSlug;
		}

		public int getSeasonLosses() {
			return seasonLosses;
		}

		public void setSeasonLosses(int seasonLosses) {
			this.seasonLosses = seasonLosses;
		}

		public int getSeasonWins() {
			return seasonWins;
		}

		public void setSeasonWins(int seasonWins) {
			this.seasonWins = seasonWins;
		}

		public long getSpecId() {
			return specId;
		}

		public void setSpecId(long specId) {
			this.specId = specId;
		}

		public int getWeeklyLosses() {
			return weeklyLosses;
		}

		public void setWeeklyLosses(int weeklyLosses) {
			this.weeklyLosses = weeklyLosses;
		}

		public int getWeeklyWins() {
			return weeklyWins;
		}

		public void setWeeklyWins(int weeklyWins) {
			this.weeklyWins = weeklyWins;
		}

	}
}
