//**********************************
// �ۑ薼 : Kad13_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/10
//**********************************
import java.io.File;  // Import the File class
import java.util.*;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.io.FileReader;
class Kad13_1{
	public static void main(String[]args){
		final String FILENAME = "kadai.txt";
		try {
      		File myObj = new File(FILENAME); // Specify the filename
     		 if(myObj.createNewFile()) {
       			System.out.println(FILENAME + "���쐬���܂����B");
				FileWriter fw = new FileWriter(FILENAME);
				Scanner sc = new Scanner(System.in);
				System.out.print(FILENAME + "�ɏ������ޕ�������́F");
				fw.write(sc.next());
				fw.close();
				FileReader fr = new FileReader(FILENAME);
				int data;
				System.out.print(FILENAME + "����ǂݎ�����������o�́F");
				while((data = fr.read()) != -1){
					System.out.print((char)data); //�����^�ɃL���X�g���ĕ\������
				}
				fr.close();
				}else{
        			System.out.println(FILENAME + "�͊��ɑ��݂��Ă��܂��B");
      			}
    	}catch(IOException ioe){ //IOException �̃C���|�[�g���s������
			System.out.println(ioe);
		}
		
	}
}