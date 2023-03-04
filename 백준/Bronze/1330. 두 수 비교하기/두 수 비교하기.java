import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		int A = scan.nextInt();
		int B = scan.nextInt();

		if (A > B) {
			sb.append(">");
		} else if (A < B) {
			sb.append("<");
		} else {
			sb.append("==");
		}

		System.out.println(sb);
	}

}
