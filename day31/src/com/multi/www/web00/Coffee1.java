package com.multi.www.web00;

public class Coffee1 {
	
	String color; //주소(4바이트)
	int price; //4
	int speed; //4
	//하나만 제공하는 객체는
	//static:하나만 변수만들때
	//public:제공하는 car2를 아무데서나 쓸 수 있도록
	
	public static Coffee1 car2;
	//싱글톤은 해당클래스에서 하나만 만들어서 제공
	
	public static Coffee1 getInstance() {
		if(car2==null) {
		car2=new Coffee1("빨강", 200,110);
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달리자~");
	}
	private Coffee1(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

}