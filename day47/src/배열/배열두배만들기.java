package 배열;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		
		Solution sol = new Solution();
		int[] answer = sol.solution(array);
		System.out.println(Arrays.toString(answer));
	}
}
class Solution {
    public int[] solution(int[] numbers) {
    	int size=numbers.length;
        int[] answer = new int[size];
        for (int i = 0; i < answer.length; i++) {
			answer[i]=2*numbers[i];
		}
        
        
        return answer;
    }
}