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
		data();
		personinput();
	}
	
	private void data() {
		data1();
		data2();
		date3();		
	}

	private void date3() {
		rent.add(1111);
	}
	public void data1() {
		video.add(new Video());
		video.get(0).setvCode(1111);
		video.get(0).setvName("타이타닉");
		video.get(0).setvMoney(3000);
		video.add(new Video());
		video.get(1).setvCode(2222);
		video.get(1).setvName("로미오와 줄리엣");
		video.get(1).setvMoney(2000);
		video.add(new Video());
		video.get(2).setvCode(3333);
		video.get(2).setvName("신과함께");
		video.get(2).setvMoney(4000);
		video.add(new Video());
		video.get(3).setvCode(4444);
		video.get(3).setvName("아저씨");
		video.get(3).setvMoney(4000);
		video.add(new Video());
		video.get(4).setvCode(5555);
		video.get(4).setvName("아가씨");
		video.get(4).setvMoney(2000);

	}

	public void data2() {
		p[0]= new Person();
		p[0].setpName("김재현");
		p[0].setPvName(video.get(0).getvName());
		p[0].setpMoney(video.get(0).getvMoney());
	}

	public void personinput() {

		while(true) {
			String answer;
			System.out.println(" ");
			System.out.print("고객정보 입력 : ");
			name = in.next();
			for (int i = 0; i < p.length; i++) {
				if (!name.equals(p[i].getpName())) {
					videoinput();
				}
				else if (name.equals(p[i].getpName())) {
					System.out.println("연체된 비디오 이름 : " + p[i].getPvName());
					System.out.println("연체금 : " + p[i].getpMoney());
					System.out.println(" ");
					System.out.print("연체금을 지불하시겠습니까?(네/아니오) : ");
					answer = in.next();

					if (answer.equals("네")) {
						System.out.println("지불되었습니다");
						videoinput();
					}

					else if (answer.equals("아니오")) {
						System.out.println("미납되었습니다.");
						System.out.println(p[i].getpName()+"님은 대여가 불가능합니다");
						personinput();
					}
				}  
			}
		}//while(true)


	}
	public void videoinput() {

		System.out.println(" ");
		System.out.println("대여할 비디오코드 : ");
		videoCode = in.nextInt();
		for (int i = 0; i < rent.size(); i++) 
		{			
			if (videoCode==video.get(i).vCode) {
				if (rent.get(i)!= videoCode) {
					System.out.println(video.get(i).getvName()+ "이 대여되었습니다");
					System.out.println(" ");
					rent.add(videoCode);
					personinput();
				}
				
				else if (rent.get(i)== videoCode) {
					System.out.println("다른 고객님께서 대여하셨습니다. 다른 비디오코드를 입력해주세요");
					videoinput();
				
			}
				
			}

		}

	}
}


