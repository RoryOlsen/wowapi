package net.roryolsen.wowapi.dataresource;

import java.util.List;

import net.roryolsen.wowapi.characterprofile.Talent.Specialization;
import net.roryolsen.wowapi.characterprofile.Talent.TalentSelection;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ClassTalent {
	private String characterClass;
	private List<TalentGlyph> glyphs;
	private List<Specialization> specs;
	private List<Specialization> petSpecs;
	private List<List<TalentSelection>> talents;

	public List<Specialization> getPetSpecs() {
		return petSpecs;
	}

	public void setPetSpecs(List<Specialization> petSpecs) {
		this.petSpecs = petSpecs;
	}

	@JsonGetter("class")
	public String getCharacterClass() {
		return characterClass;
	}

	@JsonSetter("class")
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public List<TalentGlyph> getGlyphs() {
		return glyphs;
	}

	public void setGlyphs(List<TalentGlyph> glyphs) {
		this.glyphs = glyphs;
	}

	public List<Specialization> getSpecs() {
		return specs;
	}

	public void setSpecs(List<Specialization> specs) {
		this.specs = specs;
	}

	public List<List<TalentSelection>> getTalents() {
		return talents;
	}

	public void setTalents(List<List<TalentSelection>> talents) {
		this.talents = talents;
	}

	public static class TalentGlyph {
		private long glyph;
		private String icon;
		private long item;
		private String name;
		private long typeId;

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

		public long getTypeId() {
			return typeId;
		}

		public void setTypeId(long typeId) {
			this.typeId = typeId;
		}

	}

}