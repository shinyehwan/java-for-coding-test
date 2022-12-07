package section3;

public class p3_1 {
	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] arr = {500, 100, 50, 10};

		for (int i = 0; i < arr.length; i++) {
			cnt += n / arr[i];
			n %= arr[i];
		}
		System.out.println(cnt);
	}
}
