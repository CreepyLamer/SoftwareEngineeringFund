package control;

public class Course {
	private String courseID;
	private String courseName;
	private String startWeek;
	private String endWeek;
	
	public Course(String courseID,String courseName,String startWeek,String endWeek) 
	{
		this.courseID = courseID;
		this.courseName = courseName;
		this.startWeek = startWeek;
		this.endWeek = endWeek;
	}
	
	public String getCourseID()
	{
		return courseID;
	}
	
	public String getcCourseName()
	{
		return courseName;
	}
	
	public String getStartWeek()
	{
		return startWeek;
	}
	
	public String getEndWeek()
	{
		return endWeek;
	}
	
	public void viewCourse()
	{
	    	System.out.printf("Course ID : %s. Course Name : %s. Start week : %s. End week : %s.\n",getCourseID(), getcCourseName(), getStartWeek(),getEndWeek());			    
	}

}
