//**********************************
// �ۑ薼 : Kad14_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/19
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