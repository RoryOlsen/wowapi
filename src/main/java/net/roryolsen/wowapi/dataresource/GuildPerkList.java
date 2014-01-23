package net.roryolsen.wowapi.dataresource;

import java.util.List;

public class GuildPerkList {

	private List<GuildPerk> perks;

	public List<GuildPerk> getPerks() {
		return perks;
	}

	public void setPerks(List<GuildPerk> perks) {
		this.perks = perks;
	}

	public static class GuildPerk {
		private int guildLevel;
		private GuildPerkSpell spell;

		public int getGuildLevel() {
			return guildLevel;
		}

		public void setGuildLevel(int guildLevel) {
			this.guildLevel = guildLevel;
		}

		public GuildPerkSpell getSpell() {
			return spell;
		}

		public void setSpell(GuildPerkSpell spell) {
			this.spell = spell;
		}

	}

	public static class GuildPerkSpell {
		private String castTime;
		private String description;
		private String icon;
		private long id;
		private String name;
		private String subtext;

		public String getCastTime() {
			return castTime;
		}

		public void setCastTime(String castTime) {
			this.castTime = castTime;
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

		public String getSubtext() {
			return subtext;
		}

		public void setSubtext(String subtext) {
			this.subtext = subtext;
		}

	}
}
