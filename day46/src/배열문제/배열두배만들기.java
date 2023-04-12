package 배열문제;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		
		Solution9 sol = new Solution9();
		int[] answer = sol.solution(array);
		System.out.println(Arrays.toString(answer));
	}
}
class Solution9 {
    public int[] solution(int[] numbers) {
    	int size=numbers.length;
        int[] answer = new int[size];
        for (int i = 0; i < answer.length; i++) {
			answer[i]=2*numbers[i];
		}
        
        
        return answer;
    }
}