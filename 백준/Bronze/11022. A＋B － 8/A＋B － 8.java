import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int numA = Integer.parseInt(st.nextToken());
			int numB = Integer.parseInt(st.nextToken());
			int result = numA + numB;

			bw.write("Case #" + i + ": " + numA + " + " + numB + " = " + result);
			bw.newLine();
		}
		bw.close();
	}
}
