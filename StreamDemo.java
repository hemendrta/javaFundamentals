package main.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamDemo {

    public static void main(String[] args) {

        List<Employee> employees=Arrays.asList(new Employee(101,"hemendra", Arrays.asList(7999996891l,9179075007l)),new Employee(102,"aditi",Arrays.asList(9229170965l,9826507240l)));

//        counting the total number of items in the list

        System.out.println(employees.stream().count());

//        Looking for any of the match based on the object which we pass

        System.out.println(employees.stream().anyMatch(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getName().contains("ndra");
            }
        }));

//        limiting the list result to 1

        employees.stream().limit(1).forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });

//        Sorting the list based on name and limiting the result to 1

        employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }).limit(1).forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });

//        Converting the name of the employee to upper case and returning the string

        employees.stream().map(new Function<Employee, Object>() {
            @Override
            public Object apply(Employee employee) {
                return employee.getName().toUpperCase();
            }
        }).forEach(new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

    }
}

class Employee{

    private int id;
    private String name;
    private List<Long> contactNumber;

    public Employee() {
    }

    public Employee(int id, String name, List<Long> contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(List<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
