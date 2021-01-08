//**********************************
// 課題名 : Kad14_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/19
//**********************************
class Kad14_2{
	public static void main(String[]args){
		Savings savings = new Savings();
		BrotherThread olderThread = new BrotherThread(savings, 0);
		BrotherThread youngerThread = new BrotherThread(savings, 1);
		olderThread.start();
		youngerThread.start();
	}
}