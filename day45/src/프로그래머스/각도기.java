package 프로그래머스;
import java.util.Scanner;

public class 각도기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int angle = sc.nextInt();
		Solution sol = new Solution();
		sc.close();
	}
}

class Solution6 {
    public int solution(int angle) {
     int answer=0;
      if(0<angle&&angle< 90) {
    	  answer= 1;
      }if(angle== 90) {
    	  answer= 2;
    	
      }if(90<angle&&angle<180) {
    	  answer=3;
    	  
      }if(angle==180) {
    	  answer=4;
      }
     return answer;
}
}