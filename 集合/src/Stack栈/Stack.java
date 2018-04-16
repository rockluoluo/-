package Stack栈;

import java.util.Deque;
import java.util.LinkedList;

//创建栈
/*

 * 
 * 
 * push-
 * 		-
 *		- 
 * 			-	
 * 			|	|
 * 			|	|
 * 	stack	|	|
 * 			|	|
 * 			|	|
 * 			|	|
 * 			|	|
 *			----- 
 * 
 * 
 */
public class Stack {
	
	public static void main(String[] args) {
		Deque<String> deque=new LinkedList<>();
		//创建栈
		deque.push("a");
		deque.push("b");
		deque.push("c");
		System.out.println(deque);
		//弹出第一个
		System.out.println(deque.pop());
		System.out.println(deque);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
