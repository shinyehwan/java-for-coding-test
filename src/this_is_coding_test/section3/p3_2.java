package this_is_coding_test.section3;

import java.util.Arrays;
import java.util.Scanner;

public class p3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

//		int cnt = 0;
//		int sum = 0;
//
//		for (int i = 0; i < m; i++) {
//
//			int first = arr[arr.length - 1];
//			int second = arr[arr.length - 2];
//			cnt ++;
//
//			if (cnt % k == 0) {
//				sum += second;
//			} else {
//				sum += first;
//			}
//		}
//
//		System.out.println(sum);
		int sum = 0;
		int first = arr[arr.length - 1];
		int second = arr[arr.length - 2];

		int dum = (m / (k + 1));
		sum += (dum * first * k) + (dum * second) + (m % (k + 1) * first);

		System.out.println(sum);
	}
}
