package list���Ա�;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("����1");
		list.add("����2");
		list.add("����3");
		list.add("����3");
		System.out.println(list);
		list.add(1, "�����²����2");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		//ɾ��������Ԫ��
		list.remove(2);
		System.out.println(list);
		
		System.out.println("Ԫ�ص�����"+list.indexOf("�����²����2"));
		
		list.set(1, "�������滻��2");
		System.out.println(list);
		
		System.out.println(list.subList(1, 2));
		System.out.println(list.indexOf("����3"));
	}

}
