import java.lang.String;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary =salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov.ivan@mailbox.com", "892312312",
                30000, 43);
        employee[1] = new Employee("Neivanova Ivanna", "Cleaner", "", "892312313",
                10000, 65);
        employee[2] = new Employee("Ivanov Neivan", "Team lead", "ivanov.neivan@mailbox.com", "892312314",
                50000, 45);
        employee[3] = new Employee("Neivanov neivan", "Developer", "neivanov.neivan@mailbox.com", "892312315",
                40000, 33);
        employee[4] = new Employee("Ivanov Ivan Li", "QA", "ivanov.ivan.li@mailbox.com", "892312316",
                30000, 27);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].age > 40) employee[i].printEmployee();
        }
    }

    public void printEmployee() {
        System.out.println("Ful name: " + this.fullName);
        System.out.println("Position: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age + "\n");
    }




}
