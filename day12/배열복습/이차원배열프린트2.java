package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s= {
				{"유럽","미국","세계"},
				{"롤","피파","공부"},
				{"어제","오늘","내일"}				
		};
		for (int i = 0; i < s.length; i++) {//행
			for (int j = 0; j < s.length; j++) {//한 행을 다 찍기 위한 (열)
				System.out.println(s[i][j]);
				
			}
		}
	}

}
