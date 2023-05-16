import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());	// 입력 받은 문자열 공백 기준으로 분리

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int v = Integer.parseInt(br.readLine());

		for (int i = 0; i < arr.length; i++) {	//배열 길이만큼 반복하면서 두 정수 비교
			if (v == arr[i]) {
				count++;
			}
		}
		br.close();
		System.out.println(count);
	}
}
