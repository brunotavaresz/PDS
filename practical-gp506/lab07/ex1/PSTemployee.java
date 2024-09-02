package ex1;

public class PSTemployee {
    private String name;
    private String last_name;
    private int code;
    private double salary;

    public PSTemployee(String name, String surname, int code, double salary) {
        this.name = name;
        this.last_name = surname;
        this.code = code;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return last_name;
    }

    public int getCode() {
        return code;
    }

    public double getSalary() {
        return salary;
    }
}
