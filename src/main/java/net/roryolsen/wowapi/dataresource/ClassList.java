package net.roryolsen.wowapi.dataresource;

import java.util.List;

public class ClassList {

	private List<CharacterClass> classes;

	public List<CharacterClass> getClasses() {
		return classes;
	}

	public void setClasses(List<CharacterClass> classes) {
		this.classes = classes;
	}

	public static class CharacterClass {
		private long id;
		private long mask;
		private String name;
		private String powerType;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getMask() {
			return mask;
		}

		public void setMask(long mask) {
			this.mask = mask;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPowerType() {
			return powerType;
		}

		public void setPowerType(String powerType) {
			this.powerType = powerType;
		}

	}

}
