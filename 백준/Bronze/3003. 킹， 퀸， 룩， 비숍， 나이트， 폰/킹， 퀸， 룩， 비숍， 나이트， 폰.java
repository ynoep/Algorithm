import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner piece = new Scanner(System.in);
		
		int[] chess = new int[6];
		int[] fullPiece = new int[] {1, 1, 2, 2, 2, 8};
	
		for (int i = 0; i < chess.length; i++) {
			chess[i] = piece.nextInt();
		}
		
		for (int j = 0; j < fullPiece.length; j++) {
			System.out.printf("%d ", fullPiece[j] - chess[j]);
		}
	}
}