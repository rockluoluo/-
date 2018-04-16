package 集合;

public class Goods implements Read{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Goods [num=" + num + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (num != other.num)
			return false;
		return true;
	}

	public Goods(int num) {
		super();
		this.num = num;
	}

	public Goods() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public void read(){
		System.out.println("我是商品");
	}

}
