package myassignmentw1;
public class IsPrimeNumber {

	public static void main(String[] a) {

		int n = 10;
		int count = 0;
		
		if(n==1)
		{
		    System.out.println(n+" is not a prime number");
		}
		else
		{
	for (int i = 1; i <=n; i++)
		{
			if( n%i==0) 
			{
				count++;
			}
					}
			if(count>2)
			{
    System.out.println(n+" is not a prime number");
    			
		}
			else
			System.out.println(n+" is prime number");
				}
	
	
}
}
