package homework3;
import java.util.Scanner;

public class atm {
	float b=0,d=0,w=0,s=0;
	String[] p={"9565","7328","9275","5739","4455","6748"};
	Scanner sc=new Scanner(System.in);
	String pwd;
	int accdetails() throws Exception
	{
		System.out.println("hey, what is your account number??");
		int acc=sc.nextInt();
		sc.nextLine();
	    System.out.println("hey,what is the password??");
	    pwd=sc.nextLine();
	      if(p[acc].equals(pwd))
	    	  return 1;
	      else
	      {
	    	  throw new Exception("You have entered Incorrect Password");
	      }
	}
	int functionality()
	{
		System.out.println("1 if you want to deposit");
		System.out.println("2 if you want to withdraw");
		System.out.println("3 if you want to enquire you balance");
		System.out.println("4 if you want to exit");
		System.out.println("enter your choice");
		int c=sc.nextInt();
		return c;
	}
	void balanceEnquiry()
	{
		System.out.println(b);
	}
	public void deposit()
	{
		System.out.println("Enter the amount you want to deposit!!");
		d=sc.nextFloat();
		b+=d;
	}
	public void withdrawal() throws Exception 
	{
		System.out.println("Enter the amount you want to withdraw!!");
		w=sc.nextFloat();
		if(w>20000)
			throw new Exception("More than 20k rupees in one time is not allowed");
		else if((b-w)<0)
			throw new Exception("Insufficient balance");
		else
			b-=w;
	}
	
	public static void main(String args[]) throws Exception
	{
		atm a=new atm();
		int ch=0;
		int check=a.accdetails();
		if(check==1)
		{	
		while(ch!=4)
		{
			ch=a.functionality();
			switch(ch)
			{
			case 1://Deositing amount
				a.deposit();
				break;
			case 2://Withdrawing amount
				a.withdrawal();
				break;
			case 3://Balance enquiry
				a.balanceEnquiry();
				break;
			case 4://Termination
				System.out.println("You are exiting from atm");
				break;
			}
		}
		}
	}
}
