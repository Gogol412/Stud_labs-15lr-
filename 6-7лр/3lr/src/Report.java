public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%15s %15s%n", "Фамилия", "Зарплата");
        System.out.println("----------------------------------------");

        for (Employee emp : employees) {
            System.out.printf("%15s |%15.2f%n", emp.getSurname(), emp.getSalary());
        }
    }
}