package ex1;
import java.util.ArrayList;
import java.util.List;

class Registos { 
    private ArrayList<Empregado> empregados; 
    public Registos() { 
     empregados = new ArrayList<>(); 
    } 
    public void insere(Empregado emp) { 
        empregados.add(emp);
    } 
    public void remove(int codigo) { 
        for(Empregado e : empregados)
            if(e.codigo() == codigo) {
                empregados.remove(e);
                break;
            }
    } 
    public boolean isEmpregado(int codigo) { 
        for(Empregado e : empregados)
            if(e.codigo() == codigo) {
                return true;
            }
        return false;
    } 
    public List<Empregado> listaDeEmpregados() { 
        return empregados;
    } 
    
   }