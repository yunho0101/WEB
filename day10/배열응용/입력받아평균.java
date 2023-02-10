package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		//입력을 여러번 여러개 받아서
		//저장공간에 넣고 싶을때==>배열을 사용!
		//1.배열을 만들어주세요
		int[] jumsu=new int[5];
		
		//배열에 값을 넣을 때는 index가 필요==>i가 있는 for문 사용해야함
		for (int i = 0; i < jumsu.length; i++) {
			String data=JOptionPane.showInputDialog("숫자입력");
			//숫자로 변환한 값을 배열의 해당 인덱스 값으로 넣자
			jumsu[i]=Integer.parseInt(data);
		}
		for(int x:jumsu) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		//1.전체 합계구해서 평균
		int sum=0;
		for (int i = 0; i < jumsu.length; i++) {
			sum=sum+jumsu[i];	
			}
		double avg= (double)sum /jumsu.length;
		System.out.println("평균은: "+avg);
		System.out.println("------------------------");
		//2.300이상되는 숫자만 찾아서 합계
		int sum1=0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i]>=300) {
				sum1=sum1+jumsu[i];
			}
		}
		System.out.println("300이상인 숫자의 합은: "+sum1);
		System.out.println("------------------------");
		//3.300이상 되는 위치인 index프린트
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i]>=300) {
				int index=i;
			System.out.println(index+1+"번째 숫자가 300이상");
		
			}
			
		}
		
	}		
}
