package net.roryolsen.wowapi;

public class Quest {

	private String category;
	private long id;
	private int level;
	private int reqLevel;
	private int suggestedPartyMembers;
	private String title;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getReqLevel() {
		return reqLevel;
	}
	public void setReqLevel(int reqLevel) {
		this.reqLevel = reqLevel;
	}
	public int getSuggestedPartyMembers() {
		return suggestedPartyMembers;
	}
	public void setSuggestedPartyMembers(int suggestedPartyMembers) {
		this.suggestedPartyMembers = suggestedPartyMembers;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
