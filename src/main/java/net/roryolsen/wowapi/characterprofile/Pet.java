package net.roryolsen.wowapi.characterprofile;

public class Pet {

	private long battlePetId;
	private boolean canBattle;
	private long creatureId;
	private String creatureName;
	private String icon;
	private boolean isFavorite;
	private long itemId;
	private String name;
	private int qualityId;
	private long spellId;
	private PetStats stats;
	private String battlePetGuid;
	private boolean isFirstAbilitySlotSelected;
	private boolean isSecondAbilitySlotSelected;
	private boolean isThirdAbilitySlotSelected;

	public boolean getIsFirstAbilitySlotSelected() {
		return isFirstAbilitySlotSelected;
	}

	public void setIsFirstAbilitySlotSelected(boolean isFirstAbilitySlotSelected) {
		this.isFirstAbilitySlotSelected = isFirstAbilitySlotSelected;
	}

	public boolean getIsSecondAbilitySlotSelected() {
		return isSecondAbilitySlotSelected;
	}

	public void setIsSecondAbilitySlotSelected(boolean isSecondAbilitySlotSelected) {
		this.isSecondAbilitySlotSelected = isSecondAbilitySlotSelected;
	}

	public boolean getIsThirdAbilitySlotSelected() {
		return isThirdAbilitySlotSelected;
	}

	public void setIsThirdAbilitySlotSelected(boolean isThirdAbilitySlotSelected) {
		this.isThirdAbilitySlotSelected = isThirdAbilitySlotSelected;
	}

	public String getBattlePetGuid() {
		return battlePetGuid;
	}

	public void setBattlePetGuid(String battlePetGuid) {
		this.battlePetGuid = battlePetGuid;
	}

	public long getBattlePetId() {
		return battlePetId;
	}

	public void setBattlePetId(long battlePetId) {
		this.battlePetId = battlePetId;
	}

	public boolean getCanBattle() {
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

	public String getCreatureName() {
		return creatureName;
	}

	public void setCreatureName(String creatureName) {
		this.creatureName = creatureName;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean getIsFavorite() {
		return isFavorite;
	}

	public void setIsFavorite(boolean isFavorite) {
		this.isFavorite = isFavorite;
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

	public PetStats getStats() {
		return stats;
	}

	public void setStats(PetStats stats) {
		this.stats = stats;
	}

	public static class PetStats {
		private long breedId;
		private int health;
		private int level;
		private int petQualityId;
		private int power;
		private long speciesId;
		private int speed;

		public long getBreedId() {
			return breedId;
		}

		public void setBreedId(long breedId) {
			this.breedId = breedId;
		}

		public int getHealth() {
			return health;
		}

		public void setHealth(int health) {
			this.health = health;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getPetQualityId() {
			return petQualityId;
		}

		public void setPetQualityId(int petQualityId) {
			this.petQualityId = petQualityId;
		}

		public int getPower() {
			return power;
		}

		public void setPower(int power) {
			this.power = power;
		}

		public long getSpeciesId() {
			return speciesId;
		}

		public void setSpeciesId(long speciesId) {
			this.speciesId = speciesId;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
	}
}
