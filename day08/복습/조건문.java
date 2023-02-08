package 복습;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77;//숫자맞추기
		int me = 88; //내가 시도한 값
		//조건은 비교하는 코드가 들어감 결과가 무조건 논리형(true/false)
		if (target==me) {
			System.out.println("정답입니다");
		}
		else {
			System.out.println("오답입니다");
		}
		//if 조건이 만족하면 처리하고 더 이상 실행되지 않음
		//if문 자체는 break기능이 있음
		
		//switch case는 자체 break없음
		//내가 멈추고 싶은 곳에 break 써줘야함
		
		
		String you ="신나";
		switch (you){
		case "로또":
			System.out.println("정답");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답");
			break;
		default: //위의 조건이 다 아닐 때 실행하고 싶은 내용
			System.out.println("그만해");
			break;
		}
	
	}

}
