package 프로그래머스기본;

import java.util.Scanner;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution4 sol = new Solution4();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution4 {
	   public int solution(int n) { 
        int result=0;
	        for (int i = 1; i <= n; i++) {
				
             if((i*6)%n==0) {
					result=i;
                 break;
				}
			}
        return result;
	    }
}