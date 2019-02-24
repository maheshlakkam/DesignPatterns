package com.design.patterns.structural.builder;

import java.util.AbstractMap;

public class BuilderDesignPattern {
	int id;
	String name;
	int age;
	String address;
	long pin;

	public BuilderDesignPattern(int id, String name, int age, String address, long pin) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.pin = pin;
	}

	public static class BuildPerson {
		int id;
		String name;
		int age;
		String address;
		long pin;

		BuildPerson() {
		}

		BuilderDesignPattern build() {
			return new BuilderDesignPattern(id, name, age, address, pin);
		}

		public BuildPerson setId(int id) {
			this.id = id;
			return this;

		}

		public BuildPerson setName(String name) {
			this.name = name;
			return this;
		}

		public BuildPerson setAge(int age) {
			this.age = age;
			return this;
		}

		public BuildPerson setAddress(String address) {
			this.address = address;
			return this;
		}

		public BuildPerson setPin(long pin) {
			this.pin = pin;
			return this;
		}
	}

	public static void main(String[] args) {
		BuilderDesignPattern design = new BuilderDesignPattern.BuildPerson().setId(1).setName("Mahesh").build();
		System.out.println(design.name);

	}
}
