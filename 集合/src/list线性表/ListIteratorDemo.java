package listœﬂ–‘±Ì;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator it=list.listIterator();
		
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("_________");
		
		while(((ListIterator<Integer>) it).hasPrevious()){
			System.out.println(((ListIterator<Integer>) it).previous());
		}
		
	
	}

}
