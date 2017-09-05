import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
public class Grades
{
	
	private static final String max = null;
	private static final String min = null;
	private static final String mean = null;
	private static final String medianValue = null;

	static double gradesMin(int [] Numbers) //finding the minimum value
	{
		{
			Arrays.sort(x);
		}
		String f = new String("C:\\Users\\csam\\eclipse-workspace\\Exam_Statistics\\src\\Numbers");
		Scanner s = new Scanner(f);
		
		int [] array = new int [0];
		int i = 0;
		int min = 0;
		for (i = 0; s.hasNextInt();	i++);
		{
			array[i] = s.nextInt();
		}
	s.close();
		
		for(int j = 0; j< 6 ; j++);
		{
			if (array[i] < min){
				min = array[i];
			}
		}
		return min;
}
	
	
	
	static int gradesMax(int [] Numbers) //Finding the maximum grade
	{
		String f = new String("C:\\Users\\csam\\eclipse-workspace\\Exam_Statistics\\src\\Numbers");
		Scanner s = new Scanner(f);
		int [] array = new int [6];
		int i = 0;
		int max = 0;
		for (i = 0; s.hasNextInt();	i++);
		{
			array[i] = s.nextInt();
		}
	s.close();
		
		max = 0;
		
		for(int j = 0; j<6 ; j++);
		{
			if (array[i] > max){
				max = array[i];
			}
		}
		return max;
}
	
	static double gradesMean(int [] Numbers) //finding the mean of the grades
	{
		String f = new String("C:\\Users\\csam\\eclipse-workspace\\Exam_Statistics\\src\\Numbers");
		Scanner s = new Scanner(f);
		int [] array = new int [6];
		int i = 0;
		int sum = 0;
		int j;
		for (i = 0; s.hasNextInt();	i++);
		{
			array[i] = s.nextInt();
		}
		s.close();
		int nbInArray = i;
		for (int k = 0; i < array[i]; i++);
		sum = sum + array[i];
		double mean = sum / array[i];
		return mean;
	}
	
	
	
	
	static double gradesMedian(int [] grades) //Finding the middle grade
	{
		String Filename = "C:\\Users\\csam\\eclipse-workspace\\Exam_Statistics\\src\\Numbers";
		int [] array = new int [6];
		int[] numArray = new int [6];
		Arrays.sort(numArray);
		int middle = numArray.length/2;
		int medianValue = 0;
		if (numArray.length%2 == 1)
			medianValue = numArray[middle];
		else medianValue = (numArray[middle-1] + numArray [middle]) /2;
		return medianValue;
		}

	static int [] gradesDistribution(int [] grades) //Finding the distributrion of grades
	{
		int [] array = new int[6];
		boolean i;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		if (90 < i < 100)
		{
		A = A++;
		}
		if else (80 < i < 89) 
		{
		B = B++;
		}
		if else (70 < i < 79)
		{
		C= C++;
		}
		if else (60 < i < 69) 
		{
		D= D++;
		}
		else (i < 59)
		{
		F= F++;
		
		}

	}
	
	static void printGradesInfo()
	{
		System.out.println("The best grade in the class is" + max);
		System.out.println("The lowest grade in the class is" + min);
		System.out.println("The Mean of the grades is" + mean);
		System.out.println("The Median grade is" + medianValue);
	}	
	
	public static void main(String[] args) throws IOException
	{
		String Filename = "C:\\Users\\csam\\eclipse-workspace\\Exam_Statistics\\src\\Numbers";
		Scanner fin = new Scanner(new FileReader(Filename));
		Scanner cin = new Scanner (System.in);
		System.out.println("What is the file you want sorted?");
		int[] x = new int [6];
		do
		{
			Arrays.sort(x);
			for(int i=0; i < 0; i++);
			{
				System.out.println(x[i]);
			}
		}
		
		while (fin.hasNextLine());
		
				
		fin.close();
		cin.close();
	}
}