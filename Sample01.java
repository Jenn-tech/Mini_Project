package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample01 {

	ArrayList<Video> video = new ArrayList<>();
	ArrayList<Integer> rent = new ArrayList<>();
	Video v = new Video();
	Person[] p = new Person[5];
	Scanner in = new Scanner(System.in);
	String name;
	int videoCode;
	int checknum=1;
	
	
	public Sample01() {
		video.add(v);
		data1();
		data2();
		personinput();
	}
	public void data1() {
		video.add(new Video());
		video.get(0).setvCode(1111);
		video.get(0).setvName("Ÿ��Ÿ��");
		video.get(0).setvMoney(3000);
		video.add(new Video());
		video.get(1).setvCode(2222);
		video.get(1).setvName("�ι̿��� �ٸ���");
		video.get(1).setvMoney(2000);
		video.add(new Video());
		video.get(2).setvCode(3333);
		video.get(2).setvName("�Ű��Բ�");
		video.get(2).setvMoney(4000);
		video.add(new Video());
		video.get(3).setvCode(4444);
		video.get(3).setvName("������");
		video.get(3).setvMoney(4000);
		video.add(new Video());
		video.get(4).setvCode(5555);
		video.get(4).setvName("�ư���");
		video.get(4).setvMoney(2000);

	}

	public void data2() {
		p[0]= new Person();
		p[0].setpName("������");
		p[0].setPvName(video.get(0).getvName());
		p[0].setpMoney(video.get(0).getvMoney());
	}

	public void personinput() {
		exit:
		while(true) {
			String answer;
			System.out.println(" ");
			System.out.print("������ �Է� : ");
			name = in.next();
			for (int i = 0; i < p.length; i++) {
				if (!name.equals(p[i].getpName())) {
					videoinput();
				}
				else if (name.equals(p[i].getpName())) {
					System.out.println("��ü�� ���� �̸� : " + p[i].getPvName());
					System.out.println("��ü�� : " + p[i].getpMoney());
					System.out.println(" ");
					System.out.print("��ü���� �����Ͻðڽ��ϱ�?(��/�ƴϿ�) : ");
					answer = in.next();

					if (answer.equals("��")) {
						System.out.println("���ҵǾ����ϴ�");
						break exit;
					}
					
					else if (answer.equals("�ƴϿ�")) {
						System.out.println("�̳��Ǿ����ϴ�.");
						System.out.println(p[i].getpName()+"���� �뿩�� �Ұ����մϴ�");
						personinput();
					}
				}  
			}
		}//while(true)
		
		System.out.println("��");

	}
	public void videoinput() {

		System.out.println(" ");
		System.out.println("�뿩�� �����ڵ� : ");
		videoCode = in.nextInt();
		for (int i = 0; i < p.length; i++) {
			if (rent.get(i)== videoCode) {
				System.out.println("�ٸ� ���Բ��� �뿩�ϼ̽��ϴ�. �ٸ� �����ڵ带 �Է����ּ���");
			}
			if (videoCode==video.get(i).vCode) {
				System.out.println(video.get(i).getvName()+ "�� �뿩�Ǿ����ϴ�");
				System.out.println(" ");
				rent.add(videoCode);
				personinput();
			}
		}
	}
}
