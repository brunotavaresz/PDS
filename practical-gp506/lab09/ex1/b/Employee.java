package b;

class Employee {

	private BankAccount bankAccount;
	private double salary;
	private Person name;
	
	public Employee(Person name, double salary) {
		this.name = name;
		this.salary = salary;
		bankAccount = new BankAccountProxy(new BankAccountImpl("PeDeMeia", 0));
	}

	public double getSalary() {
		return salary;
	}

	public Person getName() {
		return name;
	}
	
	public BankAccount getBankAccount() {
		return new BankAccountProxy(bankAccount);
	}
}