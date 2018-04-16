package list线性表;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO 自动生成的方法存根
		return age-o.age;
	}
	
	//按照姓名排
//	@Override
//	public int compareTo(Student o) {
//		// TODO 自动生成的方法存根
//		return name.compareTo(o.name);
//	}
	
	
	
	
	

}
