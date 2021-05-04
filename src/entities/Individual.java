package entities;

public final class Individual extends TaxPayer {
	
	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	

	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	

	public double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	
	
	@Override
	public final Double tax() {
		double income;
		if (getAnualIncome() < 20000) {
			income = (getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
		}
		else { 
			income = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
				 
		}
		return income;
		}
	

}
