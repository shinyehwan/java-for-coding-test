package this_is_coding_test.section5;

import java.util.LinkedList;
import java.util.Queue;

public class p5_2 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.offer(7);
		q.poll();
		q.offer(1);
		q.offer(4);
		q.poll();

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
