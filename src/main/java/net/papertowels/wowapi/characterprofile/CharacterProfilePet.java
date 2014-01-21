package net.papertowels.wowapi.characterprofile;

import java.util.List;

public class CharacterProfilePet {

	private List<Pet> collected;
	private int numCollected;
	private int numNotCollected;
	
	public List<Pet> getCollected() {
		return collected;
	}
	public void setCollected(List<Pet> collected) {
		this.collected = collected;
	}
	public int getNumCollected() {
		return numCollected;
	}
	public void setNumCollected(int numCollected) {
		this.numCollected = numCollected;
	}
	public int getNumNotCollected() {
		return numNotCollected;
	}
	public void setNumNotCollected(int numNotCollected) {
		this.numNotCollected = numNotCollected;
	}
}
