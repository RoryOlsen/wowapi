package net.roryolsen.wowapi.dataresource;

import java.util.List;

public class BattlePetTypeList {

	private List<BattlePetType> petTypes;

	public List<BattlePetType> getPetTypes() {
		return petTypes;
	}

	public void setPetTypes(List<BattlePetType> petTypes) {
		this.petTypes = petTypes;
	}

	public static class BattlePetType {
		private long id;
		private String key;
		private String name;
		private long strongAgainstId;
		private long typeAbilityId;
		private long weakAgainstId;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getStrongAgainstId() {
			return strongAgainstId;
		}

		public void setStrongAgainstId(long strongAgainstId) {
			this.strongAgainstId = strongAgainstId;
		}

		public long getTypeAbilityId() {
			return typeAbilityId;
		}

		public void setTypeAbilityId(long typeAbilityId) {
			this.typeAbilityId = typeAbilityId;
		}

		public long getWeakAgainstId() {
			return weakAgainstId;
		}

		public void setWeakAgainstId(long weakAgainstId) {
			this.weakAgainstId = weakAgainstId;
		}

	}
}
