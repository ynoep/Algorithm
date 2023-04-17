import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine()); // 472
		int B = Integer.parseInt(br.readLine()); // 385

		String StrB = String.valueOf(B);
		String[] numB = StrB.split("");

		int Ba = Integer.parseInt(numB[2]);
		int Bb = Integer.parseInt(numB[1]);
		int Bc = Integer.parseInt(numB[0]);

		System.out.println(A * Ba);
		System.out.println(A * Bb);
		System.out.println(A * Bc);

		System.out.println((A * Bc * 100) + (A * Bb * 10) + (A * Ba));
	}

}