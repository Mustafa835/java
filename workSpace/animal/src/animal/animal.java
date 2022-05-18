package animal;

public abstract class  animal {
	
	private String animal_name;
	private int old;
	private boolean isPredetor;
	private int klori;
	
	public animal (String animal_name,int old,boolean isPredetor,int klori) 
	{
		this.animal_name = animal_name;
		this.old = old;
		this.isPredetor = isPredetor;
		this.klori = klori;
		
	}

	public String getAnimal_name()
	{
		return animal_name;
	}

	public void setAnimal_name(String animal_name) 
	{
		this.animal_name = animal_name;
	}

	public int getOld() 
	{
		return old;
	}

	public void setOld(int old) 
	{
		this.old = old;
	}

	public boolean isPredetor() 
	{
		return isPredetor;
	}

	public void setPredetor(boolean isPredetor) 
	{
		this.isPredetor = isPredetor;
	}

	public int getKlori() 
	{
		return klori;
	}

	public void setKlori(int klori) 
	{
		this.klori = klori;
	}

	
	public String toString() 
	{
		return "animal [animal_name:" + animal_name + ", old:" + old + ", isPredetor:" + isPredetor + ", klori:" + klori
				+ "]";
	}
	
	public int getEat()
	{
		return this.klori*3;
	}
	
	
}
