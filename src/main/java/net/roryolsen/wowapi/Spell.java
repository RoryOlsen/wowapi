package net.roryolsen.wowapi;

public class Spell {

	private String castTime;
	private String cooldown;
	private String description;
	private String icon;
	private long id;
	private String name;
	private String powerCost;
	private String range;
	
	public String getCastTime() {
		return castTime;
	}
	public void setCastTime(String castTime) {
		this.castTime = castTime;
	}
	public String getCooldown() {
		return cooldown;
	}
	public void setCooldown(String cooldown) {
		this.cooldown = cooldown;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPowerCost() {
		return powerCost;
	}
	public void setPowerCost(String powerCost) {
		this.powerCost = powerCost;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
}
