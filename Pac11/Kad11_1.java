//**********************************
// 課題名 : Kad11_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/29
//**********************************
class Kad11_1{
	public static void main(String[]args){
		Input input = new Input();
		System.out.println("負の整数を入力してください：");
		try{
			System.out.println("入力値：" + input.getNegativeInt());
			
		}catch(NumberFormatException e){
			System.out.println(e + "\n入力値が不正です。");
		}
	}
}