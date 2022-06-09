package j;

import java.util.Scanner;

public class A02 {
  public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int R = sc.nextInt();
		int N = sc.nextInt();
		int[][] inputs = new int[N][2];
		for (int i = 0; i < N; i++) {
			inputs[i][0] = sc.nextInt();
			inputs[i][1] = sc.nextInt();
		}
		sc.close();

		// 실행
		String[] results = solution(x, y, R, inputs);

		// 출력
		for (String result : results) {
			System.out.println(result);
		}
	}

	private static String[] solution(int x, int y, int R, int[][] inputs) {
		String[] results = new String[inputs.length];
		for (int i = 0; i < inputs.length; i++) {
			double distanceSquared = Math.pow(inputs[i][0] - x, 2) + Math.pow(inputs[i][1] - y, 2);
			if (distanceSquared >= Math.pow(R, 2)) {
				results[i] = "silent";
			} else {
				results[i] = "noisy";
			}
		}
		return results;
	}
}
