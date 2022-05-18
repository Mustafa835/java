package collegeExam;


public class Course {
	private int courseNumber;
	private String courseName;
	private Lecturer teacher;
	private int finalGrade;

	public Course(int courseNumber, String courseName, Lecturer teacher) 
	{
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.teacher = teacher;
	}

	
	public int getCourseNumber() 
	{
		return courseNumber;
	}

	
	public String getCourseName() 
	{
		return courseName;
	}

	
	
	public Lecturer getTeacher() 
	{
		return teacher;
	}

	
	
	public int getFinalGrade() 
	{ 
		return finalGrade;
	}

	
	public void setCourseNumber(int courseNumber) 
	{
		this.courseNumber = courseNumber;
	}

	
	
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}

	
	
	public void setTeacher(Lecturer teacher) 
	{
		this.teacher = teacher;
	}

	
	
	public void setFinalGrade(int finalGrade) 
	{
		this.finalGrade = finalGrade;
	}

	
	public String toString() 
	{
		return "course name: " + courseName + "\n number: " + courseNumber + "\nteacher " + teacher + "\nfinal grade "
				+ finalGrade;
	}

}
