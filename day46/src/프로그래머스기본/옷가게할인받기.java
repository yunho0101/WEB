package 프로그래머스기본;

import java.util.Scanner;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		Solution6 sol = new Solution6();
		int answer = sol.solution(price);
		System.out.println(answer);
	}
}

class Solution6 {
	   public int solution(int price) { 
     int result=0;
	        	
          if(300000>price&&price>=100000) {
					result=price*95/100;
				}
          else if(500000>price&&price>=300000) {
					result=price*90/100;
			}else if(500000<=price){
				result=price*4/5;
			}else{
        result=price;
    }
     return result;
	    }
}