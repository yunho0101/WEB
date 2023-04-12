package 배열문제;

import java.util.*;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int start = 1;
		int end = 3;

		Solution8 sol = new Solution8();
		int[] answer = sol.solution(array, start, end);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution8 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int size=num2-num1+1;
        int[] answer=new int[size];
        int num=num1;
        for(int i=0;i<size;i++){
            answer[i]=numbers[num];
            num++;
        }
        return answer;
    }
}