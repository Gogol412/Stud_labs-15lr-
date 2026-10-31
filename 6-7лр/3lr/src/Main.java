public static void main(String[] args) {
    Employee[] employees = {
            new Employee("Иванов Иван Иванович", 45000.5),
            new Employee("Пидров Питр Паркер", 52000.0),
            new Employee("Сидоров Сидор Сидорович", 48000.75)
    };

    Report.generateReport(employees);
}