package control;
import java.util.Scanner;

public class Detail {
	
	private String name;
	private String ID;
	private String staff; // 1 = Adminstartor ; 2 = Apporvaer ; 3 = CourseCondinator ; 4 = CouseStaff ; 5 = training;
	

	public Detail(String name,String ID,int staff) 
	{
		this.name = name;
		this.ID = ID;
		addStaff(staff);
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public String getStaff()
	{
		return staff;
	}
	
	public void showStaff()
	{
		System.out.printf(" Name : %s. ID : %s. Staff  :%s .\n",getName(), getID(), getStaff());	
	}
	
	public void addStaff(int staff)
	{
		if(staff == 1)
			this.staff = "Administrator";
		if(staff == 2)
			this.staff = "Approver";
		if(staff == 3)
			this.staff = "CourseCoordinator";
		if(staff == 4)
			this.staff = "CasualStaff";
		if(staff == 5)
			this.staff = "training";
		else
			System.out.println("unavailable number");
	}
	
	
	public void uploadStaff()
	{
		System.out.println("please enter number to choose :1 = Administrator ; 2 = Approver ; 3 = CourseCoordinator ; 4 = CasualStaff ; 5 = training;");
		Scanner scan = new Scanner(System.in);
			 
		int staff = scan.nextInt();
		addStaff(staff);
		System.out.printf("%s is %s now.",name,this.staff);

		
	}
		
}
