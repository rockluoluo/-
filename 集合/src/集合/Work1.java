package ����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/*
 * 1.�ڿ���̨����n��ѧ������Ϣ����ŵ������С�

       ѧ����Ϣ������������String����ѧ�ţ�int����������double��
 */
public class Work1 {
	Collection<Student> c=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		Work1 work=new Work1();
		work.input();
		System.out.println("����Ҫ�жϵ�ѧ��id");
		int id=work.sc.nextInt();
		
		boolean flag=false;
		for(Student s:work.c){
			
			if(s.equals(id)){
				System.out.println("����");
				flag=true;
				break;
			}
			
			
		}
		if(!flag){
			System.out.println("������");
		}
	
		
		
		
	}
	void input(){
		System.out.println("������ѧ������,6��10λ��ĸ�����ֵ���ϲ����Ǵ���ĸ��Ҳ�����Ǵ�����");
		String name=sc.next();
		//�ж�name�Ƿ�Ϸ�
		legal(name);
		
		
		System.out.println("������ѧ��id");
		int id=sc.nextInt();
		System.out.println("������ѧ������");
		double score=sc.nextDouble();
		
		Student s=new Student(id,name,score);
		c.add(s);
		reLoad();
	}
	void reLoad(){
		System.out.println("�Ƿ����������Ϣ:1 ���� 2ֹͣ");
		int i=sc.nextInt();
		switch (i){
		case 1:
			input();
			break;
		case 2:
			System.out.println(c);
		}
		
	}
	//�ж��Ƿ�Ϸ�
	void legal(String name){
		//6��10λ��ĸ�����ֵ���ϲ����Ǵ���ĸ��Ҳ�����Ǵ�����
		
//		String regex2="([a-zA-Z]+[0-9]+){5,9}";
		String regex="(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,10}";
		while(!(name.matches(regex))){
			System.out.println("�û������벻�Ϸ�,����������");
			name=sc.next();
		}
		System.out.println("�û�������Ϸ�");
	
		
	}
	
	

}
