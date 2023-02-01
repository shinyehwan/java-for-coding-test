package this_is_coding_test.section3;

import java.util.Arrays;
import java.util.Scanner;

// 각 행 마다 가장 낮은 수를 찾은 뒤 그 중에서 가장 큰 수를 뽑는다.
public class p3_3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		int[][] arr = new int[n][m];
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//
//		// 행 마다 분류 해서 가장 작은 값을 찾는다
//		for (int i = 0; i < n; i++) {
//			Arrays.sort(arr[i]);
//		}
//
//		// arr[i][0] 중에서 가장 큰 값
//		int max = 0;
//		for (int i = 0; i < n; i++) {
//			if (arr[i][0] > max) {
//				max = arr[i][0];
//			}
//		}
//
//		System.out.println(max);
//
//	}

// 각 행 마다 가장 낮은 수를 찾은 뒤 그 중에서 가장 큰 수를 뽑는다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;

		for (int i = 0; i < n; i++) {
			int min_value = 10001;

			for (int j = 0; j < m; j++) {
				int x = sc.nextInt();
				min_value = Math.min(min_value, x);
			}

			result = Math.max(result, min_value);
		}

		System.out.println(result);

	}
}
