package collegeExam;

import java.util.Random;

public class Student extends person {
	
	private final short maxCourses = 15;
	private Course[] course = new Course[maxCourses];
	private int amountOfCourses = 0;
	private Random rand = new Random();

	
	public Student(int id, String name, Course[] course) 
	{
		super(name , id);
		registerToCourses(course);
	}

	
	public double getAvarage() 
	{
		int counter = 0;
		double avarage = 0;
		if (course != null) 
		{
			for (int i = 0; i < course.length; i++) 
			{
				if (course[i] != null) 
				{
					counter++;
					avarage += course[i].getFinalGrade();
				}
			}
		}
		return avarage / counter;
	}

	
	  Course[] getCourse() 
	{
		return course;
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
					this.course[i]=course[i];
				}
			}
		}
	}

	
	
	public String toString() 
	{
		return super.toString() + "\n courses and grades: " + printCourse();
	}

	
	private void setGrade() 
	{
		if (course != null) 
		{
			for (int i = 0; i < course.length; i++) 
			{
				if (course[i] != null) 
				{
					course[i].setFinalGrade(rand.nextInt(61) + 40);
				}
			}
		}
	}
	
	
	
	// private method to print the teacher courses.
	private int printCourse() 
	{
		if (course != null) 
		{
			for (int i = 0; i < course.length; i++) 
			{
				if (course[i] != null) 
				{
					System.out.print(course[i].getCourseName() + " " + course[i].getFinalGrade());
				}
			}
		}
		return 1;
	}
}
