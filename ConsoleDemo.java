import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;

/*
 *  Basic console IO demo.
 */
public class ConsoleDemo {

	public static void main(String[] args) throws IOException {
		System.out.print("Ange ett tal: ");
		BufferedReader input = 
				new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(input);
		if (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			System.out.println("Talet är " + number);
		}
		else {
			System.out.println("Det var inget tal?");
		}
	}
}
