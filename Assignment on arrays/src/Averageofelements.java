
public class Averageofelements 
{
	public static void main(String[] args) 
	{
		int array[]= {10,20,30,40,50};
		int sum=0; //initialization
		System.out.print("sum of elements in array = ");	
		for (int i=0;i<=4;i++)
		{
			if (i==0)
			{
				System.out.print(array[i]);
			}
			else
			{
				System.out.print("+"+array[i]);
			}
			sum=sum+array[i];
		}
System.out.println(" = "+sum);
System.out.print("Average of elements in array= ");
int Average=sum/5;
System.out.println(""+Average);
	}
}