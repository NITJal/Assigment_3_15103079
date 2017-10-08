package homework3;
import java.util.Scanner;
public class admission {
	String name;
	String email;
	String rollNo;
	String address;
	String phone;
	float hsc;
	float ug;
	Scanner sc=new Scanner(System.in);
	boolean bool;
	void info() throws Exception 
	{
		System.out.println("Enter your roll number");	
		rollNo=sc.nextLine();
		bool=isNumeric(rollNo);
		if(bool==false)
			throw new Exception("Enter a valid roll number");
	    
		System.out.println("Enter your name");	
	    name=sc.nextLine();
	    bool=containsNumber(name);
	    if(bool==true)
		    throw new Exception("Invalid name as it contains numbers");
	
	    System.out.println("Enter your address");	
		address=sc.nextLine();
		
	    System.out.println("Enter your mobile number");	
	    phone=sc.nextLine();
	    bool=isNumeric(phone);
	    if(bool==false)
		    throw new Exception("Enter a valid phone number");
	
	    System.out.println("Enter email address");	
	    email=sc.nextLine();
	
	    System.out.println("Enter your HSC marks percentage");	
	    hsc=sc.nextFloat();
	    
	    System.out.println("Enter your UG marks percentage");	
	    ug=sc.nextFloat();
	}
	void display()
	{
		if(hsc>=60 && ug>=70)
			System.out.println(name+"having roll number"+rollNo+" is eligible for admission");
		else
			System.out.println(name+"having roll number"+rollNo+" is not eligible for admission");
	}
	boolean containsNumber(String c) 
	{
        char[] s=new char[10];
        s=c.toCharArray();

        for(int i=0;i<s.length;i++) 
        {
            if((s[i]>=48) && (s[i]<=57)) 
            {
                return true;
            }
        }
        return false;
    }
	boolean isNumeric(String s)
	{
	    for(char c: s.toCharArray())
	    {
	        if(!Character.isDigit(c)) 
	        	return false;
	    }
	    return true;
	}
	public static void main(String[] args) throws Exception
	{
		admission a=new admission();
		a.info();
		a.display();
	}
}
