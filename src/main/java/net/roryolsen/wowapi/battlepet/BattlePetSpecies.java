package net.roryolsen.wowapi.battlepet;

import java.util.List;

public class BattlePetSpecies {
	
	public static class BattlePetSpeciesAbility {
		private int cooldown;
		private String icon;
		private long id;
		private boolean isPassive;
		private String name;
		private int order;
		private long petTypeId;
		private int requiredLevel;
		private int rounds;
		private boolean showHints;
		private int slot;
		private boolean hideHints;
		
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
		public int getOrder() {
			return order;
		}
		public void setOrder(int order) {
			this.order = order;
		}
		public long getPetTypeId() {
			return petTypeId;
		}
		public void setPetTypeId(long petTypeId) {
			this.petTypeId = petTypeId;
		}
		public int getRequiredLevel() {
			return requiredLevel;
		}
		public void setRequiredLevel(int requiredLevel) {
			this.requiredLevel = requiredLevel;
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
	private List<BattlePetSpeciesAbility> abilities;
	private boolean canBattle;
	private long creatureId;
	private String description;
	private String icon;
	private long petTypeId;
	private String source;
	private long speciesId;
	private String name;
	
	public List<BattlePetSpeciesAbility> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<BattlePetSpeciesAbility> abilities) {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}