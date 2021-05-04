package Aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List<TaxPayer> list = new ArrayList<>();
	
	System.out.print("Enter the number of tax payers: ");
	int n = sc.nextInt();
	sc.nextLine();
		
	for(int i=1; i <= n; i++) {
		System.out.println("Tax payer #" + i + " data:");
		System.out.print("Individual or company (i/c)? ");
		char acc = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Anual income:");
		double anualIncome = sc.nextDouble();
		if (acc == 'c') {
			System.out.print("Number of employees: ");
			int numberEmployees = sc.nextInt();
			sc.nextLine();
			list.add(new Company(name, anualIncome, numberEmployees));
		}
		else {
			System.out.print("Health expenditures: ");
			double healthExpenditures = sc.nextDouble();
			sc.nextLine();
			list.add(new Individual(name, anualIncome, healthExpenditures));
		}	
		
		
	}
	double taxes = 0;
	System.out.println();
	System.out.println("TAXES PAID:");
	for (TaxPayer tag : list) {
		double tp = tag.tax();
		System.out.println(tag.getName() 
				+ ": $" 
				+ String.format("%.2f" , tp));
		taxes += tp;
	}
	System.out.println();
	System.out.println("TOTAL TAXES: $ " + String.format("%.2f" , taxes));
	
	
	
	sc.close();
			
	}

}
