package com.it.academy;

public class ClassRegister {

	private int gradesCount = 0;

	private Grade[] grades = new Grade[1000];

	public void putGrade(Student student, Homework homework, int grade) {
		Grade newGrade = new Grade(student, homework, grade); //Create new grade
		grades[gradesCount] = newGrade;						  //put it into an array
		gradesCount++;										  //add one to the count of our grades
	}
}
