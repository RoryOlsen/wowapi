package net.roryolsen.wowapi.characterprofile;

public class Reputation {

	private long id;
	private long max;
	private String name;
	private int standing;
	private long value;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getMax() {
		return max;
	}
	public void setMax(long max) {
		this.max = max;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStanding() {
		return standing;
	}
	public void setStanding(int standing) {
		this.standing = standing;
	}
	public long getValue() {
		return value;
	}
	public void setValue(long value) {
		this.value = value;
	}
	
	
}
