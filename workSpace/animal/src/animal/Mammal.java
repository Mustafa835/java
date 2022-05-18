package animal;

public class Mammal  extends animal{

	
	private int klori_milk;
	private int month_pregnent;
	
	public Mammal(String animal_name, int old, boolean isPredetor,int klori, int klori_milk,int month_prengnent) 
	{
		super(animal_name, old, isPredetor, klori);
		this.klori_milk = klori_milk;
		this.month_pregnent = month_pregnent;
		
	}

	public int getKlori_milk()
	{
		return klori_milk;
	}

	public void setKlori_milk(int klori_milk) 
	{
		this.klori_milk = klori_milk;
	}

	public int getMonth_pregnent() 
	{
		return month_pregnent;
	}

	public void setMonth_pregnent(int month_pregnent) 
	{
		this.month_pregnent = month_pregnent;
	}

	@Override
	public String toString() {
		return "Mammal [ Animal_name=" + getAnimal_name() + ", Old="
				+ getOld() + ", isPredetor()=" + isPredetor() + ", Klori()=" + getKlori() + "month_pregnent=" + month_pregnent+"]";
	}
	
	
	

}
