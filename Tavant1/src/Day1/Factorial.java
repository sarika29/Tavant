package Day1;

public class Factorial {


	public static void main(String[] args) {
		


System.out.println(calculateFactorial(8));
	}

	static int calculateFactorial(int n) {
		
		int l=1;
		for(int k=n;k>0;k--)
		{
			l=l*k;
		}
		return l;
	}

}
