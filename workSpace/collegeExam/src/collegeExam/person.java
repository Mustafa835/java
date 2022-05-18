package collegeExam;


public class person {

	private String Name;
	private int id;
	
	public person(String Name , int id)
	{
		this.Name=Name;
		this.id=id;
	}

	/**
	 * @return the name 
	 */
	public String getName()
	{
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		Name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) 
	{
		this.id = id;
	}
	
	
	

}
