//**********************************
// 課題名 : Kad11_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/29
//**********************************
class Kad11_2{
	public static void main(String[]args){
		Input input = new Input();
		System.out.println("正の整数を入力してください：");
		try{
			System.out.println("入力値：" + input.getPositiveInt());
		}catch(NumberFormatException | NegativeException  e){
			System.out.println(e + "\n入力値が不正です。");
		}
	}
}