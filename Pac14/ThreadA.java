//**********************************
// �ۑ薼 : ThreadA
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/19
//**********************************
class ThreadA extends Thread{
	public void run(){
		System.out.println("�X���b�h A:�J�n");
		for(int i = 1; i <= 10; i++){
			System.out.println("�X���b�h A�F" + i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		System.out.println("�X���b�h A:�I��");
	}
}