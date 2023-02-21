package 형변환;

import java.util.LinkedList;

public class 시험과목 {

	public static void main(String[] args) {
		LinkedList exam= new LinkedList();
		exam.add("국어");
		exam.add("수학");
		exam.add("영어");
		exam.add("컴퓨터");
		System.out.println("전체 시험볼 과목: "+exam);
		exam.remove();
		System.out.println("1일차 시험본 후 남은 과목: "+exam);
		exam.remove();
		System.out.println("2일차 시험본 후 남은 과목: "+exam);
		exam.remove();
		System.out.println("3일차 시험본 후 남은 과목: "+exam);
		

	}

}
