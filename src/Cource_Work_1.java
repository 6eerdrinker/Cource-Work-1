import com.sun.tools.javac.Main;

public class Cource_Work_1 {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee(1, "Антонов Антон Антонович", 10000);
        employees[1] = new Employee(1, "Борисов Борис Борисович", 15000);
        employees[2] = new Employee(3, "Валентинова Валентина Валентиновна", 15000);
        employees[3] = new Employee(2, "Григорьев Григорий Григорьевич", 20000);
        employees[4] = new Employee(5, "Димтриев Дмитрий Дмитриевич", 23000);
        employees[5] = new Employee(4, "Жороламов Жоролам Жороламович", 17000);
        employees[6] = new Employee(5, "Земляникина Зоя Зямовна", 27000);
        employees[7] = new Employee(3, "Иванов Иван Иванович", 12000);
        employees[8] = new Employee(3, "Колмыков Колян Колянович", 22000);
        employees[9] = new Employee(2, "Митрофанов Митрофан Митрофанович", 20000);

        System.out.println("Общая сумма зарплат - " + calcSumSalary());
        System.out.println("Работник с самой высокой зарплатой - " + getEmployeeWithMaxSalary());
        System.out.println("Работник с самой низкой зарплатой - " + getEmployeeWithMinSalary());
        System.out.println("Средняя зарплата - " + averageSalary());
        System.out.println();
        System.out.println("Список сотрудников: ");
        printAllEmployeesNames();
        System.out.println();
        System.out.println("Данные о сотрудниках: ");
        printAllDataOfEmployees();
    }
    public static int calcSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employees[0] != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static int averageSalary() {
        int averSum = 0;
        for (Employee employee:employees) {
            if (employees[0] != null) {
                averSum = calcSumSalary() / employees.length;
            }
        }
        return averSum;
    }
    public static Employee getEmployeeWithMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee xEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                xEmployee = employee;
            }
        }
        return xEmployee;
    }
    public static Employee getEmployeeWithMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee yEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                yEmployee = employee;
            }
        }
        return yEmployee;
    }
    static void printAllEmployeesNames() {
        for (Employee employee : employees) {
            System.out.println("сотрудник: " + employee.getEmployeeName());
        }
    }
    static void printAllDataOfEmployees() {
        for (Employee employee : employees) {
            System.out.println("id " + employee.getId()+ ", отдел " + employee.getDepartment() + ", сотрудник " +
                    employee.getEmployeeName() + ", зарплата " + employee.getSalary());
        }
    }
}




