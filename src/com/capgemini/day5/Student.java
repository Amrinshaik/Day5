package com.capgemini.day5;
import com.capgemini.day5.AgeNotWithinRangeException;
import com.capgemini.day5.NameNotValidException;
public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;
	public Student() {
		super();
	}
	public Student(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public boolean ageValidation(int age) throws AgeNotWithinRangeException {
		if(this.age<15 || this.age>21)
			throw new AgeNotWithinRangeException("Age should be between 15 to 21");
		else
		return true;
	}
	
	public boolean nameValidation(String name) throws NameNotValidException {
		if(this.name!="Amrin")
				throw new NameNotValidException("Name should not contain special characters or numbers");
		else
		return true;
	}
}

