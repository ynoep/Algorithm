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

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken()); // 첫째 줄에 N과 X 입력

		int[] arr = new int[N]; // 정수 N개의 배열 생성

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); // 수열 A값 넣기
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < X) {
				bw.write(arr[i] + " ");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}