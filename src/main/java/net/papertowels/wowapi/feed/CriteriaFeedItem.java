package net.papertowels.wowapi.feed;

public class CriteriaFeedItem extends FeedItem {

	private Achievement achievement;
	private Criteria criteria;
	private boolean featOfStrength;
	private String name;
	private int quantity;

	public Achievement getAchievement() {
		return achievement;
	}

	public void setAchievement(Achievement achievement) {
		this.achievement = achievement;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	public boolean getFeatOfStrength() {
		return featOfStrength;
	}

	public void setFeatOfStrength(boolean featOfStrength) {
		this.featOfStrength = featOfStrength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
