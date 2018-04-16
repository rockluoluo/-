package list线性表;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("我是1");
		list.add("我是2");
		list.add("我是3");
		list.add("我是3");
		System.out.println(list);
		list.add(1, "我是新插入的2");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//删除第三个元素
		list.remove(2);
		System.out.println(list);
		
		System.out.println("元素的索引"+list.indexOf("我是新插入的2"));
		
		list.set(1, "我是新替换的2");
		System.out.println(list);
		
		System.out.println(list.subList(1, 2));
		System.out.println(list.indexOf("我是3"));
	}

}
