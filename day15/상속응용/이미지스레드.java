package 상속응용;


public class 이미지스레드 extends Thread {
	@Override
	public void run() {
		String[] images = {"1.PNG","2.PNG","3.PNG","4.PNG","5.PNG"
				,"1.PNG","2.PNG","3.PNG","4.PNG","5.PNG"
				,"1.PNG","2.PNG","3.PNG","4.PNG","5.PNG"
				,"1.PNG","2.PNG","3.PNG","4.PNG","5.PNG"
				,"1.PNG","2.PNG","3.PNG","4.PNG","5.PNG"
				,"1.PNG","2.PNG","3.PNG","4.PNG","5.PNG"		
		};
		for (int i = 0; i<images.length; i++) {
			System.out.println("이미지>>"+images[i]);
			try {
				Thread.sleep(5000);//5초 재우기
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
			
			
		}
	}
}
