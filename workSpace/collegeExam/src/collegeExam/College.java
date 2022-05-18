package collegeExam;

 public class College {
	
	private int maxStudents = 100;
	private int amountOfStudent = 0;
	private Student[] students = new Student[maxStudents];
	private int maxTeachers = 30;
	private int amountOfLecturer = 0;
	private Lecturer[] teachers = new Lecturer[maxTeachers];
	private int maxCourses = 50;
	private int amountOfCourses = 0;
	private Course[] courses = new Course[maxCourses];

	
	public Student[] getStudent() 
	{
		return students;
	}

	
	public Lecturer[] getLecturer() 
	{
		return teachers;
	}

	
	public Course[] getCourse() 
	{
		return courses;
	}

	
	public void setStudent(Student[] students) 
	{
		this.students = students;
	}

	
	public void setLecturer(Lecturer[] teachers) 
	{
		this.teachers = teachers;
	}

	
	public void setCourse(Course[] courses) 
	{
		this.courses = courses;
	}

	
	public String toString() 
	{
		if (students != null) 
		{
			for (int i = 0; i < students.length; i++) 
			{
				if (students[i] != null) 
				{
					System.out.println(students[i].toString());
				}
			}
		}
		if (teachers != null) {
			for (int i = 0; i < teachers.length; i++) 
			{
				if (teachers[i] != null) 
				{
					System.out.println(teachers[i].toString());
				}
			}

		}
		return "1";
	}

	
	
	public void addCourse(Course newCourse) 
	{
		if (amountOfCourses < maxCourses) 
		{
			courses[amountOfCourses++] = newCourse;
		}
	}

	
	public void addLecturer(Lecturer newTeacher) 
	{
		if (amountOfLecturer < maxTeachers) 
		{
			teachers[amountOfLecturer++] = newTeacher;
		}
	}

	
	
	public void addStudent(Student newStudent) 
	{
		if (amountOfStudent < maxStudents) 
		{
			students[amountOfStudent++] = newStudent;
		}
	}

	
	public void bestStudent(Student[] students) 
	{
		int index = 0;
		if (students != null) 
		{
			for (int i = 0; i < amountOfStudent; i++) 
			{
				if (students[i] != null) {
					if (students[i].getAvarage() > students[index].getAvarage()) 
					{
						index = i;
					}
				}
			}
			System.out.println("the best student is: " + students[index].getName());
		}
		System.out.println("no students are registered yet");
	}

	
	public void intiteldForDegree() 
	{
		if (students != null) 
		{
			boolean isIntiteld = false;
			Course[] studentsCourses = new Course[students[0].getCourse().length];
			for (int i = 0; i < amountOfStudent; i++) 
			{
				if (students[i] != null) 
				{
					studentsCourses = students[i].getCourse();
					isIntiteld = false;
					for (int j = 0; j < studentsCourses.length; j++) 
					{
						if (studentsCourses[j] != null) 
						{
							if (studentsCourses[j].getFinalGrade() < 55) 
							{
								isIntiteld = true;
								break;
							}
						}
					}
					if (!isIntiteld) {
						System.out.println(students[i].getName());
					}

				}
			}
		}
	}

}
