package net.papertowels.wowapi.characterprofile.feed;

import java.util.List;

public class Achievement {

	private boolean accountWide;
	private List<Criteria> criteria;
	private String description;
	private int factionId;
	private String icon;
	private long id;
	private int points;
	private List<Object> rewardItems;
	private String title;
	
	public boolean getAccountWide() {
		return accountWide;
	}
	public void setAccountWide(boolean accountWide) {
		this.accountWide = accountWide;
	}
	public List<Criteria> getCriteria() {
		return criteria;
	}
	public void setCriteria(List<Criteria> criteria) {
		this.criteria = criteria;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFactionId() {
		return factionId;
	}
	public void setFactionId(int factionId) {
		this.factionId = factionId;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public List<Object> getRewardItems() {
		return rewardItems;
	}
	public void setRewardItems(List<Object> rewardItems) {
		this.rewardItems = rewardItems;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
