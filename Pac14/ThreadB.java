//**********************************
// 課題名 : ThreadB
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/19
//**********************************
class ThreadB implements Runnable{
	public void run(){
		System.out.println("スレッド B:開始");
		for(int i = 1; i <= 10; i++){
			System.out.println("スレッド B：" + i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		System.out.println("スレッド B:終了");
	}
}