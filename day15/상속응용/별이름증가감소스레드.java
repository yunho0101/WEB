package 상속응용;

public class 별이름증가감소스레드 {

	public static void main(String[] args) {
		스레드1 스레드1=new 스레드1();
		스레드2 스레드2=new 스레드2();
		스레드3 스레드3=new 스레드3();

		스레드1.start();
		스레드2.start();
		스레드3.start();


	}

}
