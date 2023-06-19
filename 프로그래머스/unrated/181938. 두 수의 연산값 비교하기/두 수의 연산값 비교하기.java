class Solution {
    public int solution(int a, int b) {
		int numA = Integer.parseInt(a + "" + (b + ""));
		int numB = 2 * a * b;

		return numA >= numB ? numA : numB;
	}
}