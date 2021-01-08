//**********************************
// 課題名 : Kad12_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/05
//**********************************
import java.util.*;
class Kad12_1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ArrayList で国名リストを作ります。"); 
		ArrayList<String> countryList = new ArrayList<String>();
		int x = 1;
		do{
			System.out.print("終了=0 追加=1 表示=2 並び替え=3 削除=4 全件削除=5:");
			try{
				x = sc.nextInt();
				if(x == 1){
					System.out.print("追加する国名：");
					countryList.add(sc.next());
				}else if(x == 2){
					for(String i : countryList){
						System.out.println(i);
					}
				}else if(x == 3){
					Collections.reverse(countryList);
					System.out.println("昇順に並び替えました。");
				}else if(x == 4){
					System.out.print("削除する国名：");
					countryList.remove(sc.next());
				}else if(x == 5){
					countryList.clear();
				}
				}catch(InputMismatchException e){
					System.out.println("入力値が不正です。");
					sc.next();
					}
				
		}while(x != 0);
		System.out.println("終了します。");
	}
}