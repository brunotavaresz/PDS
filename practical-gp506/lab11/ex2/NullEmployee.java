package ex2;

public class NullEmployee extends Employee {
    public NullEmployee() {
        this.name = "Não encontrado";
    }
    
    @Override
    public String getName() {
        return name;
    }
}
