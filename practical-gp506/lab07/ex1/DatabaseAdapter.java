package ex1;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAdapter implements PSTinterface{
    private Database database;

    public DatabaseAdapter(Database database) {
        this.database = database;
    }

    public void adicionarFuncionario(PSTemployee funcionario) {
        database.addEmployee(new Employee(funcionario.getName(), funcionario.getCode(), funcionario.getSalary()));
    }

    public void removerFuncionario(int codigo) {
        database.deleteEmployee(codigo);
    }

    public boolean verificarFuncionario(int codigo) {
        for(Employee e : database.getAllEmployees())
            if(e.getEmpNum() == codigo) {
                return true;
            }
        return false;
    }


    public List<PSTemployee> listarFuncionarios() {
        List<PSTemployee> funcionarios = new ArrayList<>();
        for (Employee emp : database.getAllEmployees()) {
            funcionarios.add(new PSTemployee(emp.getName(), "", (int) emp.getEmpNum(), emp.getSalary()));
        }
        return funcionarios;
    }
    
}
