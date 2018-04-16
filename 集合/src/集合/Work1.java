package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/*
 * 1.在控制台输入n个学生的信息，存放到集合中。

       学生信息包括：姓名（String），学号（int），分数（double）
 */
public class Work1 {
	Collection<Student> c=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		Work1 work=new Work1();
		work.input();
		System.out.println("输入要判断的学生id");
		int id=work.sc.nextInt();
		
		boolean flag=false;
		for(Student s:work.c){
			
			if(s.equals(id)){
				System.out.println("存在");
				flag=true;
				break;
			}
			
			
		}
		if(!flag){
			System.out.println("不存在");
		}
	
		
		
		
	}
	void input(){
		System.out.println("请输入学生姓名,6到10位字母与数字的组合不能是纯字母，也不能是纯数字");
		String name=sc.next();
		//判断name是否合法
		legal(name);
		
		
		System.out.println("请输入学生id");
		int id=sc.nextInt();
		System.out.println("请输入学生分数");
		double score=sc.nextDouble();
		
		Student s=new Student(id,name,score);
		c.add(s);
		reLoad();
	}
	void reLoad(){
		System.out.println("是否继续输入信息:1 继续 2停止");
		int i=sc.nextInt();
		switch (i){
		case 1:
			input();
			break;
		case 2:
			System.out.println(c);
		}
		
	}
	//判断是否合法
	void legal(String name){
		//6到10位字母与数字的组合不能是纯字母，也不能是纯数字
		
//		String regex2="([a-zA-Z]+[0-9]+){5,9}";
		String regex="(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,10}";
		while(!(name.matches(regex))){
			System.out.println("用户名输入不合法,请重新输入");
			name=sc.next();
		}
		System.out.println("用户名输入合法");
	
		
	}
	
	

}
