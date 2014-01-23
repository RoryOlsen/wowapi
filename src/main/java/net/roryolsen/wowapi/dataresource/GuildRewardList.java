package net.roryolsen.wowapi.dataresource;

import java.util.List;

import net.roryolsen.wowapi.Achievement;
import net.roryolsen.wowapi.Item;

public class GuildRewardList {

	private List<GuildReward> rewards;

	public List<GuildReward> getRewards() {
		return rewards;
	}

	public void setRewards(List<GuildReward> rewards) {
		this.rewards = rewards;
	}

	public static class GuildReward {
		private Achievement achievement;
		private Item item;
		private int minGuildLevel;
		private int minGuildRepLevel;
		private List<Long> races;

		public Achievement getAchievement() {
			return achievement;
		}

		public void setAchievement(Achievement achievement) {
			this.achievement = achievement;
		}

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}

		public int getMinGuildLevel() {
			return minGuildLevel;
		}

		public void setMinGuildLevel(int minGuildLevel) {
			this.minGuildLevel = minGuildLevel;
		}

		public int getMinGuildRepLevel() {
			return minGuildRepLevel;
		}

		public void setMinGuildRepLevel(int minGuildRepLevel) {
			this.minGuildRepLevel = minGuildRepLevel;
		}

		public List<Long> getRaces() {
			return races;
		}

		public void setRaces(List<Long> races) {
			this.races = races;
		}

	}
}
