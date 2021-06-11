import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Double A, B, MEDIA;
		
		A = input.nextDouble();
		B = input.nextDouble();
		MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
		input.close();
	}

}
