package net.papertowels.wowapi.characterprofile;

import java.util.List;

public class PetSlot {

	private List<Long> abilities;
	private String battlePetGuid;
	private boolean isEmpty;
	private boolean isLocked;
	private int slot;
	
	public List<Long> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<Long> abilities) {
		this.abilities = abilities;
	}
	public String getBattlePetGuid() {
		return battlePetGuid;
	}
	public void setBattlePetGuid(String battlePetGuid) {
		this.battlePetGuid = battlePetGuid;
	}
	public boolean getIsEmpty() {
		return isEmpty;
	}
	public void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public boolean getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	
}
