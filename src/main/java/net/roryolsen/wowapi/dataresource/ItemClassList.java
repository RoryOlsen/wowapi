package net.roryolsen.wowapi.dataresource;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemClassList {

	private List<ItemClass> classes;

	public List<ItemClass> getClasses() {
		return classes;
	}

	public void setClasses(List<ItemClass> classes) {
		this.classes = classes;
	}

	public static class ItemClass {
		private long classId;
		private String name;
		private List<ItemSubclass> subclasses;

		@JsonGetter("class")
		public long getClassId() {
			return classId;
		}

		@JsonSetter("class")
		public void setClassId(long classId) {
			this.classId = classId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<ItemSubclass> getSubclasses() {
			return subclasses;
		}

		public void setSubclasses(List<ItemSubclass> subclasses) {
			this.subclasses = subclasses;
		}

	}

	public static class ItemSubclass {
		private String name;
		private long subclass;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getSubclass() {
			return subclass;
		}

		public void setSubclass(long subclass) {
			this.subclass = subclass;
		}
	}
}
