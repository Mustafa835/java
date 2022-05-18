package firstFit;

public class bankai {

	public static void main(String[] args) {
		int[][] asign = {
				{1,2},
				{0,0},
				{2,1},
				{1,0},
				{1,4}};
		int [][] max = {
				{1,3},
				{6,0},
				{4,4},
				{5,4},
				{5,6}};
		int[] availble = {1,1};
		int [][] need = getNeed(asign, max);
		System.out.println("if safe: " + isSafe(need, availble, asign));
				
	}
	
	public static int[][] getNeed(int[][] assign, int [][] max){
		int[][] need = new int[max.length][max[0].length];
		for (int i = 0; i < max.length; i++) {
			for (int j = 0; j < max[i].length; j++) {
				need[i][j] = max[i][j] - assign[i][j];
			}
		}
		return need;
	}
	
	public static boolean isSafe(int[][] need, int[] availble, int[][] assign) {
		int[][] original_need =need;
		int[][] not_finished =  new int[need.length][need[0].length];
		int index = 0;
		boolean flag = true;
		for (int i = 0; i < need.length; i++) {
			if(need[i][0] > availble[0] || need[i][1] > availble[1]) {
				not_finished[index++] = need[i];
				 flag = false;
			}
			else {
				availble[0]+=assign[i][0];
				availble[1]+=assign[i][1];
			}
		}
		
		if(flag) {
			System.out.println("the remaining available is: "+availble[0] +", " + availble[1]);
			return true;
		}
		int last_index = -1;
		while(index != last_index) {
			 last_index = index;
			 index = 0;
			need = not_finished;
			not_finished = new int[last_index][need[0].length];
			for (int i = 0; i < not_finished.length; i++) {
				not_finished[i] = need[i];
			}
			if(not_finished.length == 0) {
				System.out.println("mid the remaining available is: "+availble[0] +", " + availble[1]);
				return true;
			}
			for (int i = 0; i < not_finished.length; i++) {
				if(not_finished[i][0] > availble[0] || not_finished[i][1] > availble[1]) {
					not_finished[index++] = need[i];
				}
				else {
					availble[0]+=assign[find(original_need, not_finished[i])][0];
					availble[1]+=assign[find(original_need, not_finished[i])][1];
				}
			}
		}
		System.out.println("the remaining available is: "+availble[0] +", " + availble[1]);
		return false;
		
		
		
	}
	
	public static int find(int[][] need, int[] value) {
	    for(int i=0; i<need.length; i++) 
	         if(need[i][0] == value[0] && need[i][1] == value[1])
	             return i;
	    return 0;
	}
	

}


