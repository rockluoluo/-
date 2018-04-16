package ¼¯ºÏ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> list=new ArrayList<>();
		list.add("hello");
		list.add("hello2");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
			if("hello".equals(str)){
				it.remove();
			}
		}
		
	}
	

}
