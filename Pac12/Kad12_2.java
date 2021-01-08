//**********************************
// 課題名 : Kad12_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/05
//**********************************
import java.util.*;
class Kad12_2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("HashMap で英和辞典を作ります。");
		HashMap<String, String> dictionary = new HashMap<String, String>();
		int x = 1;
		int y = 0;
		do{
			System.out.print("終了=0 追加=1 表示=2 検索=3 削除=4 全件削除=5:");
			try{
				x = sc.nextInt();
			if(x == 1){
				System.out.print("追加する英単語：");
				String a = sc.next();
				System.out.print("英単語の和訳：");
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
				System.out.print("検索する英単語：");
				System.out.print("英単語の和訳：" + dictionary.get(sc.next()) + " \n");
			}else if(x == 4){
				System.out.println("削除する英単語：");
				dictionary.remove(sc.next());
				y--;
			}else if(x == 5){
				System.out.println("全件削除しました。");
				dictionary.clear();
				y = 0;
			}
			}catch(InputMismatchException e){
					System.out.println("入力値が不正です。");
					sc.next();
				}
		}while(x != 0);
		System.out.println("終了します。");
	}
}