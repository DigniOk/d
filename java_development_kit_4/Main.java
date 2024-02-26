package java_development_kit_4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();
        // Добавление сотрудников
        directory.addEmployee(1, "+79234564232", "Крапивин", 2);
        directory.addEmployee(5, "+79835674333", "Баранова", 10);
        directory.addEmployee(3, "+79645346734", "Ларионов", 5);
        directory.addEmployee(4, "+79234567735", "Киселева", 2);
        
        // Поиск сотрудника по стажу
        List<EmployeeDirectory.Employee> employeesWithExperience5 = directory.searchByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет:");
        for (EmployeeDirectory.Employee employee : employeesWithExperience5) {
            System.out.println("Табельный номер: " + employee.getEmployeeId());
            System.out.println("Имя: " + employee.getName());
        }

        // Вывод номеров телефонов сотрудников по имени
        List <String> phoneNumbers = directory.getPhoneNumbersByName("Крапивин");
        System.out.println("Номера телефонов сотрудника Крапивин:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        // Поиск сотрудника по табельному номеру
        EmployeeDirectory.Employee employee = directory.searchByEmployeeId(2);
        if (employee != null) {
            System.out.println("Сотрудник с табельным номером 2 найден:");
            System.out.println("Табельный номер: " + employee.getEmployeeId());
            System.out.println("Имя: " + employee.getName());
        } else {
            System.out.println("Сотрудник с табельным номером 2 не найден");
        }
    }
}
