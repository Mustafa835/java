package collegeExam;


public class Lecturer extends person {
	private final short maxCourses = 5;
	private Course[] course = new Course[maxCourses];
	private short experience;
	private int amountOfCourses = 0;

	
	
	public Lecturer(int id, String name, short experience) 
	{
		super(name, id);
		this.experience = experience;
	}

	
	
	public short getExperience() 
	{
		return experience;
	}

	
	
	public Course[] getCourse() 
	{
		return course;
	}

	
	
	public void setExperience(short experience) 
	{
		this.experience = experience;
	}

	
	
	public void setCourse(Course[] course) 
	{
		registerToCourses(course);
	}

	
	
	public void addCourse(Course newCourse) 
	{
		if (amountOfCourses < maxCourses) 
		{
			course[amountOfCourses++] = newCourse;
		}
	}

	
	
	public void removeCourse(Course course) 
	{
		if (amountOfCourses > 0) 
		{
			for (int i = 0; i < this.course.length; i++) 
			{
				if (this.course[i].getCourseNumber() == course.getCourseNumber()) 
				{
					this.course[i] = this.course[amountOfCourses--];
				}
			}
		}
	}

	
	
	public String toString() 
	{
		return super.toString() + "\nyears of experience " + experience + "\ncourses: " + printCourse();
	}

	
	
	// private method to print the teacher courses.
	private int printCourse() 
	{
		if (amountOfCourses > 0) 
		{
			for (int i = 0; i < course.length; i++) 
			{
				if (course[i] != null) 
				{
					System.out.print(course[i].getCourseName() + " ");
				}
			}
		}
		return 1;
	}

	
	
	// counts how many courses the student has registered to.
	private void registerToCourses(Course[] course) 
	{
		if (course != null) 
		{
			for (int i = 0; i < course.length; i++) 
			{
				if (course[i] != null && amountOfCourses < maxCourses) 
				{
					amountOfCourses++;
					this.course[i] = course[i];
				}
			}
		}
	}

}
