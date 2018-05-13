package control;
import java.util.Scanner;

public abstract class Control implements Adminstartor,Apporvaer,CourseCondinator,CouseStaff{
	static int user = -1;
	static Session session[] = new Session[5];

	static int s = 0;
	
			
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		for(int i =0;i <session.length;i++)
			session[i] = new Session("empty", "empty", "empty", "empty", 0);
		
		//JUST FOR THE TEST
		List list = new List();
		
	    boolean login = false;
	
		
		for(;;)
		{
			login = function0(list);
			while(login)
			{
				//test function
				System.out.println("\nNow test start!");
				System.out.println("0.log in.");
				System.out.println("1.select timetable.");
				System.out.println("2.view course.");
				System.out.println("3.upload staff.");
				System.out.println("4.view payrate. and confirm。");
				System.out.println("5.view and change payrate。");
				System.out.println("6。make a session。");
				System.out.println("7。view session。");
				System.out.println("8.view report");
				System.out.println("9.design time");
				System.out.println("10.confirm session");
				
				System.out.println("20。log out。");
				
				
				int n = scan.nextInt();
				
					
				//select timetable
				
				if(n == 1)
					function1(list);
				//view course
				if(n == 2)
					function2(list);
				
				//upload staff
				if(n == 3)
					function3(list);
				
				//view payrate
				if(n == 4)
					function4(list);
				
				// change payrate		
				if(n == 5)
					function5(list);
				
				//make a session
				if(n == 6)
					function6(list);
				
				//view session
				if(n == 7)
					function7(list);
				
				//view report
				if(n == 8)
					function8(list);
				
				//design time
				if(n == 9)
					function9(list);
				
				//confirm session
				if(n == 10)
					function10(list);
					
				//log out
				if(n == 20)
					login = function20(list);
				//end
			}
		}
		
		
	}
	
	public static boolean function0(List list)
	{
		boolean check = false;
		while(check == false)
		{
		System.out.println("Please Enter you ID number whithout s");
		Scanner scan = new Scanner(System.in);
		int ID = makeChoose("ID",9999999)+1;
		for(int i = 0 ; i < list.getStaffList().length;i++)
		{
			if(ID == list.getStaffList()[i].getID())
			{
				user = i;
				check = true;
			}
				
		}
		if(check == false)
			System.out.println("Can not find this ID.");
		}
		
		list.getStaffList()[user].checkPassword();
		list.getReport().runReport(list.getStaffList()[user].getName(), "0.log in");
		return true;
	}
	public static void function1(List list)
	{		
		for(int i = 0;i < list.getTimeList().length;i++)
		{
			System.out.print("\n"+(i + 1) + ". ");
			list.getTimeList()[i].showAvaliableTime();
		}
		int t = makeChoose("Time",list.getTimeList().length);
		list.getTimeList()[t].selectTime();
		list.getReport().runReport(list.getStaffList()[user].getName(), "1.select timetable ");
	}
	
	public static void function2(List list)
	{		
		for(int i = 0;i < list.getCourseList().length;i++)
		{
			System.out.print(i + 1 + ". ");
			list.getCourseList()[i].viewCourse();
		}
		list.getReport().runReport(list.getStaffList()[user].getName(), "2.view course ");
	}	
	
	public static void function3(List list)
	{		
		System.out.println("please choose the staff");
		for(int i = 0;i < list.getStaffList().length;i++)
		{
			System.out.print(i + 1 + ". ");
			list.getStaffList()[i].viewStaffDetial();	
		}
		int s =  makeChoose("staff",list.getStaffList().length);
		list.getStaffList()[s].uploadStaff();
		list.getReport().runReport(list.getStaffList()[user].getName(), "3.upload staff ");
	}
	
	public static void function4(List list)
	{
		System.out.println("please choose the payrate of course");
		for(int i = 0;i < list.getCourseList().length;i++)
		{
			System.out.print(i + 1 + ". ");
			list.getCourseList()[i].viewCourse();
		}
		int p = makeChoose("course",list.getCourseList().length);
		System.out.print(list.getCourseList()[p - 1].getcCourseName());
		list.getPayrateList()[p].viewPayRate();
		list.getPayrateList()[p].confirmPayrate();
		list.getReport().runReport(list.getStaffList()[user].getName(), "4.view payrate. and confirm。");
	}
	
	public static void function5(List list)
	{		
		System.out.println("please choose the payrate of course");
		for(int i = 0;i < list.getCourseList().length;i++)
		{
			System.out.print(i + 1 + ". ");
			list.getCourseList()[i].viewCourse();
		}
		int p = makeChoose("course",2);
		System.out.print(list.getCourseList()[p - 1].getcCourseName());
		list.getPayrateList()[p].viewPayRate();
		list.getPayrateList()[p].designPayrate();
		list.getReport().runReport(list.getStaffList()[user].getName(), "5.view and change payrate。");
	}
	public static void function6(List list)
	{		
		session[s].changeCourse(list.selectCourse());
		session[s].changeLocation(list.selectLocation());
		session[s].changePayRate(list.selectPayrate());
		session[s].changeStaff(list.selectStaff());
		session[s].changeTime(list.selectTime());
		s++;
		list.getReport().runReport(list.getStaffList()[user].getName(), "6。make a session");
	}
	

	public static void function7(List list)
	{	
		if(s ==0)
			System.out.println("No session yet");
		for(int i = 0;i <s;i++)
		{
			System.out.print("Session: "+(i+1)+": ");
			session[i].viewSession();
		}
		list.getReport().runReport(list.getStaffList()[user].getName(), "7。view session");
	}
	
	public static void function8(List list)
	{	
		list.getReport().viewReport();
		list.getReport().runReport(list.getStaffList()[user].getName(), "8。view report");
	}
	
	public static void function9(List list)
	{	
		for(int i = 0;i < list.getTimeList().length;i++)
		{
			System.out.print("\n"+(i + 1) + ". ");
			list.getTimeList()[i].viewTime();
		}
		int time = makeChoose("change Time",list.getTimeList().length);
		list.getTimeList()[time].viewTime();
		System.out.println("1 = change date , 2 = change start time , 3 = change end time");
		Scanner scan = new Scanner(System.in);
		int choose = makeChoose("change",3);
		
		if(choose == 0)
				System.out.println("Entter new date");
				String  date = scan.nextLine();
				list.getTimeList()[time].changeDate(date);
		if(choose == 1)
				System.out.println("Entter new start time");
				String st = scan.nextLine();
				list.getTimeList()[time].changeDate(st);
		if(choose == 2)
				System.out.println("Entter new end time");
				String et = scan.nextLine();
				list.getTimeList()[time].changeDate(et);
		
		list.getReport().runReport(list.getStaffList()[user].getName(), "9.design time");
		
	}
	
	public static void function10(List list)
	{	
		if(s ==0)
			System.out.println("No session yet");
		for(int i = 0;i <s;i++)
		{
			System.out.print("Session "+(i+1)+": ");
			session[i].viewSession();
		}
		Scanner scan = new Scanner(System.in);
		int choose = makeChoose("session",s);
		session[choose].viewSession();
		System.out.println("Enter 1 = confirm. Enter 2 = reject");
		int cj = makeChoose("confirm",2);
		if(cj==1)
			session[choose].confirm();
		if(cj==2)
			session[choose].reject();
		
		
		list.getReport().runReport(list.getStaffList()[user].getName(), "9.design time");
		
	}
	
	public static boolean function20(List list)
	{
		list.getReport().runReport(list.getStaffList()[user].getName(), "20.log out");
		return false;
	}
	
	public static void report(List list,String action)
	{
		list.getReport().runReport(list.getStaffList()[user].getName(), action);
	}
	
	public static int makeChoose(String select,int length)
	{
		System.out.println("\nEnter number for " + select);
		int choose = -1;
		while(choose < 0 || choose > length)
		{
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		if(choose < 0 || choose > length)
			System.out.println("The number should between 1 ~ "+length);
		}
		return choose - 1;
			
	}



}
