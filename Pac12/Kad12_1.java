//**********************************
// �ۑ薼 : Kad12_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/05
//**********************************
import java.util.*;
class Kad12_1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ArrayList �ō������X�g�����܂��B"); 
		ArrayList<String> countryList = new ArrayList<String>();
		int x = 1;
		do{
			System.out.print("�I��=0 �ǉ�=1 �\��=2 ���ёւ�=3 �폜=4 �S���폜=5:");
			try{
				x = sc.nextInt();
				if(x == 1){
					System.out.print("�ǉ����鍑���F");
					countryList.add(sc.next());
				}else if(x == 2){
					for(String i : countryList){
						System.out.println(i);
					}
				}else if(x == 3){
					Collections.reverse(countryList);
					System.out.println("�����ɕ��ёւ��܂����B");
				}else if(x == 4){
					System.out.print("�폜���鍑���F");
					countryList.remove(sc.next());
				}else if(x == 5){
					countryList.clear();
				}
				}catch(InputMismatchException e){
					System.out.println("���͒l���s���ł��B");
					sc.next();
					}
				
		}while(x != 0);
		System.out.println("�I�����܂��B");
	}
}