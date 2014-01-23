package net.roryolsen.wowapi.characterprofile;

public class Mount {

	private long CreatureId;
	private String icon;
	private boolean isAquatic;
	private boolean isFlying;
	private boolean isGround;
	private boolean isJumping;
	private long itemId;
	private String name;
	private int qualityId;
	private long spellId;
	
	public long getCreatureId() {
		return CreatureId;
	}
	public void setCreatureId(long creatureId) {
		CreatureId = creatureId;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public boolean getIsAquatic() {
		return isAquatic;
	}
	public void setIsAquatic(boolean isAquatic) {
		this.isAquatic = isAquatic;
	}
	public boolean getIsFlying() {
		return isFlying;
	}
	public void setIsFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	public boolean getIsGround() {
		return isGround;
	}
	public void setIsGround(boolean isGround) {
		this.isGround = isGround;
	}
	public boolean getIsJumping() {
		return isJumping;
	}
	public void setIsJumping(boolean isJumping) {
		this.isJumping = isJumping;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQualityId() {
		return qualityId;
	}
	public void setQualityId(int qualityId) {
		this.qualityId = qualityId;
	}
	public long getSpellId() {
		return spellId;
	}
	public void setSpellId(long spellId) {
		this.spellId = spellId;
	}
	
	
}
