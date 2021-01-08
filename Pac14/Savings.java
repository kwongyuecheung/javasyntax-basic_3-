//**********************************
// 課題名 : Savings
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/11/19
//**********************************
class Savings{
	private int savings = 0;
	public synchronized void saveMoney(int money, String name){
		savings += money;
		System.out.println(name + "が貯金しました。貯金額：" + savings + "円");
	}
	public int getSavings(){
		return this.savings;
	}
}