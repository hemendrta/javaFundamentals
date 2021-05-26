package com.demo;

public class DemoTestApp {

	public static void main(String[] args) {

		Employee employee = Employee.getEmployee();
		Employee employee1 = Employee.getEmployee();
		
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());

		Student student = Student.getStudent();
		Student student1 = Student.getStudent();

		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		
		Person person = Person.getPerson();
		Person person1 = Person.getPerson();

		System.out.println(person.hashCode());
		System.out.println(person1.hashCode());

	}

}

//Eager Initialization

class Employee {

	private static final Employee employee = new Employee();

	private Employee() {

	}

	public static Employee getEmployee() {

		return employee;

	}

}

//Lazy Initialization

class Student {

	private static Student student;

	private Student() {

	}

	public static Student getStudent() {

		if (student == null) {

			student = new Student();

		}

		return student;

	}

}

// Thread Safe Singleton

class Person {

	private static Person person;

	private Person() {

	}

	public static synchronized Person getPerson() {

		if (person == null) {

			person = new Person();

		}

		return person;

	}

}