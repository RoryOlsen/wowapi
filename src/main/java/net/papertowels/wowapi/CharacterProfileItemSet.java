package net.papertowels.wowapi;

import java.util.List;

public class CharacterProfileItemSet {

	private int averageItemLevel;
	private int averageItemLevelEquipped;
	private CharacterProfileItem back; 
	private CharacterProfileItem chest;
	private CharacterProfileItem feet;
	private CharacterProfileItem finger1;
	private CharacterProfileItem finger2;
	private CharacterProfileItem hands;
	private CharacterProfileItem head;
	private CharacterProfileItem legs;
	private CharacterProfileItem mainHand;
	private CharacterProfileItem neck;
	private CharacterProfileItem shoulder;
	private CharacterProfileItem trinket1;
	private CharacterProfileItem trinket2;
	private CharacterProfileItem waist;
	private CharacterProfileItem wrist;
	
	
	public int getAverageItemLevel() {
		return averageItemLevel;
	}

	public void setAverageItemLevel(int averageItemLevel) {
		this.averageItemLevel = averageItemLevel;
	}

	public int getAverageItemLevelEquipped() {
		return averageItemLevelEquipped;
	}

	public void setAverageItemLevelEquipped(int averageItemLevelEquipped) {
		this.averageItemLevelEquipped = averageItemLevelEquipped;
	}

	public CharacterProfileItem getBack() {
		return back;
	}

	public void setBack(CharacterProfileItem back) {
		this.back = back;
	}

	public CharacterProfileItem getChest() {
		return chest;
	}

	public void setChest(CharacterProfileItem chest) {
		this.chest = chest;
	}

	public CharacterProfileItem getFeet() {
		return feet;
	}

	public void setFeet(CharacterProfileItem feet) {
		this.feet = feet;
	}

	public CharacterProfileItem getFinger1() {
		return finger1;
	}

	public void setFinger1(CharacterProfileItem finger1) {
		this.finger1 = finger1;
	}

	public CharacterProfileItem getFinger2() {
		return finger2;
	}

	public void setFinger2(CharacterProfileItem finger2) {
		this.finger2 = finger2;
	}

	public CharacterProfileItem getHands() {
		return hands;
	}

	public void setHands(CharacterProfileItem hands) {
		this.hands = hands;
	}

	public CharacterProfileItem getHead() {
		return head;
	}

	public void setHead(CharacterProfileItem head) {
		this.head = head;
	}

	public CharacterProfileItem getLegs() {
		return legs;
	}

	public void setLegs(CharacterProfileItem legs) {
		this.legs = legs;
	}

	public CharacterProfileItem getMainHand() {
		return mainHand;
	}

	public void setMainHand(CharacterProfileItem mainHand) {
		this.mainHand = mainHand;
	}

	public CharacterProfileItem getNeck() {
		return neck;
	}

	public void setNeck(CharacterProfileItem neck) {
		this.neck = neck;
	}

	public CharacterProfileItem getShoulder() {
		return shoulder;
	}

	public void setShoulder(CharacterProfileItem shoulder) {
		this.shoulder = shoulder;
	}

	public CharacterProfileItem getTrinket1() {
		return trinket1;
	}

	public void setTrinket1(CharacterProfileItem trinket1) {
		this.trinket1 = trinket1;
	}

	public CharacterProfileItem getTrinket2() {
		return trinket2;
	}

	public void setTrinket2(CharacterProfileItem trinket2) {
		this.trinket2 = trinket2;
	}

	public CharacterProfileItem getWaist() {
		return waist;
	}

	public void setWaist(CharacterProfileItem waist) {
		this.waist = waist;
	}

	public CharacterProfileItem getWrist() {
		return wrist;
	}

	public void setWrist(CharacterProfileItem wrist) {
		this.wrist = wrist;
	}

	public class CharacterProfileItem {
		private int armor;
		private String icon;
		private long id;
		private String name;
		private int quality;
		private List<CharacterProfileItemStats> stats;
		private ToolTip toolTipParams;
		
		public int getArmor() {
			return armor;
		}
		public void setArmor(int armor) {
			this.armor = armor;
		}
		public List<CharacterProfileItemStats> getStats() {
			return stats;
		}
		public void setStats(List<CharacterProfileItemStats> stats) {
			this.stats = stats;
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
		public int getQuality() {
			return quality;
		}
		public void setQuality(int quality) {
			this.quality = quality;
		}
		public ToolTip getToolTipParams() {
			return toolTipParams;
		}
		public void setToolTipParams(ToolTip toolTipParams) {
			this.toolTipParams = toolTipParams;
		}
	}
	
	public static class CharacterProfileItemStats {
		private int amount;
		private int stat;
		
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public int getStat() {
			return stat;
		}
		public void setStat(int stat) {
			this.stat = stat;
		}
	}
	public static class ToolTip {
		private int reforge;
		private long enchant;
		private long gem0;
		private long gem1;
		private long gem2;
		private List<Long> set;
		private long transmogItem;
		private boolean extraSocket;
		private Upgrade upgrade;
		

		public boolean getExtraSocket() {
			return extraSocket;
		}

		public void setExtraSocket(boolean extraSocket) {
			this.extraSocket = extraSocket;
		}

		public long getEnchant() {
			return enchant;
		}

		public void setEnchant(long enchant) {
			this.enchant = enchant;
		}

		public long getGem0() {
			return gem0;
		}

		public void setGem0(long gem0) {
			this.gem0 = gem0;
		}

		public long getGem1() {
			return gem1;
		}

		public void setGem1(long gem1) {
			this.gem1 = gem1;
		}

		public long getGem2() {
			return gem2;
		}

		public void setGem2(long gem2) {
			this.gem2 = gem2;
		}

		public List<Long> getSet() {
			return set;
		}

		public void setSet(List<Long> set) {
			this.set = set;
		}

		public long getTransmogItem() {
			return transmogItem;
		}

		public void setTransmogItem(long transmogItem) {
			this.transmogItem = transmogItem;
		}

		public Upgrade getUpgrade() {
			return upgrade;
		}

		public void setUpgrade(Upgrade upgrade) {
			this.upgrade = upgrade;
		}

		public int getReforge() {
			return reforge;
		}

		public void setReforge(int reforge) {
			this.reforge = reforge;
		}
	}
	
	public static class Upgrade {
		private long current;
		private long itemLevelIncrement;
		private int total;
		
		public long getCurrent() {
			return current;
		}
		public void setCurrent(long current) {
			this.current = current;
		}
		public long getItemLevelIncrement() {
			return itemLevelIncrement;
		}
		public void setItemLevelIncrement(long itemLevelIncrement) {
			this.itemLevelIncrement = itemLevelIncrement;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
	}
}
