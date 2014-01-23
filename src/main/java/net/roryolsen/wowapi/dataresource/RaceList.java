package net.roryolsen.wowapi.dataresource;

import java.util.List;

public class RaceList {

	private List<Race> races;

	public List<Race> getRaces() {
		return races;
	}

	public void setRaces(List<Race> races) {
		this.races = races;
	}

	public static class Race {
		private long id;
		private long mask;
		private String name;
		private String side;

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

		public String getSide() {
			return side;
		}

		public void setSide(String side) {
			this.side = side;
		}

	}
}
