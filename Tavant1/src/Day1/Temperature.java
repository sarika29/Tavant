package Day1;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToCelcius(76));
		System.out.println(convertToFarenheit(20));
	}
public static double convertToFarenheit(double celcius) {
	double res1 = 9 * (celcius / 5) + 32;
	return res1;
}
public static double convertToCelcius(double farenheit) {
	double res2 = (farenheit - 32)*5/9;
	return res2;
}
	}

