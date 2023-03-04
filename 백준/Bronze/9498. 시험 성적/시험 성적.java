import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int score = Integer.parseInt(br.readLine());

		if (score <= 100 && score >= 90) {
			sb.append("A");
		} else if (score <= 89 && score >= 80) {
			sb.append("B");
		} else if (score <= 79 && score >= 70) {
			sb.append("C");
		} else if (score <= 69 && score >= 60) {
			sb.append("D");
		} else {
			sb.append("F");
		}
		System.out.println(sb);
	}
}
