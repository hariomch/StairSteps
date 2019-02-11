/*********************************************************************************************************
**Program to calculate the no. of ways of climbing a ladder of n steps taken one or two steps at a time***
/********************************************************************************************************/
import java.util.Scanner;			

public class Steps {
	
	//Function to calculate factorial of a number
	public static int fact(int a) {
		int res=1;
		for (int i=a ;i>0 ;i--) 
			res= res*i;
		return res;
	}
	
	//Method to calculate the no. of ways
	public static int num_ways(int n)
	{
		int way,count=0;
		
		for (int i=0 ; i<=n ; i++) {			// i accounts for no. of times one step is taken
			for (int j=0 ; j<=n ; j++) {		// j accounts for no. of times two steps are taken
				
				if(i+2*j==n) {					//the total no of steps should be equal to n
					way =fact(i+j)/(fact(i)*fact(j));	//way counts for permutation of particular values of i and j
					count = count + way;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		int n, ways;
		System.out.println("Enter the no. of steps: ");
		n = in.nextInt();
		
		ways = num_ways(n);
		System.out.println("The no. of ways are: " + ways);
		
		in.close();
	}

}
/***********************************COMPLETED************************************************************/

/**** This problem can also be solved by using the Fibonacci series*************************************/