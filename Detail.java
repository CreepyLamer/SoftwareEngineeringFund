package control;
import java.util.Scanner;

public class Detail {
	
	private String name;
	private int ID;
	private int staffLv; // 1 = Adminstartor ; 2 = Apporvaer ; 3 = CourseCondinator ; 4 = CouseStaff ; 5 = training; 
	private int passWord;
	

	public Detail(String name,int ID,int staffLv,int passWord) 
	{
		this.name = name;
		this.ID = ID;
		this.staffLv = staffLv;
		this.passWord = passWord;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public int getStaffLv()
	{
		return staffLv;
	}
	
	public int getPassWord()
	{
		return passWord;
	}
	public String getStaff()
	{
		if(staffLv == 1)
			return  "Adminstartor";
		if(staffLv == 2)
			return "Apporvaer";
		if(staffLv == 3)
			return "CourseCondinator";
		if(staffLv == 4)
			return "CouseStaff";
		if(staffLv == 5)
			return "Training";
		else
			return "Unknow";
	}
	
	public void viewStaffDetial()
	{
		System.out.printf(" Name : %s. ID : s%d. Staff  :%s .\n",getName(), +getID(), getStaff());	
	}
	
	
	public void checkPassword()
	{
		Scanner scan = new Scanner(System.in);
		boolean correct = true;
		int passWord;
		while(correct)
		{
		System.out.println("Please enter the password");	
		passWord = scan.nextInt();
		if(this.passWord == passWord)
			correct = false;
		else
		{
			System.out.println("Password wrong!");
			System.out.println(this.passWord);
		}
		}
	}
	public void chageUserPassword()
	{
		checkPassword();
		Scanner scan = new Scanner(System.in);	
		System.out.println("Please enter new password");
		passWord = scan.nextInt();
	}
	
	public void changeName()
	{
		checkPassword();
		Scanner scan = new Scanner(System.in);	
		System.out.println("Please enter new name");
		name = scan.nextLine();
	}
	
	public void uploadStaff()
	{
		

		System.out.println("please enter number to choose :1 = Adminstartor ; 2 = Apporvaer ; 3 = CourseCondinator ; 4 = CouseStaff ; 5 = Training;");
		Scanner scan = new Scanner(System.in);	 
		int choose = scan.nextInt();
		staffLv = choose;
		System.out.printf("%s is %s now.",name,getStaff());

		
	}
	
}
