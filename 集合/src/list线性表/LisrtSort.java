package list���Ա�;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LisrtSort {
	public static void main(String[] args) {
		Student s1=new Student(1,"luo",3);
		Student s2=new Student(2,"bao",2);
		Student s3=new Student(2,"bao",4);
//		List<Student> list=new ArrayList();
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println("�����"+list);
//		
		List<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		//�ڱȽ���,����Student�ж����compareTo()���бȽ�
		Collections.sort(list);
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO �Զ����ɵķ������
				return o1.getAge()-o2.getAge();
			}
		});
		
	}

}
