package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        Departement DepHR = new Departement("HR");
        Departement DepFinance = new Departement("Finance");
        Departement DepPublicFinance = new Departement("Public Finance");

        Employee emp1 = new Employee("John", Position.Manager);
        Employee emp2 = new Employee("Jane", Position.Worker);
        Employee emp3 = new Employee("Doe", Position.IT);
        Employee emp4 = new Employee("Smith", Position.Worker);

        Employee emp5 = new Employee("Alex", Position.Manager);
        Employee emp6 = new Employee("Doe", Position.IT);
        Employee emp7 = new Employee("Smith", Position.Worker);
        Employee emp8 = new Employee("Alex", Position.Worker);

        Employee emp9 = new Employee("Danilo", Position.Manager);
        Employee emp10 = new Employee("Guilherme", Position.IT);
        Employee emp11 = new Employee("Tomás", Position.Worker);
        Employee emp12 = new Employee("Inês", Position.Student);
        Employee emp13 = new Employee("Beatriz", Position.Student);
        Employee emp14 = new Employee("Anabela", Position.Student);

        DepHR.addEmployee(emp1);
        DepHR.addEmployee(emp2);
        DepHR.addEmployee(emp3);
        DepHR.addEmployee(emp4);

        DepFinance.addEmployee(emp5);
        DepFinance.addEmployee(emp6);
        DepFinance.addDepartment(DepPublicFinance);
        DepFinance.addEmployee(emp7);
        DepFinance.addEmployee(emp8);

        DepPublicFinance.addEmployee(emp9);
        DepPublicFinance.addEmployee(emp10);
        DepPublicFinance.addEmployee(emp11);
        DepPublicFinance.addEmployee(emp12);
        DepPublicFinance.addEmployee(emp13);
        DepPublicFinance.addEmployee(emp14);

        DepHR.showDetails();
        System.out.println();
        DepFinance.showDetails();
        System.out.println();
        DepPublicFinance.showDetails();
    }

    enum Position {
        Manager, Student, IT, Worker;
    }

    interface EmployeeInterface {
        void showDetails();
    }

    static class Employee implements EmployeeInterface {
        private String name;
        private Position position;

        public Employee(String name, Position position) {
            this.name = name;
            this.position = position;
        }


        public void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Position: " + position);
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setPosition(Position position) {
            this.position = position;
        }

        public Position getPosition() {
            return position;
        }

    }

    static class Departement implements EmployeeInterface {
        public String name;
        public List<EmployeeInterface> employees = new ArrayList<EmployeeInterface>();


        public Departement(String name) {
            this.name = name;
        }

        public void addEmployee(Employee object) {
            employees.add(object);
        }

        public void addDepartment(Departement object) {
            employees.add(object);
        }

        public void showDetails() {
            System.out.println("Departement: " + name);
            for (EmployeeInterface employeeInterface : employees) {
                employeeInterface.showDetails();
            }
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }
    }
}