package net.roryolsen.wowapi.characterprofile;

import java.util.List;

public class ProfessionSet {

	private List<Profession> primary;
	private List<Profession> secondary;
	
	
	public List<Profession> getPrimary() {
		return primary;
	}


	public void setPrimary(List<Profession> primary) {
		this.primary = primary;
	}


	public List<Profession> getSecondary() {
		return secondary;
	}


	public void setSecondary(List<Profession> secondary) {
		this.secondary = secondary;
	}


	public static class Profession{
		private String icon;
		private long id;
		private int max;
		private String name;
		private int rank;
		private List<Long> recipes;
		
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
		public int getMax() {
			return max;
		}
		public void setMax(int max) {
			this.max = max;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public List<Long> getRecipes() {
			return recipes;
		}
		public void setRecipes(List<Long> recipes) {
			this.recipes = recipes;
		}
	}
}
