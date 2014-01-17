package net.papertowels.wowapi;

import java.util.List;

public class CharacterProfileMounts {

	private List<Mount> collected;
	private int numCollected;
	private int numNotCollected;

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

	public List<Mount> getCollected() {
		return collected;
	}

	public void setCollected(List<Mount> mounts) {
		this.collected = mounts;
	}
}
