package Common;

import java.util.Scanner;

public class Message {

	private String message;//��Ϣ
	private int type;//��Ϣ����
	private int length;//��Ϣ����

	//���캯��
	public Message(String s) {
		// Ĭ����Ϣ����Ϊ0
		this.setType(MessageType.ONE_WAY);
		if(s.length()>9999) {
			this.length = 9999;
			this.message = s.substring(0, 9999);
		}
		else{
			this.message = s;
			this.length = s.length();
		}
	}
	
	public Message(String s,int type) {
		this.type = type;
		if(s.length()>9999) {
			this.length = 9999;
			this.message = s.substring(0, 9999);
		}
		else{
			this.message = s;
			this.length = s.length();
		}
		
	}
	
	public String getJointMessage() {
		System.out.println(this.length);
		String str_len = String.format("%04d",this.length);
		String str_type = String.valueOf(this.type);
		String JointMessage = str_len+str_type+message;
		//System.out.println(JointMessage);
		return JointMessage;
	}

	public int getType() {
		return type;
	}
	public void setType(int type) {
		if(type==0||type==1||type==2)
			this.type = type;
		else
			System.out.println("����ʧ�ܡ�");
	}

	public int getLength() {
		return length;
	}
	
	public static void main(String[] args) {
		System.out.println("������Ҫ���͵����ݣ�");
		Scanner sc = new Scanner(System.in);
        //����hasNextXXX()�ж��Ƿ�����һ������
        while (sc.hasNext()) {
            //����nextXXX()�����������
            String s = sc.next();
            Message message = new Message(s);
            String joint = message.getJointMessage();
            System.out.println(joint);
        }
		
	}
}
