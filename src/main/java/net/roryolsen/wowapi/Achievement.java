package net.roryolsen.wowapi;

import java.util.List;

import net.roryolsen.wowapi.characterprofile.AchievementCriteria;

public class Achievement {

	private String title;
	private boolean accountWide;
	private List<AchievementCriteria> criteria;
	private String description;
	private String icon;
	private long id;
	private int points;
	private String reward;
	private List<RewardItem> rewardItems;
	private int factionId;
	
	public int getFactionId() {
		return factionId;
	}
	public void setFactionId(int factionId) {
		this.factionId = factionId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isAccountWide() {
		return accountWide;
	}
	public void setAccountWide(boolean accountWide) {
		this.accountWide = accountWide;
	}
	public List<AchievementCriteria> getCriteria() {
		return criteria;
	}
	public void setCriteria(List<AchievementCriteria> criteria) {
		this.criteria = criteria;
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
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public List<RewardItem> getRewardItems() {
		return rewardItems;
	}
	public void setRewardItems(List<RewardItem> rewardItems) {
		this.rewardItems = rewardItems;
	}	
	
}
