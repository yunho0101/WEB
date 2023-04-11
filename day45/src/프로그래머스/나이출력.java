package 프로그래머스;
import java.util.Scanner;

public class 나이출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		Solution sol = new Solution();
		sc.close();
	}
}

class Solution4 {
    public int solution(int age) {
      int result=2023-age;
      return result;
}
}