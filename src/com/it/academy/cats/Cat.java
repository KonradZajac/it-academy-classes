package com.it.academy.cats;

public class Cat {

	private int age;

	private boolean isAlive = true;

	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void eat(String food) {
		if (isAlive) {
			System.out.println("Cat " + name + " is eating " + food);
		} else {
			System.out.println("You cannot feed dead cat!");
		}
	}

	public void sleep() {
		if (isAlive) {
			System.out.println("Cat " + name + " is sleeping");
		} else {
			System.out.println("Dead cat can not sleep!");
		}
	}

	public void die() {
		isAlive = false;
		System.out.println("Cat " + name + " is dead");
	}
}
