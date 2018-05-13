package control;
import java.util.Scanner;

public class List {
	
	Course courseList[] = new Course[5];
	Time timeList[] = new Time[10];
	Location locationList[] = new Location[5];
	Detail staffList[] = new Detail[5];
	Payrate payrateList[] = new Payrate[5];
	Report report = new Report();
	public List() 
	{
		newList();
	}
	public void newList()
	{
		CourseList();
		LocationList();
		TimeList();
		payrateList();
		staffList();
	}	
	
	public Report getReport()
	{
		return report;
	}
	public Course[] getCourseList()
	{
		return courseList;
	}
	public Time[] getTimeList()
	{
		return timeList;
	}
	public Location[] getLocationList()
	{
		return locationList;
	}
	public Detail[] getStaffList()
	{
		return staffList;
	}
	public Payrate[] getPayrateList()
	{
		return payrateList;
	}
	
	public void viewCourseList()
	{
		for(int i = 0 ; i < courseList.length ; i++ )
		{
			System.out.print(i + 1 + ". ");
			courseList[i].viewCourse();
		}
	}
	public void viewTimeList()
	{
		for(int i = 0 ; i < timeList.length ; i++ )
		{
			System.out.print(i + 1 + ". ");
			timeList[i].viewTime();
		}
	}	
	public void viewLocationList()
	{
		for(int i = 0 ; i < locationList.length ; i++ )
		{
			System.out.print(i + 1 + ". ");
			locationList[i].viewLocation();
		}
	}
	public void viewStaffList()
	{
		for(int i = 0 ; i < staffList.length ; i++ )
		{
			System.out.print(i + 1 + ". ");
			staffList[i].viewStaffDetial();
		}
	}
	public void viewPayrate()
	{
		for(int i = 0 ; i < locationList.length ; i++ )
		{
			System.out.print(i + 1 + ". ");
			payrateList[i].viewPayRate();
		}
	}
	
	
	
	
	
	public String selectCourse()
	{
		viewCourseList();
		int choose = makeChoose("Course",courseList.length);
		return courseList[choose].getcCourseName();
	}
	public String selectLocation()
	{
		viewLocationList();
		int choose = makeChoose("Location",locationList.length);
		return locationList[choose].getRoomLocation();
		
	}	
	public String selectTime()
	{
		viewTimeList();
		int choose = makeChoose("Time",timeList.length);
		return timeList[choose].getTime();
	}
	public String selectStaff()
	{
		viewStaffList();
		int choose = makeChoose("Staff",staffList.length);
		return staffList[choose].getName();
	}
	public double selectPayrate()
	{
		viewPayrate();
		int choose = makeChoose("Payrate",payrateList.length);
		return payrateList[choose].getPayRate();
	}
	
	
	
	
	
	
	public int makeChoose(String select,int length)
	{
		System.out.println("\nEnter number to select " + select);
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
	
	
	
	public void CourseList()
	{
		for(int i = 0 ; i < courseList.length ; i++ )
			courseList[i] = new Course("COCS000"+i,"CouseName"+i,"startWeek"+i,"endWeek"+i);	
		courseList[0] = new Course("COCS1111", "SEF", "Week1", "Week12");
		courseList[1] = new Course("COCS2222", "IT", "Week1", "Week12");
	}
	public void LocationList()
	{
		for(int i = 0 ; i < locationList.length ; i++ )
			locationList[i] = new Location("Room00"+i,"10.10.00"+i);		
	}
	public void TimeList()
	{
		for(int i = 0 ; i < timeList.length ; i++ )
			timeList[i] = new Time("date"+i,"starTime"+i,"endTime"+i);	
		
		timeList[0] = new Time("1:30pm","3:30pm","Wednesday");
		timeList[1] = new Time("3:30pm","5:30pm","Monday");
	}
	public void payrateList()
	{
		for(int i = 0 ; i < payrateList.length ; i++ )
			payrateList[i] = new Payrate((i+1)*10);	
		payrateList[0] = new Payrate(4500);
		payrateList[1] = new Payrate(3800);
	}	
	public void staffList()
	{
		for(int i = 0 ; i < staffList.length ; i++ )
			staffList[i] = new Detail("Name"+i,0000000+i,i+1,000);
		staffList[0] = new Detail("Edgar",3598097,5,2012);
		staffList[1] = new Detail("Victor",1234567,1,7654321);
		staffList[2] = new Detail("Jeff",3571902,2,2091753);
		staffList[3] = new Detail("Sil",3661514,3,4151663);
	}
	
}
