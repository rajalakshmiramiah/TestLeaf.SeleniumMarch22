package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int[] intArray = new int[11];
		intArray[0]=0;
		intArray[1]=1;
		
		for (int i=2;i<=9;i++)
			
		{
							
			System.out.println(intArray[i]);
			
			intArray[i+1]=intArray[i]+ intArray[i-1];
		}

	}

}
