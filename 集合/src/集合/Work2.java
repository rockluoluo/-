package ����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 2.һ�����ϴ�ŵ�����Ʒ���󣬽��˼��Ͽ����ǹ��ﳵ��

       �ֽ����ﳵ������Ϊ0����Ʒ�Ƴ��� - iterator


 */
public class Work2 {
	Collection<Goods> c=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Work2 work=new Work2();
		work.input();
		Iterator<Goods> it=work.c.iterator();
		while(it.hasNext()){
			Goods goods=it.next();
			if(goods.getNum()==0){
				it.remove();
				System.out.println(goods+"��ɾ���ɹ�");
			}
		}
		System.out.println(work.c);
		
		
	}
	void input(){
		System.out.println("��������Ʒ����Ŀ");
		int num=sc.nextInt();
		Goods goods=new Goods(num);
		c.add(goods);
		reInput();
	}
	void reInput(){
		System.out.println("�Ƿ��������1��2��");
		int i=sc.nextInt();
		if(i==1){
			input();
		}else if(i==2){
			System.out.println(c);
		}
	}

}
