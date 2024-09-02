package ex1;

import java.util.Vector;

public class Database {
    private Vector<Employee> employees;

    public Database() {
        employees = new Vector<>();
    }

    public boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    public void deleteEmployee(long emp_num) {
        for(Employee e : employees)
            if(e.getEmpNum() == emp_num) {
                employees.remove(e);
                break;
            }
    }

    public Employee[] getAllEmployees() {
        return employees.toArray(new Employee[0]);
    }
}