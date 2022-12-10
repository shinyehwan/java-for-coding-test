package this_is_coding_test.section3;

import java.util.Arrays;
import java.util.Scanner;

public class p3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		Arrays.sort(data);


		// 수열을 찾아내는 것이 중요하다
		int cnt = (m / (k + 1)) * k;
		cnt += m % (k + 1);

		int first = data[n - 1];
		int second = data[n - 2];

		int result = first * cnt;
		result += second * (m - cnt);

		System.out.println(result);

	}
}
