package 조건문;

public class IF문2 {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		//같으면 "동일합니다"프린트
		//아니면 "동일하지않아요"프린트
		if(x==y) {
			System.out.println("동일");
		}
		else {
			System.out.println("동일하지 않음");
		}
		int id=1111;
		int id2=2222;
		if(id==id2) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}
