package control;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Report {


	private String report;
	private int id;

	//make report
	public Report() 
	{
		id = 0;
		report = "Report:\n";
	}
	
	//run report
	public void runReport(String staff,String action)
	{
		id++;
		report = report+" reportID:  "+id+" "+staff+" do "+action+"\n";
	}
	public String getReport()
	{
		return report;
	}
	
	public void viewReport()
	{
		System.out.println(report);
	}


}
