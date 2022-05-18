package person;

public class course {

	private int courseNumber ;
	private String courseName ; 
	private Lecturer teacher ;
	private int finalGrade ;
	
	public course(int courseNumber ,String courseName ,Lecturer teacher , int finalGrade )
	{
		this.courseName = courseName ;
		this.courseNumber = courseNumber ;
		this.teacher = teacher ;
	}

	public int getCourseNumber() 
	{
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) 
	{
		this.courseNumber = courseNumber;
	}

	public String getCourseName() 
	{
		return courseName;
	}

	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}

	public Lecturer getTeacher() 
	{
		return teacher;
	}

	public void setTeacher(Lecturer teacher) 
	{
		this.teacher = teacher;
	}

	public int getFinalGrade() 
	{
		return finalGrade;
	}

	public void setFinalGrade(int finalGrade) 
	{
		this.finalGrade = finalGrade;
	}
	
}
