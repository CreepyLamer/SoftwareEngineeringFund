package control;

public class Semester {
	private String semesterID;
	private String programID;

	public Semester(String semesterID,String programID) 
	{
		this.semesterID = semesterID;
		this.programID = programID;
	}
	
	public String getSemesterID()
	{
		return semesterID;
	}
	
	public String getProgramID()
	{
		return programID;
	}
	

	

}
