import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine()); // 472
		String B = br.readLine(); // 385
		String[] numB = B.split("");

		int Ba = Integer.parseInt(numB[2]);
		int Bb = Integer.parseInt(numB[1]);
		int Bc = Integer.parseInt(numB[0]);

		int result1 = A * Ba;
		int result2 = A * Bb;
		int result3 = A * Bc;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1 + (result2 * 10) + (result3 * 100));

	}

}