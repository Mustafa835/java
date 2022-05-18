package files;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class program {
	
	public static void creatTest(PrintWriter pw) 
	{
		Scanner s = new Scanner (System.in);
		
		int grade = 0;
		for (int i = 0; i < 10; i++) {
			int leftNum = (int) (Math.random()*100)+1;
			int schooseproblem = (int) (Math.random()*4)+1;
			int rightNum = (int) (Math.random()*100)+1;
			char problem = '0';
			double as;
			double answer = 0.0;
			switch(schooseproblem) {
			case 1 : problem = '+'; answer = leftNum + rightNum ;break; 
			case 2 : problem = '-'; answer = leftNum - rightNum ;break; 
			case 3 : problem = '*'; answer = leftNum * rightNum ;break; 
			case 4 : problem = '/'; answer = leftNum / rightNum ;break; 
			}
			pw.write(leftNum + " " + problem + " " + rightNum+ "=\n" );
		}
		pw.close();
	}
	
	public static int solveExampe(File f) throws FileNotFoundException {
		Scanner s = new Scanner(f);
		int grade = 0;
		for (int i = 0; i <10; i++) {
			double leftNum = s.nextDouble();
			char problem = s.next().charAt(0);
			double rightNum = s.nextDouble();
			s.next().charAt(0);
			double userAnswer = s.nextDouble();
			double answer = 0.0 ;
			
			switch (problem) { 
			case '+': answer = leftNum + rightNum ;break;
			case '-': answer = leftNum - rightNum ;break;
			case '*': answer = leftNum * rightNum ;break;
			case '/': answer = leftNum / rightNum ;break; 
			}
			if (userAnswer == answer)
			{
				grade+=10;
			}
		}
		
		return 0;
		
	}
	
	
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("my_test.txt");
		if (!f.exists())
		{
			f.createNewFile();
		}
		PrintWriter pw = new PrintWriter(f);
		creatTest(pw);
		pw.close();
		
		
	}

}
