package control;

public class Session {
	private String course;
	private String time;
	private String location;
	private String staff;
	private double payRate;
	private boolean confirm;
	
	public Session( String course,String time,String location,String staff,double payRate)
	{
		this.course = course;
		this.time = time;
		this.location = location;
		this.staff = staff;
		this.payRate = payRate;	
		confirm = false;
	}
	
	public String getCourse()
	{
		return course;
	}
	public String getTime()
	{
		return time;
	}
	public String getLocation()
	{
		return location;
	}
	public String getStaff()
	{
		return staff;
	}
	public double getPayRate()
	{
		return payRate;
	}
	public String getConfirm()
	{
		if(confirm)
			return "Yes";
		else
			return "No";
	}
	
	public void changeCourse(String course)
	{
       this.course= course;
	}
	public void changeTime(String time)
	{
		this.time = time;
	}
	public void changeLocation(String location)
	{
		this.location = location;
	}
	public void changeStaff(String staff)
	{
		this.staff = staff;
	}
	public void changePayRate(double payRate)
	{
		this.payRate = payRate;
	}
	public void confirm()
	{
		confirm = true;
		System.out.println("Session has confirmed");
		viewSession();
	}
	public void reject()
	{
		confirm = false;
		System.out.println("Session has rejected");
		viewSession();
	}
	
	public void viewSession()
	{
		System.out.printf("\nCourse : %s. \nTime : %s. \nLocation  :%s. \nStaff : %s. \nPayrate : %.1f. \nConfirm : %s.\n",getCourse(), getTime(), getLocation(),getStaff(),getPayRate(),getConfirm());	
	}
}
