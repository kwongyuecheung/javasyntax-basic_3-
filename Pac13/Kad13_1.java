//**********************************
// 課題名 : Kad13_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/10
//**********************************
import java.io.File;  // Import the File class
import java.util.*;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.io.FileReader;
class Kad13_1{
	public static void main(String[]args){
		final String FILENAME = "kadai.txt";
		try {
      		File myObj = new File(FILENAME); // Specify the filename
     		 if(myObj.createNewFile()) {
       			System.out.println(FILENAME + "を作成しました。");
				FileWriter fw = new FileWriter(FILENAME);
				Scanner sc = new Scanner(System.in);
				System.out.print(FILENAME + "に書き込む文字を入力：");
				fw.write(sc.next());
				fw.close();
				FileReader fr = new FileReader(FILENAME);
				int data;
				System.out.print(FILENAME + "から読み取った文字を出力：");
				while((data = fr.read()) != -1){
					System.out.print((char)data); //文字型にキャストして表示する
				}
				fr.close();
				}else{
        			System.out.println(FILENAME + "は既に存在しています。");
      			}
    	}catch(IOException ioe){ //IOException のインポートも行うこと
			System.out.println(ioe);
		}
		
	}
}