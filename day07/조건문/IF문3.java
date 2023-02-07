package 조건문;

public class IF문3 {

	public static void main(String[] args) {
		//조건이 여러개 일때
		//if 문은 조건이 맞아서 실행하고 나서 자동으로 끝남(break 안써도됨)
		int myNum=99;
		//80점 이상이면 최우수
		if (myNum>=80) {
			System.out.println("최우수");
		}
		//70점이상이면 우수
		else if (myNum>=70) {
			System.out.println("우수");
		}
		//60점이상이면 보통
		else if (myNum>=60) {
			System.out.println("보통");
		}	
		//나머지는 미달
		else{
			System.out.println("미달");
		}
	}
}
	