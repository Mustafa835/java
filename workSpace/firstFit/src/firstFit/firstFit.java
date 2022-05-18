=package firstFit;

public class firstFit {
	

	public static void main(String[] args) 
	{
		int[] freeBlocks = {100, 500, 200, 300, 600};
		int[] processSize = {212, 417, 112, 426, 20};
		boolean didAlocate = false;
		
		for (int i = 0; i < processSize.length; i++)
		{
			didAlocate = false;
			for (int j = 0; j < freeBlocks.length; j++) 
			{
				if(freeBlocks[j] >= processSize[i] && freeBlocks[j] != -1) 
				{
					System.out.printf("proces number %d is allocated to block number %d \n", i+1, j+1);
					freeBlocks[j] = -1;
					processSize[i] = -1;
					didAlocate=true;
					break;
				}
			}
			if(!didAlocate) {
				System.out.printf("proces number %d could not be allocated!\n", i+1);
			}
		}
		
		}

}
