package list���Ա�;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	public Student() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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
		// TODO �Զ����ɵķ������
		return age-o.age;
	}
	
	//����������
//	@Override
//	public int compareTo(Student o) {
//		// TODO �Զ����ɵķ������
//		return name.compareTo(o.name);
//	}
	
	
	
	
	

}
