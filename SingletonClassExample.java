package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonClassExample {

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

		System.out.println(DemoStudent.getInstance());

		ExecutorService executorService = null;

		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				DemoStudent demoStudent = DemoStudent.getInstance();
				System.out.println(Thread.currentThread().getName() + ":" + demoStudent.hashCode());

			}
		};

		executorService = Executors.newFixedThreadPool(5);
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);

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

class Singleton {

	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (INSTANCE == null) {

			synchronized (Singleton.class) {
				if (INSTANCE == null) {

					INSTANCE = new Singleton();

				}
			}

		}

		return INSTANCE;

	}

}

class DemoStudent {

	private String name;
	private List<String> courses;
	private static DemoStudent INSTANCE = null;

	public DemoStudent() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public static DemoStudent getInstance() {

		if (INSTANCE == null) {

			synchronized (DemoStudent.class) {
				if (INSTANCE == null) {

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					INSTANCE = new DemoStudent();

				}
			}

		}

		return INSTANCE;

	}
}


