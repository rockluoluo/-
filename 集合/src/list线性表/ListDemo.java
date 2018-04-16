package list���Ա�;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("a");
		//�򼯺��в�������.ԭλ�û�������
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
		//set(); ����ֵ�Ǳ�ɾ����Ԫ��
		String old=list.set(1, "hello");
		System.out.println("��ɾ����Ԫ��"+old);
		System.out.println(list);
		
		List<Integer> num=new ArrayList<>();
		//��ʱ��1,2,3 ���Զ�װ��ΪInteger;
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println(num);
		//��ʱ��1 ��ľ�б��Զ�װ��
		System.out.println(num.remove(1));
		System.out.println(num);
		
		//�����޷�ǿת
		Object[] ary=list.toArray();
		System.out.println("Object"+Arrays.toString(ary));
		
		//toArray(T[] A):Type[];
		String[] strs=list.toArray(new String[0]);
		
		System.out.println("����"+Arrays.toString(strs));
		Arrays.sort(strs);
		//asList();������ת��ΪList; �������Arrays���ڲ���
		List<String> list2=Arrays.asList(strs);
		System.out.println("ͨ������ת���ļ���"+list2);
		// java.lang.UnsupportedOperationException 
		//		list2.add("����");
		strs[1]="�޸�";
		System.out.println("ͨ������ת���ļ���"+list2);

		
		
		
		
	}

}
