
public class EvenandOdd {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println("Even number are: ");
		for (int i=0;i<6;i++)
		{
			if (a[i]%2==0)
				System.out.println(a[i]);
	}
		System.out.println("Odd number are: ");
		for (int i=0;i<6;i++)
		{
			if (a[i]%2!=0)
				System.out.println(a[i]);
	}
}
}