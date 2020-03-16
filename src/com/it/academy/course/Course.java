package com.it.academy.course;

public class Course {

	private Lesson[] lessons;

	private Student[] students;

	private Teacher teacher;

	public void start() {
		for (Lesson lesson : lessons) {
			lesson.run(teacher, students);
		}
	}
}
