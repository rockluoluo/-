package Stackջ;

import java.util.Deque;
import java.util.LinkedList;

//����ջ
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
		//����ջ
		deque.push("a");
		deque.push("b");
		deque.push("c");
		System.out.println(deque);
		//������һ��
		System.out.println(deque.pop());
		System.out.println(deque);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
