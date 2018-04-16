package queue接口;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	public static void main(String[] args) {
		//双端队列的创建
		//offer()
		//offerFirst()
		//offerLast()
		Deque<String> deque=new LinkedList<>();
		deque.offer("你");
		deque.offerFirst("我");
		deque.offerFirst("First");
		deque.offerLast("他");
		deque.offerLast("Last");
		
		System.out.println(deque);
		//poll()
		//pollFirst()
		//pollLast()
		System.out.println(deque.poll());
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		
		System.out.println(deque);
		
		//peek()
		//peekFirst()
		//peekLast()
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
	}
}
