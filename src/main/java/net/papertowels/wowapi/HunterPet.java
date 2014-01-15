package net.papertowels.wowapi;

public class HunterPet {

	private String calcSpec;
	private long creature;
	private long familyId;
	private String familyName;
	private String name;
	private boolean selected;
	private int slot;
	private Spec spec;

	
	public String getCalcSpec() {
		return calcSpec;
	}


	public void setCalcSpec(String calcSpec) {
		this.calcSpec = calcSpec;
	}


	public long getCreature() {
		return creature;
	}


	public void setCreature(long creature) {
		this.creature = creature;
	}


	public long getFamilyId() {
		return familyId;
	}


	public void setFamilyId(long familyId) {
		this.familyId = familyId;
	}


	public String getFamilyName() {
		return familyName;
	}


	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean getSelected() {
		return selected;
	}


	public void setSelected(boolean selected) {
		this.selected = selected;
	}


	public int getSlot() {
		return slot;
	}


	public void setSlot(int slot) {
		this.slot = slot;
	}


	public Spec getSpec() {
		return spec;
	}


	public void setSpec(Spec spec) {
		this.spec = spec;
	}


	public class Spec {
		private String backgroundImage;
		private String description;
		private String icon;
		private String name;
		private int order;
		private String role;
		
		public String getBackgroundImage() {
			return backgroundImage;
		}
		public void setBackgroundImage(String backgroundImage) {
			this.backgroundImage = backgroundImage;
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
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	}
}
