package net.papertowels.wowapi;

import java.util.Date;
import java.util.List;

public class Progression {

	private List<Raid> raids;

	public List<Raid> getRaids() {
		return raids;
	}

	public void setRaids(List<Raid> raids) {
		this.raids = raids;
	}

	public static class Raid {
		private List<Boss> bosses;
		private int heroic;
		private long id;
		private String name;
		private int normal;

		public List<Boss> getBosses() {
			return bosses;
		}

		public void setBosses(List<Boss> bosses) {
			this.bosses = bosses;
		}

		public int getHeroic() {
			return heroic;
		}

		public void setHeroic(int heroic) {
			this.heroic = heroic;
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

		public int getNormal() {
			return normal;
		}

		public void setNormal(int normal) {
			this.normal = normal;
		}

	}

	public static class Boss {
		private long id;
		private String name;
		private int normalKills;
		private Date normalTimestamp;
		private int heroicKills;
		private Date heroicTimestamp;
		private int lfrKills;
		private Date lfrTimestamp;
		private int flexKills;
		private Date flexTimestamp;

		public int getFlexKills() {
			return flexKills;
		}

		public void setFlexKills(int flexKills) {
			this.flexKills = flexKills;
		}

		public Date getFlexTimestamp() {
			return flexTimestamp;
		}

		public void setFlexTimestamp(Date flexTimestamp) {
			this.flexTimestamp = flexTimestamp;
		}

		public int getLfrKills() {
			return lfrKills;
		}

		public void setLfrKills(int lfrKills) {
			this.lfrKills = lfrKills;
		}

		public Date getLfrTimestamp() {
			return lfrTimestamp;
		}

		public void setLfrTimestamp(Date lfrTimestamp) {
			this.lfrTimestamp = lfrTimestamp;
		}

		public Date getHeroicTimestamp() {
			return heroicTimestamp;
		}

		public void setHeroicTimestamp(Date heroicTimestamp) {
			this.heroicTimestamp = heroicTimestamp;
		}

		public int getHeroicKills() {
			return heroicKills;
		}

		public void setHeroicKills(int heroicKills) {
			this.heroicKills = heroicKills;
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

		public int getNormalKills() {
			return normalKills;
		}

		public void setNormalKills(int normalKills) {
			this.normalKills = normalKills;
		}

		public Date getNormalTimestamp() {
			return normalTimestamp;
		}

		public void setNormalTimestamp(Date normalTimestamp) {
			this.normalTimestamp = normalTimestamp;
		}

	}
}
