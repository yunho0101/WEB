package bookbuy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

public class BuyDAO {
	public ArrayList<BuyVO> list() {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		//가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		//ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<BuyVO> list = new ArrayList<>();
		
		BuyVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			

			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "select * from hr.MEMBER";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				//1. 검색겨로가가 있으면, 
				//System.out.println("검색결과 있음. 성공.");
				//2. 각 컬럼에서 값들을 꺼내오자. 
				
				String address = rs.getString("address"); 
				String name = rs.getString(3);
				String tel = rs.getString(4); 
				//System.out.println(	id2 + " " 
//									+ pw + " " 
//									+ name + " " 
//									+ tel);
				//검색결과를 검색화면 UI부분을 주어야 함.
				//3. 가방을 만들자.
				bag = new BuyVO();
				bag.setaddress(address);
				bag.setName(name);
				bag.setTel(tel);
				
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
			
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
}
