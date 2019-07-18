package Day1;

public class SumOfNumbers {


    public static void main(String[] args) {
		
 
  System.out.println(sumofodd(0,20));
  System.out.println(sumofeven(0,60));
	}

	static int sumofodd(int begin, int end) {
		int a=0;
		for(int i = begin;i<=end;i++) {
			if(i%2!=0)
				a = a+i;
				
		}
		return a;
		
		
		
	}

	static int sumofeven(int begin, int end) {
		int b=0;
		for(int i = begin;i<=end;i++) {
			if(i%2==0)
				b = b+ i;
				
		}
		return b;
		
	}

}