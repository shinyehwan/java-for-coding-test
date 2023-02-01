package this_is_coding_test.section3;

import java.util.Scanner;

public class p3_4 {

    // 일단 나누기를 많이 수행해야해
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;

        while (n != 1) {
            // 이걸 반복해야해
            if (n % k == 0) {
                n /= k;
                cnt++;

            } else {
                n -= 1;
                cnt ++;
            }
        }

        System.out.println(cnt);

    }


}
