package net.roryolsen.wowapi.dataresource;

import java.util.List;

public class BattlegroupList {

	private List<Battlegroup> battlegroups;

	public List<Battlegroup> getBattlegroups() {
		return battlegroups;
	}

	public void setBattlegroups(List<Battlegroup> battlegroups) {
		this.battlegroups = battlegroups;
	}

	public static class Battlegroup {
		private String name;
		private String slug;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSlug() {
			return slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}

	}
}
