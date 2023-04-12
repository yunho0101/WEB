package 배열문제;

import java.util.*;

public class 배열원소의길이 {

	public static void main(String[] args) {
		String[] strlist = { "I", "Love", "Programmers." };

		Solution6 sol = new Solution6();
		int[] answer = sol.solution(strlist);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution6 {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		//{ "I", "Love", "Programmers."}
		//반복문 돌면서 하나씩 꺼내오기
		//꺼낸 데이터의 글자수를 구해서 Int배열에 넣는다
		for (int i = 0; i < strlist.length; i++) {
			answer[i]=strlist[i].length();
		}
		return answer;
	}
}