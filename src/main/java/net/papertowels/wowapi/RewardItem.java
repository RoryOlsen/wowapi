package net.papertowels.wowapi;

import java.util.List;
import java.util.Map;

public class RewardItem {

	private int armor;
	private String icon;
	private long id;
	private int itemLevel;
	private String name;
	private int quality;
	private List<Object> stats;

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getItemLevel() {
		return itemLevel;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}

	public List<Object> getStats() {
		return stats;
	}

	public void setStats(List<Object> stats) {
		this.stats = stats;
	}

	private Map<String, Object> tooltipParams;

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

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public Map<String, Object> getTooltipParams() {
		return tooltipParams;
	}

	public void setTooltipParams(Map<String, Object> tooltipParams) {
		this.tooltipParams = tooltipParams;
	}
}
