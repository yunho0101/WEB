package 상속응용;

public class 카운트스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 500; i>0; i--) {
			System.out.println("카운트>>"+i);
			//cpu에게 스레드 쉬는 시간 텀을 알려줍시다
			//thread 잠깐 재움
			//cpu는 외부자원
			//자바가 외부자원 연결할때는 위험
			//문제가 생기면 어떻게 할지 코드해주어야함
			try {
				Thread.sleep(2000);//2초 재우기
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
			
			
		}
	}
}
