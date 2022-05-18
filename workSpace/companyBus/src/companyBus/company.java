package companyBus;

public class company {
	
	private bus[] buses;
	private int maxBus =100;
	private int amountOfBus = 0;
	
	public company(bus[] buses)
	{
		this.buses = new bus[maxBus];
		for (int i = 0; i < buses.length; i++) 
		{
			if(buses[i] != null)
			{
				amountOfBus++;
			}
		}
	}
	
	public void addBus(bus newBus) throws Exception
	{
		if(buses != null)
		{
			for(int i=0 ; i<buses.length; i++)
			{
				if(buses[i].getnumber() == newBus.getnumber())
				{
					throw new Exception("oops! you have a like bus");
				}
				else if ( buses[i] == null)
				{
					buses[amountOfBus++] = newBus ;
				}
			}
		}else
			{
				buses[amountOfBus++] = newBus ;
			}
	}
	
	
	public void removeBus(int number)
	{
		for(int i =0 ; i<amountOfBus; i++)
		{
			if(buses[i].getnumber() == number)
			{
				buses[i] = null;
				amountOfBus--;
			}
		}
	}
	
	
	
	
	
	
	
	
}
