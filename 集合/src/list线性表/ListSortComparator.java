package list线性表;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortComparator {

	public static void main(String[] args) {
		Student s1=new Student(1,"luo",3);
		Student s2=new Student(2,"bao",2);
		Student s3=new Student(2,"bao",4);
		List<Student> list=new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		Collections.sort(list,new ByAge());
		System.out.println(list);

	}

}

class ByAge implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		//按照年龄排序
		return o1.getAge()-o2.getAge();
	}
	
}