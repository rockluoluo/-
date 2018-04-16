package list线性表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("a");
		//向集合中插入数据.原位置会往后移
		list.add(1, "b");
		list.add(1, "c");
		System.out.println(list);
		//get();
		System.out.println(list.get(0));
		//size()
		for(int i=0;i<list.size();i++){
			String str=list.get(i);
			System.out.println(str);
		}
		//set(); 返回值是被删除的元素
		String old=list.set(1, "hello");
		System.out.println("被删除的元素"+old);
		System.out.println(list);
		
		List<Integer> num=new ArrayList<>();
		//此时的1,2,3 被自动装箱为Integer;
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println(num);
		//此时的1 并木有被自动装箱
		System.out.println(num.remove(1));
		System.out.println(num);
		
		//数组无法强转
		Object[] ary=list.toArray();
		System.out.println("Object"+Arrays.toString(ary));
		
		//toArray(T[] A):Type[];
		String[] strs=list.toArray(new String[0]);
		
		System.out.println("数组"+Arrays.toString(strs));
		Arrays.sort(strs);
		//asList();把数组转换为List; 这个类是Arrays的内部类
		List<String> list2=Arrays.asList(strs);
		System.out.println("通过数组转换的集合"+list2);
		// java.lang.UnsupportedOperationException 
		//		list2.add("我们");
		strs[1]="修改";
		System.out.println("通过数组转换的集合"+list2);

		
		
		
		
	}

}
