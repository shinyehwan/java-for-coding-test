package section3;

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

		int sum = data[0] * k;
		sum += data[1] * k;

	}
}
