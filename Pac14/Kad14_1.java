//**********************************
// 課題名 : Kad14_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/19
//**********************************
class Kad14_1{
	public static void main(String[]args){
		ThreadA threadA = new ThreadA();
		Runnable r = new ThreadB();
		Thread threadB = new Thread(r);
		threadA.start();
		threadB.start();

	}
}