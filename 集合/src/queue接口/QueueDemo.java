package queue�ӿ�;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		//LinkedList ��ʵ����List ��ʵ����Dueue
		Queue<String> queue=new LinkedList<>();
		//��Ӳ��� boolean offer(E e)
		//�����add ��������ʱ �ᱨ��
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		System.out.println(queue);
		
		//pool();�õ����еĵ�һ��,��ɾ��
		System.out.println(queue.poll());
		System.out.println(queue);
		//peek();͵�����еĵ�һ��
		System.out.println(queue.peek());
		System.out.println(queue);
		//push() ������еĵ�һ��
		((LinkedList) queue).push("a");
		System.out.println(queue);
		
		
		
		
	}

}
