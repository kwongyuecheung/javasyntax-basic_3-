//**********************************
// �ۑ薼 : Kad12_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/05
//**********************************
import java.util.*;
class Kad12_2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("HashMap �ŉp�a���T�����܂��B");
		HashMap<String, String> dictionary = new HashMap<String, String>();
		int x = 1;
		int y = 0;
		do{
			System.out.print("�I��=0 �ǉ�=1 �\��=2 ����=3 �폜=4 �S���폜=5:");
			try{
				x = sc.nextInt();
			if(x == 1){
				System.out.print("�ǉ�����p�P��F");
				String a = sc.next();
				System.out.print("�p�P��̘a��F");
				String b = sc.next();
				dictionary.put(a,b);
				y++;
			}else if(x == 2){
				Iterator<String> dicIter = dictionary.keySet().iterator();
				while(dicIter.hasNext()){
					String getKey = dicIter.next();
					String getValue = dictionary.get(getKey);
					System.out.println(getKey + ":" + getValue);
				}
			}else if(x == 3 && y != 0){
				System.out.print("��������p�P��F");
				System.out.print("�p�P��̘a��F" + dictionary.get(sc.next()) + " \n");
			}else if(x == 4){
				System.out.println("�폜����p�P��F");
				dictionary.remove(sc.next());
				y--;
			}else if(x == 5){
				System.out.println("�S���폜���܂����B");
				dictionary.clear();
				y = 0;
			}
			}catch(InputMismatchException e){
					System.out.println("���͒l���s���ł��B");
					sc.next();
				}
		}while(x != 0);
		System.out.println("�I�����܂��B");
	}
}