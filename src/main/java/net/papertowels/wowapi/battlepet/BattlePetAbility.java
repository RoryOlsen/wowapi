package net.papertowels.wowapi.battlepet;


public class BattlePetAbility {
	private int cooldown;
	private String icon;
	private long id;
	private boolean isPassive;
	private String name;
	private long petTypeId;
	private int rounds;
	private boolean showHints;
	private boolean hideHints;
	private int slot;
	
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
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
	public boolean getIsPassive() {
		return isPassive;
	}
	public void setIsPassive(boolean isPassive) {
		this.isPassive = isPassive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPetTypeId() {
		return petTypeId;
	}
	public void setPetTypeId(long petTypeId) {
		this.petTypeId = petTypeId;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getShowHints() {
		return showHints;
	}
	public void setShowHints(boolean showHints) {
		this.showHints = showHints;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public boolean getHideHints() {
		return hideHints;
	}
	public void setHideHints(boolean hideHints) {
		this.hideHints = hideHints;
	}
}