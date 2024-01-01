
public class Person {

	public String name = null;
	public int age = 0;

//	コンストラクタ①デフォルトコンストラクタ
	public Person( ){}

//	コンストラクタ②
	public Person(String name, int age){
		this.name = name;
		this.age = age;
//		this.とはこのクラスのインスタンスのフィールド(変数)であるこ とを表す。
//		testクラスにあるPerson jiro = new Person("jiro", 20);の部分で使われる
	}

//	コンストラクタ③
	public Person(String name){
		this.name = name;
		this.age = 0;
	}

//	コンストラクタ④
	public Person(int age){
		this.name = "名前なし";
		this.age = age;
	}

//	コンストラクタ⑤
	public Person(int age, String name){
		this.name = name;
		this.age = age;
	}

}
//2 コンストラクタ・・・インスタンス化する時の窓口、受皿のイメージ。色々な形でコピ ーすることが出来ます。