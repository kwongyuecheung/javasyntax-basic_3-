//**********************************
// �ۑ薼 : Kad11_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/29
//**********************************
class Kad11_3{
	public static void main(String[]args){
		Input input = new Input();
		System.out.println("���O����͂��Ă��������F");
		try{
			String name = input.getLetterString();
			System.out.println("�N�����͂��Ă��������F");
			int age = input.getPositiveInt();
			System.out.println("���O�F" + name);
			System.out.println("�N��F" + age);
		}catch(NoLetterException e){
			System.out.println(e + "\n���͒l���s���ł��B");
		}catch(NumberFormatException | NegativeException  e){
			System.out.println(e + "\n���͒l���s���ł��B");
		}
		
	}
}