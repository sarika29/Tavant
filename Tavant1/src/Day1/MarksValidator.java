package Day1;

public class MarksValidator {

	
	public static void main(String[] args) {
		
  String a = (markGrade(60));;
		System.out.println(isPass(48));
    System.out.println(a);
	}
public static boolean isPass(int mark) {
	if (mark>=40)
	return true;
	else 
		return false;
	
}	
public static String markGrade (int mark) 
{if(isPass(mark))
{	if (mark>90)
			System.out.println("Grade A");
		else if(mark>75 && mark<90)
			System.out.println("Grade B");
		else if(mark>60 && mark<75)
			System.out.println("Grade C");
}
		else 
			System.out.println("Grade D");
return null;

		
	}
}
