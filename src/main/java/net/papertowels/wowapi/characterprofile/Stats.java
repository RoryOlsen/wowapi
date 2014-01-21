package net.papertowels.wowapi.characterprofile;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Stats {

	private long agi;
	private long armor;
	private long attackPower;
	private double block;
	private long blockRating;
	private double crit;
	private long critRating;
	private double dodge;
	private long dodgeRating;
	private long expertiseRating;
	private double haste;
	private long hasteRating;
	private double hasteRatingPercent;
	private long health;
	private double hitPercent;
	private long hitRating;
	private long intellect;
	private double mainHandDmgMax;
	private double mainHandDmgMin;
	private double mainHandDps;
	private double mainHandExpertise;
	private double mainHandSpeed;
	private double offHandDmgMax;
	private double offHandDmgMin;
	private double offHandDps;
	private double offHandExpertise;
	private double offHandSpeed;
	private double parry;
	private long parryRating;
	private long power;
	private String powerType;
	private double pvpPower;
	private double pvpPowerDamage;
	private double pvpPowerHealing;
	private long pvpPowerRating;
	private double pvpResilience;
	private int pvpResilienceBonus;
	private long pvpResilienceRating;
	private long rangedAttackPower;
	private double rangedCrit;
	private long rangedCritRating;
	private double rangedDmgMax;
	private double rangedDmgMin;
	private double rangedDps;
	private double rangedExpertise;
	private double rangedHaste;
	private long rangedHasteRating;
	private double rangedHasteRatingPercent;
	private double rangedHitPercent;
	private long rangedHitRating;
	private double rangedSpeed;
	private double spellCrit;
	private long spellCritRating;
	private double spellHitPercent;
	private long spellHitRating;
	private long spellPen;
	private long spellPower;
	private double spellHaste;
	private long spellHasteRating;
	private double spellHasteRatingPercent;
	private long spr;
	private long sta;
	private long str;
	private double mastery;
	private long masteryRating;
	private long mana5;
	private long mana5Combat;

	public double getPvpPowerDamage() {
		return pvpPowerDamage;
	}

	public void setPvpPowerDamage(double pvpPowerDamage) {
		this.pvpPowerDamage = pvpPowerDamage;
	}

	public double getPvpPowerHealing() {
		return pvpPowerHealing;
	}

	public void setPvpPowerHealing(double pvpPowerHealing) {
		this.pvpPowerHealing = pvpPowerHealing;
	}

	public double getRangedHaste() {
		return rangedHaste;
	}

	public void setRangedHaste(double rangedHaste) {
		this.rangedHaste = rangedHaste;
	}

	public long getRangedHasteRating() {
		return rangedHasteRating;
	}

	public void setRangedHasteRating(long rangedHasteRating) {
		this.rangedHasteRating = rangedHasteRating;
	}

	public double getRangedHasteRatingPercent() {
		return rangedHasteRatingPercent;
	}

	public void setRangedHasteRatingPercent(double rangedHasteRatingPercent) {
		this.rangedHasteRatingPercent = rangedHasteRatingPercent;
	}

	public double getOffHandDmgMax() {
		return offHandDmgMax;
	}

	public void setOffHandDmgMax(double offHandDmgMax) {
		this.offHandDmgMax = offHandDmgMax;
	}

	public double getOffHandDmgMin() {
		return offHandDmgMin;
	}

	public void setOffHandDmgMin(double offHandDmgMin) {
		this.offHandDmgMin = offHandDmgMin;
	}

	public double getMainHandDps() {
		return mainHandDps;
	}

	public void setMainHandDps(double mainHandDps) {
		this.mainHandDps = mainHandDps;
	}

	public double getMainHandExpertise() {
		return mainHandExpertise;
	}

	public void setMainHandExpertise(double mainHandExpertise) {
		this.mainHandExpertise = mainHandExpertise;
	}

	public double getMainHandSpeed() {
		return mainHandSpeed;
	}

	public void setMainHandSpeed(double mainHandSpeed) {
		this.mainHandSpeed = mainHandSpeed;
	}

	public double getSpellHaste() {
		return spellHaste;
	}

	public void setSpellHaste(double spellHaste) {
		this.spellHaste = spellHaste;
	}

	public long getSpellHasteRating() {
		return spellHasteRating;
	}

	public void setSpellHasteRating(long spellHasteRating) {
		this.spellHasteRating = spellHasteRating;
	}

	public double getSpellHasteRatingPercent() {
		return spellHasteRatingPercent;
	}

	public void setSpellHasteRatingPercent(double spellHasteRatingPercent) {
		this.spellHasteRatingPercent = spellHasteRatingPercent;
	}

	public long getMana5() {
		return mana5;
	}

	public void setMana5(long mana5) {
		this.mana5 = mana5;
	}

	public long getMana5Combat() {
		return mana5Combat;
	}

	public void setMana5Combat(long mana5Combat) {
		this.mana5Combat = mana5Combat;
	}

	public double getHaste() {
		return haste;
	}

	public void setHaste(double haste) {
		this.haste = haste;
	}

	public double getHasteRatingPercent() {
		return hasteRatingPercent;
	}

	public void setHasteRatingPercent(double hasteRatingPercent) {
		this.hasteRatingPercent = hasteRatingPercent;
	}

	public double getMastery() {
		return mastery;
	}

	public void setMastery(double mastery) {
		this.mastery = mastery;
	}

	public long getMasteryRating() {
		return masteryRating;
	}

	public void setMasteryRating(long masteryRating) {
		this.masteryRating = masteryRating;
	}

	public int getPvpResilienceBonus() {
		return pvpResilienceBonus;
	}

	public void setPvpResilienceBonus(int pvpResilienceBonus) {
		this.pvpResilienceBonus = pvpResilienceBonus;
	}

	public long getAgi() {
		return agi;
	}

	public void setAgi(long agi) {
		this.agi = agi;
	}

	public long getArmor() {
		return armor;
	}

	public void setArmor(long armor) {
		this.armor = armor;
	}

	public long getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(long attackPower) {
		this.attackPower = attackPower;
	}

	public double getBlock() {
		return block;
	}

	public void setBlock(double block) {
		this.block = block;
	}

	public long getBlockRating() {
		return blockRating;
	}

	public void setBlockRating(long blockRating) {
		this.blockRating = blockRating;
	}

	public double getCrit() {
		return crit;
	}

	public void setCrit(double crit) {
		this.crit = crit;
	}

	public long getCritRating() {
		return critRating;
	}

	public void setCritRating(long critRating) {
		this.critRating = critRating;
	}

	public double getDodge() {
		return dodge;
	}

	public void setDodge(double dodge) {
		this.dodge = dodge;
	}

	public long getDodgeRating() {
		return dodgeRating;
	}

	public void setDodgeRating(long dodgeRating) {
		this.dodgeRating = dodgeRating;
	}

	public long getExpertiseRating() {
		return expertiseRating;
	}

	public void setExpertiseRating(long expertiseRating) {
		this.expertiseRating = expertiseRating;
	}

	public long getHasteRating() {
		return hasteRating;
	}

	public void setHasteRating(long hasteRating) {
		this.hasteRating = hasteRating;
	}

	public long getHealth() {
		return health;
	}

	public void setHealth(long health) {
		this.health = health;
	}

	public double getHitPercent() {
		return hitPercent;
	}

	public void setHitPercent(double hitPercent) {
		this.hitPercent = hitPercent;
	}

	public long getHitRating() {
		return hitRating;
	}

	public void setHitRating(long hitRating) {
		this.hitRating = hitRating;
	}

	@JsonGetter("int")
	public long getIntellect() {
		return intellect;
	}

	@JsonSetter("int")
	public void setIntellect(long innt) {
		this.intellect = innt;
	}

	public double getMainHandDmgMax() {
		return mainHandDmgMax;
	}

	public void setMainHandDmgMax(double mainHandDmgMax) {
		this.mainHandDmgMax = mainHandDmgMax;
	}

	public double getMainHandDmgMin() {
		return mainHandDmgMin;
	}

	public void setMainHandDmgMin(double mainHandDmgMin) {
		this.mainHandDmgMin = mainHandDmgMin;
	}

	public double getOffHandDps() {
		return offHandDps;
	}

	public void setOffHandDps(double offHandDps) {
		this.offHandDps = offHandDps;
	}

	public double getOffHandExpertise() {
		return offHandExpertise;
	}

	public void setOffHandExpertise(double offHandExpertise) {
		this.offHandExpertise = offHandExpertise;
	}

	public double getOffHandSpeed() {
		return offHandSpeed;
	}

	public void setOffHandSpeed(double offHandSpeed) {
		this.offHandSpeed = offHandSpeed;
	}

	public double getParry() {
		return parry;
	}

	public void setParry(double parry) {
		this.parry = parry;
	}

	public long getParryRating() {
		return parryRating;
	}

	public void setParryRating(long parryRating) {
		this.parryRating = parryRating;
	}

	public long getPower() {
		return power;
	}

	public void setPower(long power) {
		this.power = power;
	}

	public String getPowerType() {
		return powerType;
	}

	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	public double getPvpPower() {
		return pvpPower;
	}

	public void setPvpPower(double pvpPower) {
		this.pvpPower = pvpPower;
	}

	public long getPvpPowerRating() {
		return pvpPowerRating;
	}

	public void setPvpPowerRating(long pvpPowerRating) {
		this.pvpPowerRating = pvpPowerRating;
	}

	public double getPvpResilience() {
		return pvpResilience;
	}

	public void setPvpResilience(double pvpResilience) {
		this.pvpResilience = pvpResilience;
	}

	public long getPvpResilienceRating() {
		return pvpResilienceRating;
	}

	public void setPvpResilienceRating(long pvpResilienceRating) {
		this.pvpResilienceRating = pvpResilienceRating;
	}

	public long getRangedAttackPower() {
		return rangedAttackPower;
	}

	public void setRangedAttackPower(long rangedAttackPower) {
		this.rangedAttackPower = rangedAttackPower;
	}

	public double getRangedCrit() {
		return rangedCrit;
	}

	public void setRangedCrit(double rangedCrit) {
		this.rangedCrit = rangedCrit;
	}

	public long getRangedCritRating() {
		return rangedCritRating;
	}

	public void setRangedCritRating(long rangedCritRating) {
		this.rangedCritRating = rangedCritRating;
	}

	public double getRangedDmgMax() {
		return rangedDmgMax;
	}

	public void setRangedDmgMax(double rangedDamageMax) {
		this.rangedDmgMax = rangedDamageMax;
	}

	public double getRangedDmgMin() {
		return rangedDmgMin;
	}

	public void setRangedDmgMin(double rangedDamageMin) {
		this.rangedDmgMin = rangedDamageMin;
	}

	public double getRangedDps() {
		return rangedDps;
	}

	public void setRangedDps(double rangedDps) {
		this.rangedDps = rangedDps;
	}

	public double getRangedExpertise() {
		return rangedExpertise;
	}

	public void setRangedExpertise(double rangedExpertise) {
		this.rangedExpertise = rangedExpertise;
	}

	public double getRangedHitPercent() {
		return rangedHitPercent;
	}

	public void setRangedHitPercent(double rangedHitPercent) {
		this.rangedHitPercent = rangedHitPercent;
	}

	public long getRangedHitRating() {
		return rangedHitRating;
	}

	public void setRangedHitRating(long rangedHitRating) {
		this.rangedHitRating = rangedHitRating;
	}

	public double getRangedSpeed() {
		return rangedSpeed;
	}

	public void setRangedSpeed(double rangedSpeed) {
		this.rangedSpeed = rangedSpeed;
	}

	public double getSpellCrit() {
		return spellCrit;
	}

	public void setSpellCrit(double spellCrit) {
		this.spellCrit = spellCrit;
	}

	public long getSpellCritRating() {
		return spellCritRating;
	}

	public void setSpellCritRating(long spellCritRating) {
		this.spellCritRating = spellCritRating;
	}

	public double getSpellHitPercent() {
		return spellHitPercent;
	}

	public void setSpellHitPercent(double spellHitPercent) {
		this.spellHitPercent = spellHitPercent;
	}

	public long getSpellHitRating() {
		return spellHitRating;
	}

	public void setSpellHitRating(long spellHitRating) {
		this.spellHitRating = spellHitRating;
	}

	public long getSpellPen() {
		return spellPen;
	}

	public void setSpellPen(long spellPen) {
		this.spellPen = spellPen;
	}

	public long getSpellPower() {
		return spellPower;
	}

	public void setSpellPower(long spellPower) {
		this.spellPower = spellPower;
	}

	public long getSpr() {
		return spr;
	}

	public void setSpr(long spr) {
		this.spr = spr;
	}

	public long getSta() {
		return sta;
	}

	public void setSta(long sta) {
		this.sta = sta;
	}

	public long getStr() {
		return str;
	}

	public void setStr(long str) {
		this.str = str;
	}

}
