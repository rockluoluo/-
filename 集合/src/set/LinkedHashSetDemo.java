package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> link=new LinkedHashSet<String>();
		link.add("ÄãºÃ");
		link.add("Äã»µ");
		System.out.println(link);
		link.remove("ÄãºÃ");
		System.out.println(link);
		link.add("ÄãºÃ");
		System.out.println(link);
		
		
	}

}
