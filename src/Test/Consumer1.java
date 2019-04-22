package Test;

import java.io.IOException;

import Common.IpNode;
import Common.Message;
import Consumer.ConsumerFactory;

public class Consumer1 {

	public static void main(String[] args) {
		IpNode ipNode3 = new IpNode("127.0.0.1", 81);
		IpNode ipNode4 = new IpNode("127.0.0.1", 8888);
    	try {
			ConsumerFactory.createConsumer(ipNode3, ipNode4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Brokerδ���ߣ�");
		}
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		ConsumerFactory.Pull(ipNode3, ipNode4);
	}
	}
}