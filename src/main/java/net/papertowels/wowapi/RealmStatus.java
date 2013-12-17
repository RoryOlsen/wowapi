package net.papertowels.wowapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RealmStatus {

	private List<RealmItem> realms;

	public List<RealmItem> getRealms() {
		return realms;
	}

	public void setRealms(List<RealmItem> realms) {
		this.realms = realms;
	}

	public static class RealmItem {
		private String battlegroup;
		private String locale;
		private String name;
		private String population;
		private boolean queue;
		private String slug;
		private boolean status;
		private String timezone;
		private String type;
		private PvpZone wintergrasp;
		private PvpZone tolBarad;

		public String getBattlegroup() {
			return battlegroup;
		}

		public void setBattlegroup(String battlegroup) {
			this.battlegroup = battlegroup;
		}

		public String getLocale() {
			return locale;
		}

		public void setLocale(String locale) {
			this.locale = locale;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPopulation() {
			return population;
		}

		public void setPopulation(String population) {
			this.population = population;
		}

		public boolean isQueue() {
			return queue;
		}

		public void setQueue(boolean queue) {
			this.queue = queue;
		}

		public String getSlug() {
			return slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public String getTimezone() {
			return timezone;
		}

		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public PvpZone getWintergrasp() {
			return wintergrasp;
		}

		public void setWintergrasp(PvpZone wintergrasp) {
			this.wintergrasp = wintergrasp;
		}

		@JsonGetter("tol-barad")
		public PvpZone getTolBarad() {
			return tolBarad;
		}

		@JsonSetter("tol-barad")
		public void setTolBarad(PvpZone tolBarad) {
			this.tolBarad = tolBarad;
		}

	}

	public static class PvpZone {
		private int area;
		private int controllingFaction;
		private long next;
		private int status;

		public int getArea() {
			return area;
		}

		public void setArea(int area) {
			this.area = area;
		}

		@JsonGetter("controlling-faction")
		public int getContollingFaction() {
			return controllingFaction;
		}

		@JsonSetter("controlling-faction")
		public void setContollingFaction(int controllingFaction) {
			this.controllingFaction = controllingFaction;
		}

		public long getNext() {
			return next;
		}

		public void setNext(long next) {
			this.next = next;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}
	}
}
