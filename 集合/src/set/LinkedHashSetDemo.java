package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> link=new LinkedHashSet<String>();
		link.add("���");
		link.add("�㻵");
		System.out.println(link);
		link.remove("���");
		System.out.println(link);
		link.add("���");
		System.out.println(link);
		
		
	}

}
