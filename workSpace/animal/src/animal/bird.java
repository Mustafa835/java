package animal;

public class bird extends animal{
	
	private int heigth_fly;
	private int wings;
	
	public bird(String animal_name, int old, boolean isPredetor,int klori,int heigth_fly,int wings)
	{
		super(animal_name, old, isPredetor, klori);
		this.heigth_fly = heigth_fly;
		this.wings = wings;
	}
	

}
