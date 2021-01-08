//**********************************
// 課題名 : Kad11_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/29
//**********************************
class Kad11_3{
	public static void main(String[]args){
		Input input = new Input();
		System.out.println("名前を入力してください：");
		try{
			String name = input.getLetterString();
			System.out.println("年齢を入力してください：");
			int age = input.getPositiveInt();
			System.out.println("名前：" + name);
			System.out.println("年齢：" + age);
		}catch(NoLetterException e){
			System.out.println(e + "\n入力値が不正です。");
		}catch(NumberFormatException | NegativeException  e){
			System.out.println(e + "\n入力値が不正です。");
		}
		
	}
}