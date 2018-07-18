class Bank {
	double bal;
	public Bank(double i)
	{
		bal=i;//Constructor usage
	}
	double withdraw(double w)
	{
		int options = 1;
                if(options==0)
        {
     	  bal = (double) (bal- w-(w*0.004)/10); //balance updation after withdrawal 
           System.out.println("Withdrawn amount is "+w+" and new balance is "+bal+"\n");
        } 
     	  else 
     	    {
             bal = (double) (bal - w-(w*0.005)/10); //balance updation after withdrawal
             options=1;
             System.out.println("Withdrawn amount is "+w+" and new balance is "+bal+"\n");
            } 
		return bal;
	}
	double deposit(double f)
	{
		int options = 0;
		if(options==0)
        {
     	  bal = (double) (bal + f-(f*0.004)/10); //balance updation after deposit
           System.out.println("Deposited "+f+" and new balance is "+bal+"\n");
        } 
     	  else {
             bal = (double) (bal+ f-(f*0.005)/10); //balance updation after deposit
              options=0;
              System.out.println("Deposited "+f+" and new balance is "+bal+"\n");
   }
		return bal;	
	}
	void bal()
	{
		System.out.println("Final balance is: "+bal);
	}
	public static void main(String[] args) {
		Bank b=new Bank(100);
		b.withdraw(35);
		b.deposit(55);
		b.withdraw(23);
		b.withdraw(33);
		b.deposit(10);
		b.bal();
	}
}