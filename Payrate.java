package control;
import java.util.Scanner;

public class Payrate {
	
	private double payRate;
	private boolean confirm;
	
	public Payrate(double payRate)
	{
		this.payRate = payRate;
		this.confirm = false;
	}
	
	public double getPayRate()
	{
		return payRate;
	}
	
	public void designPayrate()
	{
		System.out.println("Enter the new payrate now");
		Scanner scan = new Scanner(System.in);			 
		double newRate = scan.nextDouble();
		this.payRate = newRate;
		System.out.println("New payrate is : " + getPayRate());
	}
	
	public void approvePayrate()
	{
		this.confirm = true;
		System.out.println("Payrate is approve : " + getPayRate());
	}
	
	public void rejectPayrate()
	{
		this.confirm = false;
		System.out.println("Payrate is reject : ");
	}
	
	public void viewPayRate()
	{
		System.out.println("Payrate is : " + getPayRate());
	}
	
	//confirm payrate
	public void confirmPayrate()
	{
		System.out.println("Enter 1 to approve. Enter 2 to reject");
		Scanner scan = new Scanner(System.in);			 
		int confirm = scan.nextInt();
		if(confirm == 1)
			approvePayrate();
		if(confirm == 2)
			rejectPayrate();
		else
		{
			System.out.println("unavailable number");	
		}
	}
	
	

}
