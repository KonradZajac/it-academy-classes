package com.it.academy.course;

public class Lesson {

	private String name;

	private Homework[] homeworks;

	public Lesson(String name, Homework[] homeworks) {
		this.name = name;
		this.homeworks = homeworks;
	}

	public void run(Teacher teacher, Student[] students) {
		System.out.println("Running lesson: " + name + "...");
		for (Student student : students) {
			for (Homework homework : homeworks) {
				teacher.rate(student, homework);
			}
		}
	}
}
