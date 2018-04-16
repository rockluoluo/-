package ¼¯ºÏ;

import java.util.ArrayList;
import java.util.Collection;

public class ForEach {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<>();
		c.add("a");
		c.add("b");
		c.add("c");
		
		for(Object obj:c){
			String str=(String)obj;
			System.out.println(str);
			if(str=="a"){
				//c.remove(str);
			}
		
		}
	}

}
