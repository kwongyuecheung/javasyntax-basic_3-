//**********************************
// �ۑ薼 : Kad11_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/29
//**********************************
class Kad11_2{
	public static void main(String[]args){
		Input input = new Input();
		System.out.println("���̐�������͂��Ă��������F");
		try{
			System.out.println("���͒l�F" + input.getPositiveInt());
		}catch(NumberFormatException | NegativeException  e){
			System.out.println(e + "\n���͒l���s���ł��B");
		}
	}
}