package ����;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*
		 * Colleaction���ϴ�������
		 */
		@SuppressWarnings("rawtypes")
		Collection c=new ArrayList();
		//�Զ�װ��
		c.add(1);
		c.remove(1);
		c.add("a");
		String str="�ж�";
		c.add(str);
		
//		System.out.println(c);
//		System.out.println(c.size());
//		System.out.println(c.isEmpty());
//		c.clear();
//		System.out.println(c.isEmpty());
		/*
		 * contains() ����
		 */
//		System.out.println("�Ƿ����"+c.contains("a"));
		
		Collection c2=new ArrayList();
		c2.add("��Ҫ�ڶ���");
		c.add("a");
		c2.addAll(c);

		
		for(Object o:c2){
			System.out.println(o);
		}
		
		
		
		
		
		
	}

}
