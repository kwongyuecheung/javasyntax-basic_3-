//**********************************
// 課題名 : Kad13_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/10
//**********************************
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.IOException;  // Import the IOException class to handle errors
import java.net.URL;
import java.io.FileOutputStream;
class Kad13_2{
	public static void main(String[]args){
		final String READFILENAME = "ECCcompURL.txt"; //読み取るファイル名
		final String WRITEFILENAME = "ECCcompHTML.html"; //書き込むファイル名
		InputStream is = null; //読み取り用ストリーム
		OutputStream os = null; //書き込み用ストリーム
		System.out.println("読み取った URL に接続して HTML ファイルを作成します。");
		try{
 			is = new FileInputStream(READFILENAME); //③
 		//④～⑦
		 	int data; //文字格納用
			String urlText = ""; //URL 格納用
			while((data = is.read()) != -1){
 				urlText = urlText + (char)data ;
			}
 			System.out.println("接続先:" + urlText);
			URL url = new URL(urlText);
			is = url.openStream();
			os = new FileOutputStream(WRITEFILENAME);
			//7
			int len;
			byte[] b = new byte[1024];
			while((len = is.read(b)) != -1){
 				os.write(b, 0, len); //b 配列の 0~len バイト数を os ストリームに書き込む
			}
		}catch(IOException ioe){ //IOException のインポートも行うこと
			System.out.println(ioe + "作成失敗しました。");
		}finally{
			//クローズ
			if(is != null && os != null){
				try{
					is.close();
					os.close();
				}catch(IOException ioe){
					System.out.println(ioe);
				}
			}
		}
	}
}