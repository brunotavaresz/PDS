package ex1;

import java.util.ArrayList;
import java.util.List;

public class RegistosAdapter implements PSTinterface {
    private Registos registos;

    public RegistosAdapter(Registos registos) {
        this.registos = registos;
    }

    public void adicionarFuncionario(PSTemployee funcionario) {
        registos.insere( new Empregado(funcionario.getName(),funcionario.getLastName() , funcionario.getCode(), funcionario.getSalary()));
    }

    public void removerFuncionario(int codigo) {
        registos.remove(codigo);
    }

    public boolean verificarFuncionario(int codigo) {
        return registos.isEmpregado(codigo);
    }


    public List<PSTemployee> listarFuncionarios() {
        List<PSTemployee> funcionarios = new ArrayList<>();
        for (Empregado emp : registos.listaDeEmpregados()) {
            funcionarios.add(new PSTemployee(emp.nome(), emp.apelido(), emp.codigo(), emp.salario()));
        }
        return funcionarios;
    }
}
