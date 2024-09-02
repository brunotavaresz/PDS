package ex1;

import java.util.ArrayList;
import java.util.List;

public class PSTdatabase {
    private List<PSTemployee> employees;

    public PSTdatabase() {
        employees = new ArrayList<>();
    }

    public void adicionarFuncionario(PSTemployee funcionario) {
        employees.add(funcionario);
    }

    public void removerFuncionario(int codigo) {
        for(PSTemployee e : employees)
            if(e.getCode() == codigo) {
                employees.remove(e);
                break;
            }
    }

    public boolean verificarFuncionario(int codigo) {
        for(PSTemployee e : employees)
            if(e.getCode() == codigo) {
                return true;
            }
        return false;
    }

    public List<PSTemployee> listarFuncionarios() {
        return employees;
    }

}
