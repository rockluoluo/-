package 集合;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*
		 * Colleaction集合创建对象
		 */
		@SuppressWarnings("rawtypes")
		Collection c=new ArrayList();
		//自动装箱
		c.add(1);
		c.remove(1);
		c.add("a");
		String str="判断";
		c.add(str);
		
//		System.out.println(c);
//		System.out.println(c.size());
//		System.out.println(c.isEmpty());
//		c.clear();
//		System.out.println(c.isEmpty());
		/*
		 * contains() 包含
		 */
//		System.out.println("是否包含"+c.contains("a"));
		
		Collection c2=new ArrayList();
		c2.add("我要第二个");
		c.add("a");
		c2.addAll(c);

		
		for(Object o:c2){
			System.out.println(o);
		}
		
		
		
		
		
		
	}

}
