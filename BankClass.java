package oops;

public abstract class BankClass {
	//non abstract method 
	int rateOfInterest()
	{
	return 0;
	}
	//abstract method=>no body
	abstract String schemeOfLoans();
	//body will be defined inside the child class

}
