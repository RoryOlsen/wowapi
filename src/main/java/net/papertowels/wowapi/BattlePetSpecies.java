package net.papertowels.wowapi;

import java.util.List;

public class BattlePetSpecies {
	
	private List<BattlePetAbility> abilities;
	private boolean canBattle;
	private long creatureId;
	private String description;
	private String icon;
	private long petTypeId;
	private String source;
	private long speciesId;
	
	public List<BattlePetAbility> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<BattlePetAbility> abilities) {
		this.abilities = abilities;
	}
	public boolean isCanBattle() {
		return canBattle;
	}
	public void setCanBattle(boolean canBattle) {
		this.canBattle = canBattle;
	}
	public long getCreatureId() {
		return creatureId;
	}
	public void setCreatureId(long creatureId) {
		this.creatureId = creatureId;
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
	public long getPetTypeId() {
		return petTypeId;
	}
	public void setPetTypeId(long petTypeId) {
		this.petTypeId = petTypeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public long getSpeciesId() {
		return speciesId;
	}
	public void setSpeciesId(long speciesId) {
		this.speciesId = speciesId;
	}
}