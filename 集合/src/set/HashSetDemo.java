package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import list���Ա�.Student;

public class HashSetDemo {
	
	Set<Student> set=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		HashSetDemo demo=new HashSetDemo();
		demo.input();
		demo.input();
		demo.input();
		System.out.println(demo.set);
		
		
		
	}
	void input(){
		System.out.println("������ѧ����id ");
		int id=sc.nextInt();
		//�����Ƿ�����ظ���id
		this.check(id);
		System.out.println("������ѧ�������� ");
		String name=sc.next();
		System.out.println("������ѧ��������");
		int age=sc.nextInt();
		set.add(new Student(id,name,age));
	}
	void check(int id){
		for(Student x:set){
			if(x.getId()==id){
				System.out.println("�����ظ�");
				input();
				break;
			}
		}
	}
	
}
