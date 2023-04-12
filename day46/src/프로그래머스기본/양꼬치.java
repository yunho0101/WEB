package 프로그래머스기본;
import java.util.Scanner;


public class 양꼬치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= sc.nextInt();
		Solution2 sol = new Solution2();
		int answer = sol.solution(n, k); //int
		System.out.println(answer);
		sc.close();
	}
}

class Solution2 {
    public int solution(int n, int k) {
        
    	int answer = 12000*n+ 2000* (k-(n/10));
        return answer;
    }
}