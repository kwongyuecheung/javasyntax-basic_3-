//**********************************
// �ۑ薼 : Kad15_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/19
//**********************************
import java.util.*;
import java.text.SimpleDateFormat;
class Kad15_1{
	public static void main(String[]args){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�NMM��dd��");
		System.out.println("���݂̓��t��" + sdf.format(cal.getTime()));
		Scanner sc = new Scanner(System.in);
		System.out.print("�����i�߂܂����H�F");
		try{
			int addDay = sc.nextInt();
			cal.add(Calendar.DATE,addDay);
			System.out.println(addDay + "����̓��t��" + sdf.format(cal.getTime()));
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
			sc.next();
		}
	}
}