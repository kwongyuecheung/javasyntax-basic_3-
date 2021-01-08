//**********************************
// �ۑ薼 : Kad15_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/19
//**********************************
import java.util.*;
import java.text.SimpleDateFormat;
class Kad15_2{
	public static void main(String[]args){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		Scanner sc = new Scanner(System.in);
		System.out.println("���N�̃J�����_�[��\�����܂��B");
		System.out.print("������͂��Ă�������(1~12)�F");
		try{
			int month = sc.nextInt();
			if(month < 1 || month > 12){
				System.out.println("���͒l���͈͊O�ł��B");
				System.exit(0);
			}
			cal.set(year, month - 1, 1);
			int week = cal.get(Calendar.DAY_OF_WEEK); //�����̏����̗j���ԍ����擾(��=1, ��=2 �c �y=7)
			int day = cal.getActualMaximum(Calendar.DATE); //�����̍ŏI�����擾(1 ��=31, 2 ��=28 or 29, 4 ��=30)
			System.out.println("      2020�N" + month + "��");
			System.out.println("�� �� �� �� �� �� �y");
			System.out.println("--------------------");
			for(int i = 1; i < week ; i++){
				System.out.print("   ");
			}
			for(int i = 1; i <= day ; i++){
				
				System.out.printf("%2d ", i); //n ���E�l�� 2 ���ŕ\���i1= 1, 2= 2, 10=10, 31=31�j
				if(week == 7){
					System.out.println(" ");
					week = 0;
				}
				week++;
			}
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B");
			sc.next();
		}
	}
}