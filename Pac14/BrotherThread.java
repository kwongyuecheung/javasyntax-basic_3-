//**********************************
// �ۑ薼 : BrotherThread
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/19
//**********************************
class BrotherThread extends Thread{
	private Savings sav;
	private int brotherIndex;
	BrotherThread(Savings savings, int brotherIndex){
		this.sav = savings;
		this.brotherIndex = brotherIndex;
	}
	@Override
	public void run(){
		final int TARGET = 30000;
		final int[] MONEYS = {4000,2000};
		final String[] NAMES = {"�Z", "��"};
		System.out.println(NAMES[brotherIndex] + "�uSwitch �����ׂ�" + TARGET + "�~�������邼�I�v");
		while(true){
			if(sav.getSavings() >= TARGET){	
				System.out.println(NAMES[brotherIndex] + "�u�ڕW�B�����I�v");
				break;
			}
			sav.saveMoney(MONEYS[brotherIndex],NAMES[brotherIndex]);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
	}
}