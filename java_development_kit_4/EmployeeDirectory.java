package java_development_kit_4;


import java.util.ArrayList;

import java.util.List;



public class EmployeeDirectory {

    private List<Employee> employees;

    public class Employee {
        private int employeeId;
        private String phoneNumber;
        private String name;
        private int experience;
    
    public Employee(int employeeId, String phoneNumber, String name, int experience) {
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getName() {
        return name;
    }
    public int getExperience() {
        return experience;
    }
    
}

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(int employeeId, String phoneNumber, String name, int experience) {
        Employee newEmployee = new Employee(employeeId, phoneNumber, name, experience);
        employees.add(newEmployee);
    }
    public List<Employee> searchByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> getPhoneNumbersByName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                result.add(employee.getPhoneNumber());
            }
        }
        return result;
    }

    public Employee searchByEmployeeId(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;  // Если сотрудник не найден
    }
}



