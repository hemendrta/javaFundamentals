import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {

    private int employeeID;
    private String employeeName;
    private String employeeGender;
    private String employeeCountry;
    private String employeeState;
    private String employeeCity;

    public Employee() {
        // TODO Auto-generated constructor stub
    }

    public Employee(int employeeID, String employeeName, String employeeGender, String employeeCountry,
                    String employeeState, String employeeCity) {
        super();
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeGender = employeeGender;
        this.employeeCountry = employeeCountry;
        this.employeeState = employeeState;
        this.employeeCity = employeeCity;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Object setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
        return null;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeCountry() {
        return employeeCountry;
    }

    public void setEmployeeCountry(String employeeCountry) {
        this.employeeCountry = employeeCountry;
    }

    public String getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(String employeeState) {
        this.employeeState = employeeState;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[Employee ID : " + employeeID + ", Employee Name : " + employeeName + ", Employee Gender : "
                + employeeGender + ", Employee Country : " + employeeCountry + ", Employee State : " + employeeState
                + ", Employee City : " + employeeCity + "]";
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(101, "John", "M", "United States", "California", "Los Angeles"));
        employees.add(new Employee(91, "Jacob", "M", "United States", "California", "Los Angeles"));
        employees.add(new Employee(111, "Lisa", "F", "United States", "California", "Los Angeles"));
        employees.add(new Employee(97, "Mary", "F", "United States", "California", "Sacramento"));
        employees.add(new Employee(76, "Christine", "F", "United States", "California", "Sacramento"));
        employees.add(new Employee(114, "David", "M", "United States", "California", "San Jose"));
        employees.add(new Employee(103, "Kevin", "M", "United States", "California", "Oakland"));
        employees.add(new Employee(109, "Joe", "M", "United States", "California", "Oakland"));
        employees.add(new Employee(119, "Mathew", "M", "United States", "California", "San Jose"));
        employees.add(new Employee(99, "Angelina", "F", "United States", "California", "San Diego"));
        employees.add(new Employee(98, "Tom", "M", "United States", "California", "San Diego"));
        employees.add(new Employee(116, "Curl", "M", "United States", "California", "Los Angeles"));
        employees.add(new Employee(66, "Christopher", "M", "United States", "California", "Oakland"));
        employees.add(new Employee(56, "Chelse", "F", "United States", "California", "Oakland"));
        employees.add(new Employee(88, "Murali", "M", "United States", "California", "San Jose"));
        employees.add(new Employee(87, "Daisy", "F", "United States", "California", "Sacramento"));
        employees.add(new Employee(85, "Niza", "F", "United States", "Virginia", "Richmond"));
        employees.add(new Employee(86, "Chris", "M", "United States", "Virginia", "Fairfax"));
        employees.add(new Employee(90, "Andrew", "M", "United States", "Virginia", "Reston"));

        System.out.println(employees.stream().filter(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getEmployeeState().equalsIgnoreCase("California");
            }
        }).collect(Collectors.toList()));

        System.out.println("----------------------------------------------------------------");

        System.out.println(employees.stream().filter(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getEmployeeGender().equalsIgnoreCase("F");
            }
        }).count());

        System.out.println("----------------------------------------------------------------");

        System.out.println(employees.stream().map(new Function<Employee, Employee>() {
            @Override
            public Employee apply(Employee employee) {
                employee.setEmployeeID(employee.getEmployeeID() + 10);
                return employee;
            }
        }).collect(Collectors.toList()));

        System.out.println("----------------------------------------------------------------");

        System.out.println(employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getEmployeeName().compareTo(o1.getEmployeeName());
            }
        }).collect(Collectors.toList()));

        System.out.println("----------------------------------------------------------------");

        System.out.println(employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getEmployeeID() - o1.getEmployeeID();
            }
        }).limit(2).collect(Collectors.toList()).get(1));

        System.out.println("----------------------------------------------------------------");

        employees.stream().filter(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getEmployeeGender().equalsIgnoreCase("F");
            }
        }).map(new Function<Employee, Employee>() {
            @Override
            public Employee apply(Employee employee) {

                employee.setEmployeeName("Mrs. "+employee.getEmployeeName());

                return employee;
            }
        }).sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getEmployeeName().compareTo(o1.getEmployeeName());
            }
        }).forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });

        System.out.println("----------------------------------------------------------------");

    }

}
