package queue�ӿ�;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	public static void main(String[] args) {
		//˫�˶��еĴ���
		//offer()
		//offerFirst()
		//offerLast()
		Deque<String> deque=new LinkedList<>();
		deque.offer("��");
		deque.offerFirst("��");
		deque.offerFirst("First");
		deque.offerLast("��");
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
