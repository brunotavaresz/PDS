package ex1;

import java.util.List;

interface PSTinterface {
    void adicionarFuncionario(PSTemployee funcionario);
    void removerFuncionario(int codigo);
    boolean verificarFuncionario(int codigo);
    List<PSTemployee> listarFuncionarios();
}