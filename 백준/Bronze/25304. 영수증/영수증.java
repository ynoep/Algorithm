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

		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int total = 0;

		for (int i = 1; i <= n; i++) {	// 가격a * 개수b

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			total += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}

		if (x == total) {
			bw.append("Yes");
		} else {
			bw.append("No");
		}
		bw.flush();
		bw.close();
	}
}
