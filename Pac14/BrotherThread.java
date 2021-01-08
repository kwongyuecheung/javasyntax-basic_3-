//**********************************
// 課題名 : BrotherThread
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/19
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
		final String[] NAMES = {"兄", "弟"};
		System.out.println(NAMES[brotherIndex] + "「Switch 買う為に" + TARGET + "円貯金するぞ！」");
		while(true){
			if(sav.getSavings() >= TARGET){	
				System.out.println(NAMES[brotherIndex] + "「目標達成だ！」");
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