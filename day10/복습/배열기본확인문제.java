package 복습;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		String[] voyage= {"Bali", "Jeju","Guam", "Hawaii"};
		for(String x:voyage) {
			System.out.println(x);
			
		}
		char[] color= {'r', 'g','b','g','s'};
		for (int i = 0; i < color.length; i++) {
			System.out.println(i+1+": "+color[i]);	
		}
		double[] height= {184.4, 156.4, 162.4, 171.2, 159.3};
		for (int i = 0; i < height.length; i++) {
			System.out.println(i+1+": "+height[i]);
			
		}
	}

}
