//**********************************
// �ۑ薼 : Kad14_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/19
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