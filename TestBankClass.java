package oops;

public class TestBankClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankClass bankClass;
		//BankClass bankClass2=new BankClass();
		bankClass=new Sbi();
		Sbi sbi=new Sbi();
		System.out.println(sbi.rateOfInterest());
		System.out.println(sbi.schemeOfLoans());

		System.out.println(bankClass.rateOfInterest());
		System.out.println(bankClass.schemeOfLoans());
		bankClass=new Icici();
		System.out.println(bankClass.rateOfInterest());
		System.out.println(bankClass.schemeOfLoans());	}

}
