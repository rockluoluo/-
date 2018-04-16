package 集合;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		/*
		 * add(Object o) :boolean
		 */
		c.add("你好");
		//自动装箱
		c.add(1);
		/*
		 * size():int
		 */
		System.out.println(c.size());
		/*
		 * clear() 清除所有元素
		 */
		c.clear();
		/*
		 * isEmpty():boolean
		 */
		System.out.println(c.isEmpty());
		
		Collection<Object> c2=new ArrayList<>();
		c2.add(new Student(12,"luoluo",24));
		c2.add(new Goods(12));
		Object[] o=c2.toArray();
		for(Object oo:o){
			Read r=(Read)oo;
			r.read();
			System.out.println(oo);
		}
	}

}
