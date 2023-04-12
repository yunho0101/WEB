package 프로그래머스기본;

import java.util.Scanner;


public class 피자나눠먹기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int slice = sc.nextInt();
		int n = sc.nextInt();
		Solution5 sol = new Solution5();
		int answer = sol.solution(slice, n); //int
		System.out.println(answer);
		sc.close();
	}
}

class Solution5 {
	   public int solution(int slice,int n) { 
        int result=0;
	        for (int i = 1; i <= n; i++) {
				
             if((slice*i)>=n) {
					result=i;
                 break;
				}
			}
        return result;
	    }
}