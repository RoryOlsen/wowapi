package net.papertowels.wowapi;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CharacterProfile {

	private int achievementPoints;
	private String battlegroup;
	private String calcClass;
	private int characterClass;
	private int gender;
	private Date lastModified;
	private int level;
	private String name;
	private int race;
	private String realm;
	private String thumbnail;
	private int totalHonorableKills;

	public int getAchievementPoints() {
		return achievementPoints;
	}

	public void setAchievementPoints(int achievementPoints) {
		this.achievementPoints = achievementPoints;
	}

	public String getBattlegroup() {
		return battlegroup;
	}

	public void setBattlegroup(String battlegroup) {
		this.battlegroup = battlegroup;
	}

	public String getCalcClass() {
		return calcClass;
	}

	public void setCalcClass(String calcClass) {
		this.calcClass = calcClass;
	}

	@JsonGetter("class")
	public int getCharacterClass() {
		return characterClass;
	}

	@JsonSetter("class")
	public void setCharacterClass(int clazz) {
		this.characterClass = clazz;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRace() {
		return race;
	}

	public void setRace(int race) {
		this.race = race;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getTotalHonorableKills() {
		return totalHonorableKills;
	}

	public void setTotalHonorableKills(int totalHonorableKills) {
		this.totalHonorableKills = totalHonorableKills;
	}
}
