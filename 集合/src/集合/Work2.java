package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 2.一个集合存放的是商品对象，将此集合看成是购物车，

       现将购物车中数量为0的商品移除掉 - iterator


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
				System.out.println(goods+"被删除成功");
			}
		}
		System.out.println(work.c);
		
		
	}
	void input(){
		System.out.println("请输入商品的数目");
		int num=sc.nextInt();
		Goods goods=new Goods(num);
		c.add(goods);
		reInput();
	}
	void reInput(){
		System.out.println("是否继续输入1是2否");
		int i=sc.nextInt();
		if(i==1){
			input();
		}else if(i==2){
			System.out.println(c);
		}
	}

}
