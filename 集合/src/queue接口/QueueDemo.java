package queue接口;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		//LinkedList 既实现了List 又实现了Dueue
		Queue<String> queue=new LinkedList<>();
		//入队操作 boolean offer(E e)
		//如果用add 当容量满时 会报错
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		System.out.println(queue);
		
		//pool();得到队列的第一个,并删除
		System.out.println(queue.poll());
		System.out.println(queue);
		//peek();偷看对列的第一个
		System.out.println(queue.peek());
		System.out.println(queue);
		//push() 插入队列的第一个
		((LinkedList) queue).push("a");
		System.out.println(queue);
		
		
		
		
	}

}
