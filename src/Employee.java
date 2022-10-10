public class Employee {
    private final int id; //обявлено поле id
    private int department; //объявлено поле отдел
    private final String employeeName; //обявлено поле ФИО
    private int salary; //объявлено поле зарплата

    private static int count = 0; //объявлена статическая переменная счетчик



    public Employee(int department, String employeeName, int salary) {
        this.id = count++;
        this.department = department;
        this.employeeName = employeeName;
        this.salary = salary;
    } //создан конструктор без выведения id

    public int getId() {
        return id;
    } //геттер id
    public int getDepartment() {
        return department;
    } //геттер отдела
    public void setDepartment(int department) {
        this.department = department;
    } //сеттер отдела
    public String getEmployeeName() {
        return this.employeeName;
    } //геттер ФИО
    public int getSalary() {
        return salary;
    } // геттер зарплаты
    public void setSalary(int salary) {
        this.salary = salary;
    } // сеттер зарплаты
    @Override
    public String toString() {
        return "Сотрудник: " +
                "id " + id +
                ", отдел " + department +
                ",  " + employeeName +
                ", зарплата '" + salary + '\'' +
                ' ';
    }

}



