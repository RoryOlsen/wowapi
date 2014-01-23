package net.roryolsen.wowapi;

import java.util.List;

public class Item {

	private List<Integer> allowableClasses;
	private int armor;
	private int baseArmor;
	private List<BonusStat> bonusStats;
	private long buyPrice;
	private int containerSlots;
	private String description;
	private int disenchantingSkillRank;
	private int displayInfoId;
	private boolean equippable;
	private boolean hasSockets;
	private boolean heroicTooltip;
	private String icon;
	private long id;
	private int inventoryType;
	private boolean isAuctionable;
	private int itemBind;
	private int itemClass;
	private int itemLevel;
	private ItemSet itemSet;
	private ItemSource itemSource;
	private List<Object> itemSpells;
	private int itemSubClass;
	private int maxCount;
	private int maxDurability;
	private int minReputation;
	private String name;
	private String nameDescription;
	private String nameDescriptionColor;
	private int quality;
	private int requiredLevel;
	private int requiredSkill;
	private int requiredSkillRank;
	private int sellPrice;
	private SocketInfo socketInfo;
	private int stackable;
	private boolean upgradable;
	private WeaponInfo weaponInfo;
	private long minFactionId;
	
	

	public ItemSet getItemSet() {
		return itemSet;
	}

	public void setItemSet(ItemSet itemSet) {
		this.itemSet = itemSet;
	}

	public List<Integer> getAllowableClasses() {
		return allowableClasses;
	}

	public void setAllowableClasses(List<Integer> allowableClasses) {
		this.allowableClasses = allowableClasses;
	}

	public SocketInfo getSocketInfo() {
		return socketInfo;
	}

	public void setSocketInfo(SocketInfo socketInfo) {
		this.socketInfo = socketInfo;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getBaseArmor() {
		return baseArmor;
	}

	public void setBaseArmor(int baseArmor) {
		this.baseArmor = baseArmor;
	}

	public List<BonusStat> getBonusStats() {
		return bonusStats;
	}

	public void setBonusStats(List<BonusStat> bonusStats) {
		this.bonusStats = bonusStats;
	}

	public long getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(long buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getContainerSlots() {
		return containerSlots;
	}

	public void setContainerSlots(int containerSlots) {
		this.containerSlots = containerSlots;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDisenchantingSkillRank() {
		return disenchantingSkillRank;
	}

	public void setDisenchantingSkillRank(int disenchantingSkillRank) {
		this.disenchantingSkillRank = disenchantingSkillRank;
	}

	public int getDisplayInfoId() {
		return displayInfoId;
	}

	public void setDisplayInfoId(int displayInfoId) {
		this.displayInfoId = displayInfoId;
	}

	public boolean isEquippable() {
		return equippable;
	}

	public void setEquippable(boolean equipable) {
		this.equippable = equipable;
	}

	public boolean isHasSockets() {
		return hasSockets;
	}

	public void setHasSockets(boolean hasSockets) {
		this.hasSockets = hasSockets;
	}

	public boolean isHeroicTooltip() {
		return heroicTooltip;
	}

	public void setHeroicTooltip(boolean heroicTooltip) {
		this.heroicTooltip = heroicTooltip;
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

	public int getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(int inventoryType) {
		this.inventoryType = inventoryType;
	}

	public boolean getIsAuctionable() {
		return isAuctionable;
	}

	public void setIsAuctionable(boolean isAuctionable) {
		this.isAuctionable = isAuctionable;
	}

	public int getItemBind() {
		return itemBind;
	}

	public void setItemBind(int itemBind) {
		this.itemBind = itemBind;
	}

	public int getItemClass() {
		return itemClass;
	}

	public void setItemClass(int itemClass) {
		this.itemClass = itemClass;
	}

	public int getItemLevel() {
		return itemLevel;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}

	public ItemSource getItemSource() {
		return itemSource;
	}

	public void setItemSource(ItemSource itemSource) {
		this.itemSource = itemSource;
	}

	public List<Object> getItemSpells() {
		return itemSpells;
	}

	public void setItemSpells(List<Object> itemSpells) {
		this.itemSpells = itemSpells;
	}

	public int getItemSubClass() {
		return itemSubClass;
	}

	public void setItemSubClass(int itemSubClass) {
		this.itemSubClass = itemSubClass;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public int getMaxDurability() {
		return maxDurability;
	}

	public void setMaxDurability(int maxDurability) {
		this.maxDurability = maxDurability;
	}

	public int getMinReputation() {
		return minReputation;
	}

	public void setMinReputation(int minReputation) {
		this.minReputation = minReputation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameDescription() {
		return nameDescription;
	}

	public void setNameDescription(String nameDescription) {
		this.nameDescription = nameDescription;
	}

	public String getNameDescriptionColor() {
		return nameDescriptionColor;
	}

	public void setNameDescriptionColor(String nameDescriptionColor) {
		this.nameDescriptionColor = nameDescriptionColor;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getRequiredLevel() {
		return requiredLevel;
	}

	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}

	public int getRequiredSkill() {
		return requiredSkill;
	}

	public void setRequiredSkill(int requiredSkill) {
		this.requiredSkill = requiredSkill;
	}

	public int getRequiredSkillRank() {
		return requiredSkillRank;
	}

	public void setRequiredSkillRank(int requiredSkillRank) {
		this.requiredSkillRank = requiredSkillRank;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public int getStackable() {
		return stackable;
	}

	public void setStackable(int stackable) {
		this.stackable = stackable;
	}

	public boolean isUpgradable() {
		return upgradable;
	}

	public void setUpgradable(boolean upgradable) {
		this.upgradable = upgradable;
	}

	public WeaponInfo getWeaponInfo() {
		return weaponInfo;
	}

	public void setWeaponInfo(WeaponInfo weaponInfo) {
		this.weaponInfo = weaponInfo;
	}

	public long getMinFactionId() {
		return minFactionId;
	}

	public void setMinFactionId(long minFactionId) {
		this.minFactionId = minFactionId;
	}

	public static class SocketInfo {
		private String socketBonus;
		private List<SocketType> sockets;

		public String getSocketBonus() {
			return socketBonus;
		}

		public void setSocketBonus(String socketBonus) {
			this.socketBonus = socketBonus;
		}

		public List<SocketType> getSockets() {
			return sockets;
		}

		public void setSockets(List<SocketType> sockets) {
			this.sockets = sockets;
		}

	}

	public static class SocketType {
		private String type;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class ItemSet {
		private long id;
		private List<Long> items;
		private String name;
		private List<SetBonus> setBonuses;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public List<Long> getItems() {
			return items;
		}

		public void setItems(List<Long> items) {
			this.items = items;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<SetBonus> getSetBonuses() {
			return setBonuses;
		}

		public void setSetBonuses(List<SetBonus> setBonuses) {
			this.setBonuses = setBonuses;
		}

	}

	public static class SetBonus {
		private String description;
		private int threshold;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getThreshold() {
			return threshold;
		}

		public void setThreshold(int threshold) {
			this.threshold = threshold;
		}
	}
}
