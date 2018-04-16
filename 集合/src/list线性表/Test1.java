package listœﬂ–‘±Ì;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> array= new ArrayList<>();
		array.add(0, "hello1");
		array.set(0, "hello2");
		array.add(1, "hello3");
		for(String s:array){
			System.out.println(s);
		}
		String[] s=new String[0];
		String[] strs=array.toArray(s);
		for(String ss:strs){
			System.out.println(ss);
		}
	}
	
	

}
