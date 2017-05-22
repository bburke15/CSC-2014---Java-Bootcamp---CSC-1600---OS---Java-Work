
public class OnePercent {

	public static void main(String[] args) {
		Account acct1 = new Account ("Donald Trump", 20230715, 400);
	      Account acct2 = new Account ("Bill Gates", 31558040, 500);
	      Account acct3 = new Account ("Warren Buffet", 44003050, 600);
	      Account acct4 = new Account ("Uncle Sam", 999999999);
			
	      System.out.println (acct1);
	      System.out.println (acct2);
	      System.out.println (acct3);
	      System.out.println (acct4);
			
	    /*  acct1.deposit (25.85);
	      acct1.withdraw (60, 2.50);*/

	      System.out.println ();
	      System.out.println ("Before Taxes: ");
	      System.out.println (acct1.toString());
	      System.out.println (acct2.toString());
	      System.out.println (acct3.toString());
	      System.out.println (acct4.toString());
	      
	      double total = acct1.getBalance() + acct2.getBalance() + acct3.getBalance() + acct4.getBalance();
	      System.out.println("The total amount of money in the bank is $" + total);
	      
	      double tax_rate = 0.15;
	      double tax_1 = acct1.getBalance()*tax_rate;
	      double tax_2 = acct2.getBalance()*tax_rate;
	      double tax_3 = acct3.getBalance()*tax_rate;
	      double totax = tax_1 + tax_2 + tax_3;
	      
	      acct1.withdraw(tax_1);
	      acct2.withdraw(tax_2);
	      acct3.withdraw(tax_3);
	      acct4.deposit(totax);
	      
	      System.out.println ();
	      System.out.println ("After Taxes: ");
	      System.out.println (acct1.toString());
	      System.out.println (acct2.toString());
	      System.out.println (acct3.toString());
	      System.out.println (acct4.toString());
	      
	      //add some Interest
	      acct1.addInterest(0.015);
	      acct2.addInterest(0.015);
	      acct3.addInterest(0.015);
	      acct4.addInterest(0.015);
	      
	      System.out.println ();
	      System.out.println ("After Adding Interest: ");
	      System.out.println (acct1.toString());
	      System.out.println (acct2.toString());
	      System.out.println (acct3.toString());
	      System.out.println (acct4.toString());
	      
	}

}
