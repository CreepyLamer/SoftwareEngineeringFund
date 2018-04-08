package control;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Report {


	private String report;

	public Report(String reportID,String reportTime,String action,String staff) 
	{

	    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        reportTime = df.format(new Date());
		report = String.format("reportID : %s. %s do %s on %s.\n", reportID,staff, action, reportTime);
	}
	
	public String getReport()
	{
		return report;
	}


}
