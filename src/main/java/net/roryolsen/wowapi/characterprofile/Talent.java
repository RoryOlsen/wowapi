package net.roryolsen.wowapi.characterprofile;

import java.util.List;

import net.roryolsen.wowapi.Spell;

public class Talent {

	private String calcGlyph;
	private String calcSpec;
	private String calcTalent;
	private GlyphSet glyphs;
	private boolean selected;
	private Specialization spec;
	private List<TalentSelection> talents;

	public String getCalcGlyph() {
		return calcGlyph;
	}

	public void setCalcGlyph(String calcGlyph) {
		this.calcGlyph = calcGlyph;
	}

	public String getCalcSpec() {
		return calcSpec;
	}

	public void setCalcSpec(String calcSpec) {
		this.calcSpec = calcSpec;
	}

	public String getCalcTalent() {
		return calcTalent;
	}

	public void setCalcTalent(String calcTalent) {
		this.calcTalent = calcTalent;
	}

	public GlyphSet getGlyphs() {
		return glyphs;
	}

	public void setGlyphs(GlyphSet glyphs) {
		this.glyphs = glyphs;
	}

	public boolean getSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Specialization getSpec() {
		return spec;
	}

	public void setSpec(Specialization spec) {
		this.spec = spec;
	}

	public List<TalentSelection> getTalents() {
		return talents;
	}

	public void setTalents(List<TalentSelection> talents) {
		this.talents = talents;
	}

	public static class GlyphSet {
		private List<Glyph> major;
		private List<Glyph> minor;

		public List<Glyph> getMajor() {
			return major;
		}

		public void setMajor(List<Glyph> major) {
			this.major = major;
		}

		public List<Glyph> getMinor() {
			return minor;
		}

		public void setMinor(List<Glyph> minor) {
			this.minor = minor;
		}

	}

	public static class Glyph {

		private long glyph;
		private String icon;
		private long item;
		private String name;

		public long getGlyph() {
			return glyph;
		}

		public void setGlyph(long glyph) {
			this.glyph = glyph;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public long getItem() {
			return item;
		}

		public void setItem(long item) {
			this.item = item;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class Specialization {
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

	public static class TalentSelection {
		private int column;
		private Spell spell;
		private int tier;

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			this.column = column;
		}

		public Spell getSpell() {
			return spell;
		}

		public void setSpell(Spell spell) {
			this.spell = spell;
		}

		public int getTier() {
			return tier;
		}

		public void setTier(int tier) {
			this.tier = tier;
		}
	}
}
