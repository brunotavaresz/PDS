package ex1;

import java.util.List;

public class Main {
     public static void main(String[] args) {
        Database sweetsDatabase = new Database();
        PSTinterface databaseAdapter = new DatabaseAdapter(sweetsDatabase);

        PSTemployee funcionario1 = new PSTemployee("joao", "maria", 101, 50000);
        PSTemployee funcionario2 = new PSTemployee("jose", "fernandes", 102, 60000);
        databaseAdapter.adicionarFuncionario(funcionario1);
        databaseAdapter.adicionarFuncionario(funcionario2);

        System.out.println("Sweets Database - All Employees:");
        List<PSTemployee> funcionariosDatabase = databaseAdapter.listarFuncionarios();
        for (PSTemployee emp : funcionariosDatabase) {
            System.out.println("Name: " + emp.getName() + " " + emp.getCode() + ", Salary: " + emp.getSalary());
        }

        Registos petiscosRegistos = new Registos();
        PSTinterface registosAdapter = new RegistosAdapter(petiscosRegistos);

        PSTemployee funcionario3 = new PSTemployee("João", "Silva", 201, 40000);
        PSTemployee funcionario4 = new PSTemployee("Maria", "Santos", 202, 45000);
        registosAdapter.adicionarFuncionario(funcionario3);
        registosAdapter.adicionarFuncionario(funcionario4);        

        System.out.println("\nPetiscos Registos - All Employees:");
        List<PSTemployee> funcionariosRegistos = registosAdapter.listarFuncionarios();
        for (PSTemployee emp : funcionariosRegistos) {
            System.out.println("Name: " + emp.getName() + " " + emp.getCode() + ", Salary: " + emp.getSalary());
        }

        PSTdatabase pst = new PSTdatabase();
        PSTemployee funcionario5 = new PSTemployee("mario", "Silva", 201, 40000);
        PSTemployee funcionario6 = new PSTemployee("camila", "Santos", 102, 45000);
        pst.adicionarFuncionario(funcionario5);
        pst.adicionarFuncionario(funcionario6);

        System.out.println("\nPST Database - All Employees:");
        List<PSTemployee> funcionariosPST = pst.listarFuncionarios();
        for (PSTemployee emp : funcionariosPST) {
            System.out.println("Name: " + emp.getName() + " " + emp.getCode() + ", Salary: " + emp.getSalary());
        }

        System.out.println("\nSweets Database - Remove Employee with code 101 && Petiscos Registos - Remove Employee with code 201:");
        databaseAdapter.removerFuncionario(101);
        registosAdapter.removerFuncionario(201);
        funcionariosDatabase = databaseAdapter.listarFuncionarios();
        for (PSTemployee emp : funcionariosDatabase) {
            System.out.println("Name: " + emp.getName() + " " + emp.getCode() + ", Salary: " + emp.getSalary());
        }
        funcionariosRegistos = registosAdapter.listarFuncionarios();
        for (PSTemployee emp : funcionariosRegistos) {
            System.out.println("Name: " + emp.getName() + " " + emp.getCode() + ", Salary: " + emp.getSalary());
        }


        System.out.println("\nSweets Database - Verify Employee with code 102 && Petiscos Registos - Verify Employee with code 202:");
        System.out.println("Employee with code 102 exists: " + databaseAdapter.verificarFuncionario(102));
        System.out.println("Employee with code 202 exists: " + registosAdapter.verificarFuncionario(202));

        System.out.println("\nSweets Database - Verify Employee with code 101 && Petiscos Registos - Verify Employee with code 201:");
        System.out.println("Employee with code 201 exists: " + databaseAdapter.verificarFuncionario(201));
        System.out.println("Employee with code 101 exists: " + databaseAdapter.verificarFuncionario(101));



    }
}
