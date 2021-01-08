//**********************************
// �ۑ薼 : Input
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/29
//**********************************
import java.util.*;
class Input{
	public int getNegativeInt(){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		if(a > 0){
			throw new NumberFormatException();
		}
		return a;
	}
	public int getPositiveInt()throws NegativeException{
		Scanner sc = new Scanner(System.in);
		int b = Integer.parseInt(sc.next());
		if(b < 0){
			throw new NegativeException();
		}
		return b;
	}
	public String getLetterString()throws NoLetterException{
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		for(int i = 0; i <= c.length() -1; i++){
			char result = c.charAt(i);
			if(Character.isLetter(result) == false){
				throw new NoLetterException();
			}
		}
		return c;
	}
}