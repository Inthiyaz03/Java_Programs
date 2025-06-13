import java.io.*;
import java.util.*;

class Employee implements Comparable<Employee> {
    private int employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Employee(int employeeId, String firstName, String lastName, int age, int salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age;
    }
}

public class FileComp {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\inthi\\OneDrive\\Desktop\\employees.txt";
        List<Employee> employees = readEmployeesFromFile(inputFile);
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static List<Employee> readEmployeesFromFile(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int employeeId = Integer.parseInt(data[0]);
                String firstName = data[1];
                String lastName = data[2];
                int age = Integer.parseInt(data[3]);
                int salary = Integer.parseInt(data[4]);
                employees.add(new Employee(employeeId, firstName, lastName, age, salary));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return employees;
    }
}
