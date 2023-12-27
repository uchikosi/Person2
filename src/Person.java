
public class Person {
	public String name = null;
	public int age = 0;

	public Person( ){}
//	コンストラクタ①
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
//	コンストラクタ②

	public Person(String name){
		this.name = name; this.age = 0;
	}
//	コンストラクタ③

	public Person(int age){
		this.name = "名前"; this.age = age;
	}
//	コンストラクタ④

	public Person(int age, String name){
		this.name = name;
		this.age = age;
	}
//	コンストラクタ⑤
}
