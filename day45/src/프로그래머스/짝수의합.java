package 프로그래머스;
import java.util.Scanner;

public class 짝수의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution sol = new Solution();
		sc.close();
	}
}

class Solution7 {
    public int solution(int n) {
      int result=0;
      for (int i = 0; i <= n; i++) {
		if(i%2==0) {
			result=result+i;
		}
	}
      return result;
}
}