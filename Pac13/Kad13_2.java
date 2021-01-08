//**********************************
// �ۑ薼 : Kad13_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/11/10
//**********************************
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.IOException;  // Import the IOException class to handle errors
import java.net.URL;
import java.io.FileOutputStream;
class Kad13_2{
	public static void main(String[]args){
		final String READFILENAME = "ECCcompURL.txt"; //�ǂݎ��t�@�C����
		final String WRITEFILENAME = "ECCcompHTML.html"; //�������ރt�@�C����
		InputStream is = null; //�ǂݎ��p�X�g���[��
		OutputStream os = null; //�������ݗp�X�g���[��
		System.out.println("�ǂݎ���� URL �ɐڑ����� HTML �t�@�C�����쐬���܂��B");
		try{
 			is = new FileInputStream(READFILENAME); //�B
 		//�C�`�F
		 	int data; //�����i�[�p
			String urlText = ""; //URL �i�[�p
			while((data = is.read()) != -1){
 				urlText = urlText + (char)data ;
			}
 			System.out.println("�ڑ���:" + urlText);
			URL url = new URL(urlText);
			is = url.openStream();
			os = new FileOutputStream(WRITEFILENAME);
			//7
			int len;
			byte[] b = new byte[1024];
			while((len = is.read(b)) != -1){
 				os.write(b, 0, len); //b �z��� 0~len �o�C�g���� os �X�g���[���ɏ�������
			}
		}catch(IOException ioe){ //IOException �̃C���|�[�g���s������
			System.out.println(ioe + "�쐬���s���܂����B");
		}finally{
			//�N���[�Y
			if(is != null && os != null){
				try{
					is.close();
					os.close();
				}catch(IOException ioe){
					System.out.println(ioe);
				}
			}
		}
	}
}