package hello;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue<Cat> catsQueue = new LinkedList<Cat>();
		
		Cat c1 = new Cat();
		System.out.println(c1);
		Cat c2 = new Cat();
		System.out.println(c2);
		Cat c3 = new Cat();
		System.out.println(c3);
		
		catsQueue.offer(c1);
		catsQueue.offer(c2);
		catsQueue.offer(c3);
		
		System.out.println(catsQueue.poll());
		System.out.println(catsQueue.size());
		System.out.println(catsQueue.poll());
		System.out.println(catsQueue.size());
		System.out.println(catsQueue.poll());
		System.out.println(catsQueue.size());
	}

}
