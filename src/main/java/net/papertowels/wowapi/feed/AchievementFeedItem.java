package net.papertowels.wowapi.feed;

public class AchievementFeedItem extends FeedItem {

	private Achievement achievement;
	private boolean featOfStrength;

	public Achievement getAchievement() {
		return achievement;
	}

	public void setAchievement(Achievement achievement) {
		this.achievement = achievement;
	}

	public boolean getFeatOfStrength() {
		return featOfStrength;
	}

	public void setFeatOfStrength(boolean featOfStrength) {
		this.featOfStrength = featOfStrength;
	}

}
