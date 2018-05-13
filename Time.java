package control;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time {
	
	
	private String date;
	private String startTime;
	private String endTime;
	private boolean available;
	
	
	public Time(String date,String startTime,String endTime) 
	{
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		available = true;
		
	}
	
	public String getDate()
	{
		return date;
	}
	
	public String getStartTime()
	{
		return startTime;
	}
	
	public String getEndTime()
	{
		return endTime;
	}
	
	

	//view location
	public String getTime()
	{
		String time = "Date : "+date+ " Start time : "+startTime+" End time : "+endTime;
		return time;
	}
	public void viewTime()
	{
	    	System.out.printf("Date : %s. Start time : %s End time : %s\n",getDate(),getStartTime(),getEndTime());			    
	}

	public void selectTime()
	{
		if(available == false)
			System.out.println("unavailable number");
		else 
		{
			available = false;
			System.out.printf("You have booked Start time : %s. End time : %s. Date  :%s .\n",getStartTime(), getEndTime(), getDate());	
			
		}
	}
	
	public  void showAvaliableTime()
	{
		if(available == true)
		{
			System.out.printf("Start time : %s. End time : %s. Date  :%s .",getStartTime(), getEndTime(), getDate());			
		}	
	}
	
	public  void changeDate(String date)
	{
		this.date = date;
	}
	public  void changeST(String startTime)
	{
		this.startTime = startTime;
	}
	public  void changeET(String endTime)
	{
		this.endTime = endTime;
	}
	
}
