package 생성자;

public class mask {

	String 제조회사;
	int 가격;
	int 개수;

	public mask(String 제조회사, int 가격, int 개수) {
		this.제조회사 = 제조회사;
		this.가격 = 가격;
		this.개수 = 개수;
	}
	@Override
	public String toString() {
		return "mask [제조회사=" + 제조회사 + ", 가격=" + 가격 + ", 개수=" + 개수 + "]";
	}
}
