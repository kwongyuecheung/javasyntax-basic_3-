//**********************************
// 課題名 : Kad15_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/19
//**********************************
import java.util.*;
import java.text.SimpleDateFormat;
class Kad15_1{
	public static void main(String[]args){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在の日付は" + sdf.format(cal.getTime()));
		Scanner sc = new Scanner(System.in);
		System.out.print("何日進めますか？：");
		try{
			int addDay = sc.nextInt();
			cal.add(Calendar.DATE,addDay);
			System.out.println(addDay + "日後の日付は" + sdf.format(cal.getTime()));
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。");
			sc.next();
		}
	}
}