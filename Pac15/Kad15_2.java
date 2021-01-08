//**********************************
// 課題名 : Kad15_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/19
//**********************************
import java.util.*;
import java.text.SimpleDateFormat;
class Kad15_2{
	public static void main(String[]args){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		Scanner sc = new Scanner(System.in);
		System.out.println("今年のカレンダーを表示します。");
		System.out.print("月を入力してください(1~12)：");
		try{
			int month = sc.nextInt();
			if(month < 1 || month > 12){
				System.out.println("入力値が範囲外です。");
				System.exit(0);
			}
			cal.set(year, month - 1, 1);
			int week = cal.get(Calendar.DAY_OF_WEEK); //当月の初日の曜日番号を取得(日=1, 月=2 … 土=7)
			int day = cal.getActualMaximum(Calendar.DATE); //当月の最終日を取得(1 月=31, 2 月=28 or 29, 4 月=30)
			System.out.println("      2020年" + month + "月");
			System.out.println("日 月 火 水 木 金 土");
			System.out.println("--------------------");
			for(int i = 1; i < week ; i++){
				System.out.print("   ");
			}
			for(int i = 1; i <= day ; i++){
				
				System.out.printf("%2d ", i); //n を右詰め 2 桁で表示（1= 1, 2= 2, 10=10, 31=31）
				if(week == 7){
					System.out.println(" ");
					week = 0;
				}
				week++;
			}
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
			sc.next();
		}
	}
}