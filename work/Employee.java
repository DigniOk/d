package work;

public class Employee {
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    double salary;
    int age;

    public Employee(String surName, String name, String midName, String position, String phone, double salary, int age) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }

    public void increaseSalary(double amount) {
        salary = salary + amount;
      }

    @Override
    public String toString() {
        return "Employee{" +
               "surName='" + surName + '\'' + 
               ", name='" + name + '\'' +
               ", midName='" + midName + '\'' +
               ", position='" + position + '\'' +
               ", phone='" + phone + '\'' +
               ", salary='" + salary + '\'' +
               ", age='" + age + '\'' +
               '}';
    }
}
