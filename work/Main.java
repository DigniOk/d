package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Krapivin", "Nikita", "Sergeevich","deloper","89995353432", 7000, 35));
    employees.add(new Employee("Karpov", "Ivan", "Anatolevich", "deloper", "89340423421", 7000, 40));
    employees.add(new Employee("Volchenkova", "Anastasiya", "Ivanovna", "tester", "89340423429" , 4000, 45));
    employees.add(new Employee("Ivanov", "Oleg", "Ivanovich", "analitic", "89340423430" , 6000, 45));
    employees.add(new Employee("Baton", "Dmitriy", "Romanovich", "designer", "89340423429" , 5000, 40));
    employees.add(new Head("Serebryakov", "Dmitriy", "Vladimirovich", "head", "89340423429" , 10000, 40));

    System.out.println("Список работников:");
    for (Employee employee : employees
    ) {
      System.out.println(employee);
    }
   
    Head.increaseSalary(employees.toArray(new Employee[0]), 1000);
    System.out.println("\nПосле повышения зарплаты:");
    for (Employee employee : employees) {
      System.out.println(employee);
    }

    Collections.sort(employees, new AgeComparator());
    System.out.println("\nСортировка сотрудников по возрасту:");
    for (Employee employee : employees) {
      System.out.println(employee);
    }
  }
}

