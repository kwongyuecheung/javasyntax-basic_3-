//**********************************
// �ۑ薼 : Savings
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/19
//**********************************
class Savings{
	private int savings = 0;
	public synchronized void saveMoney(int money, String name){
		savings += money;
		System.out.println(name + "���������܂����B�����z�F" + savings + "�~");
	}
	public int getSavings(){
		return this.savings;
	}
}