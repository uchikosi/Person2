
public class Test {
	public static void main(String[] args){
//		コンストラクタ1を使ったインスタンス化
		Person taro= new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

//		コンストラクタ2を使ったインスタンス化
		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

//		コンストラクタ３を使ったインスタンス化
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

//		コンストラクタ4を使ったインスタンス化
		Person nasi = new Person("名前なし",25);
		System.out.println(nasi.name);
		System.out.println(nasi.age);

//		コンストラクタ5を使ったインスタンス化
		Person hanako = new Person("hanako",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}
