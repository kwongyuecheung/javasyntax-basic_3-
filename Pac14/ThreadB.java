//**********************************
// �ۑ薼 : ThreadB
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/19
//**********************************
class ThreadB implements Runnable{
	public void run(){
		System.out.println("�X���b�h B:�J�n");
		for(int i = 1; i <= 10; i++){
			System.out.println("�X���b�h B�F" + i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		System.out.println("�X���b�h B:�I��");
	}
}