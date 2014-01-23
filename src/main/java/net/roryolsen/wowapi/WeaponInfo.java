package net.roryolsen.wowapi;

public class WeaponInfo {

	public static class Damage {

		private double exactMax;
		private double exactMin;
		private int max;
		private int min;

		public double getExactMax() {
			return exactMax;
		}

		public void setExactMax(double exactMax) {
			this.exactMax = exactMax;
		}

		public double getExactMin() {
			return exactMin;
		}

		public void setExactMin(double exactMin) {
			this.exactMin = exactMin;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}
	}

	private Damage damage;
	private double dps;
	private double weaponSpeed;

	public double getDps() {
		return dps;
	}

	public void setDps(double dps) {
		this.dps = dps;
	}

	public double getWeaponSpeed() {
		return weaponSpeed;
	}

	public void setWeaponSpeed(double weaponSpeed) {
		this.weaponSpeed = weaponSpeed;
	}

	public Damage getDamage() {
		return damage;
	}

	public void setDamage(Damage damage) {
		this.damage = damage;
	}
}
