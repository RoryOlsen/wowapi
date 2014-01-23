package net.roryolsen.wowapi.characterprofile;

import java.util.Date;
import java.util.List;

import net.roryolsen.wowapi.characterprofile.feed.FeedItem;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CharacterProfile {

	public static enum CharacterProfileField {
		ACHIEVEMENTS("achievements"), APPEARANCE("appearance"), FEED("feed"), GUILD("guild"), HUNTER_PETS("hunterPets"), ITEMS("items"),
		MOUNTS("mounts"), PETS("pets"), PET_SLOTS("petSlots"), PROFESSIONS("professions"), PROGRESSION("progression"), PVP("pvp"),
		QUESTS("quests"), REPUTATION("reputation"), STATS("stats"), TALENTS("talents"), TITLES("titles");

		private String characterProfileField;

		CharacterProfileField(String characterProfileField) {
			this.characterProfileField = characterProfileField;
		}

		public String getCharacterProfileField() {
			return characterProfileField;
		}
	}

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

	private CharacterProfileAchievement achievements;
	private Appearance appearance;
	private List<FeedItem> feed;
	private Guild guild;
	private List<HunterPet> hunterPets;
	private CharacterProfileItemSet items;
	private CharacterProfileMounts mounts;
	private CharacterProfilePet pets;
	private List<PetSlot> petSlots;
	private ProfessionSet professions;
	private Progression progression;
	private CharacterProfilePvp pvp;
	private List<Long> quests;
	private List<Reputation> reputation;
	private Stats stats;
	private List<Talent> talents;
	private List<Title> titles;
	
	
	public List<FeedItem> getFeed() {
		return feed;
	}

	public void setFeed(List<FeedItem> feed) {
		this.feed = feed;
	}

	public List<PetSlot> getPetSlots() {
		return petSlots;
	}

	public void setPetSlots(List<PetSlot> petSlots) {
		this.petSlots = petSlots;
	}

	public ProfessionSet getProfessions() {
		return professions;
	}

	public void setProfessions(ProfessionSet professions) {
		this.professions = professions;
	}

	public Progression getProgression() {
		return progression;
	}

	public void setProgression(Progression progression) {
		this.progression = progression;
	}

	public CharacterProfilePvp getPvp() {
		return pvp;
	}

	public void setPvp(CharacterProfilePvp pvp) {
		this.pvp = pvp;
	}

	public List<Talent> getTalents() {
		return talents;
	}

	public void setTalents(List<Talent> talents) {
		this.talents = talents;
	}

	public CharacterProfilePet getPets() {
		return pets;
	}

	public void setPets(CharacterProfilePet pets) {
		this.pets = pets;
	}

	public CharacterProfileAchievement getAchievements() {
		return achievements;
	}

	public void setAchievements(CharacterProfileAchievement achievements) {
		this.achievements = achievements;
	}

	public Appearance getAppearance() {
		return appearance;
	}

	public void setAppearance(Appearance appearance) {
		this.appearance = appearance;
	}

	public Guild getGuild() {
		return guild;
	}

	public void setGuild(Guild guild) {
		this.guild = guild;
	}

	public List<HunterPet> getHunterPets() {
		return hunterPets;
	}

	public void setHunterPets(List<HunterPet> hunterPets) {
		this.hunterPets = hunterPets;
	}

	public CharacterProfileItemSet getItems() {
		return items;
	}

	public void setItems(CharacterProfileItemSet items) {
		this.items = items;
	}

	public CharacterProfileMounts getMounts() {
		return mounts;
	}

	public void setMounts(CharacterProfileMounts mounts) {
		this.mounts = mounts;
	}

	public List<Long> getQuests() {
		return quests;
	}

	public void setQuests(List<Long> quests) {
		this.quests = quests;
	}

	public List<Reputation> getReputation() {
		return reputation;
	}

	public void setReputation(List<Reputation> reputation) {
		this.reputation = reputation;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}

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
