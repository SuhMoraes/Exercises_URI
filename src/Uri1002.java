import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input =  new Scanner(System.in);
		
		Double pi = 3.14159;
		Double raio = input.nextDouble();		
		Double area = pi * Math.pow(raio, 2);
		
		
		System.out.printf("A=%.4f%n",  area);
		
		input.close();
	}	
	

}
