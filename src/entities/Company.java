package entities;

public final class Company extends TaxPayer{
	
	private Integer numberEmployees;
	
	public Company() {
		super();
	}
	

	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	

	public Integer getNumberEmployees() {
		return numberEmployees;
	}


	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}


	@Override
	public final Double tax() {
		double income;
		if (numberEmployees > 10) {
			income = getAnualIncome()* 0.14;
		}
		else {
			income = getAnualIncome() * 0.16;
			
		}
		return income;
	}
	
	

}
