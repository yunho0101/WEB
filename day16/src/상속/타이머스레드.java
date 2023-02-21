package 상속;

import java.util.Date;

public class 타이머스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i>0; i--) {
			Date date = new Date();
			System.out.println("타이머>>"+date);
			//cpu에게 스레드 쉬는 시간 텀을 알려줍시다
			//thread 잠깐 재움
			//cpu는 외부자원
			//자바가 외부자원 연결할때는 위험
			//문제가 생기면 어떻게 할지 코드해주어야함
			try {
				Thread.sleep(1000);//1초 재우기
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
			
			
		}
	}
}
