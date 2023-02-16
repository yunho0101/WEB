package 스태틱;

public class 딸 {
	String name;
	String gender;
	static int count;
	static int wallet=10000;
	public 딸(String name, String gender) {
		count++;
		wallet = wallet - 1000;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}

	
}
