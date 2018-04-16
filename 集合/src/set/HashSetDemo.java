package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import list线性表.Student;

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
		System.out.println("请输入学生的id ");
		int id=sc.nextInt();
		//调用是否存在重复的id
		this.check(id);
		System.out.println("请输入学生的名字 ");
		String name=sc.next();
		System.out.println("请输入学生的年龄");
		int age=sc.nextInt();
		set.add(new Student(id,name,age));
	}
	void check(int id){
		for(Student x:set){
			if(x.getId()==id){
				System.out.println("存在重复");
				input();
				break;
			}
		}
	}
	
}
