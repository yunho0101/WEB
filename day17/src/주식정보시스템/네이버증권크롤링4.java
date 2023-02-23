package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//import 자동으로 하고 싶은 경우
//컨트롤 + 쉬프트 + o(영문)


public class 네이버증권크롤링4 {

	public static void main(String[] args) {
//		주식 코드를 불러오기 위한 crawling
		Connection con2;
		con2 = Jsoup.connect("https://finance.naver.com/sise/lastsearch2.naver");
		// System.out.println("성공" + con2);
		Document doc2 = null;
		String[] code2 = new String[30];
		try {
			doc2 = con2.get();
			// <a class="title"> ==> select("a.title">
			Elements codeList2 = doc2.select("a.tltle");
			// System.out.println(codeList2);
			System.out.println("===> " + codeList2.size());
			for (int i = 0; i < codeList2.size(); i++) {
				// System.out.println(i + " " + codeList2.get(i));
				Element tmp = codeList2.get(i);
				System.out.println(tmp);
				String tmpStr = tmp.text(); // <a href="sdssdsfsf"~~~>
				System.out.println(tmpStr);
				String href = tmp.attr("href");
				// System.out.println(href.length());//28
				System.out.println(href.substring(22));
				String tmpCodeStr = href.substring(22); // 코드시작인덱스 22~
				code2[i] = tmpCodeStr;
				System.out.println(code2[i]);
			}

//			for (String x: code2) {
//				System.out.println(x);
//			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

// =======================================================================		
		// 위에 정리된 코드들을 밑의 code string에 저장하려고 합니다.
		// String[] code = new String[] {"005930","263750","035720"};

		Connection con;
		for (String x : code2) {
			con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + x);
			System.out.println("1.네트워크 연결 성공." + con);

			Document doc = null;// html 코드를 다 가지고 와서 doc 변수에 넣어놨음.
			try {
				doc = con.get();
				Elements codeList = doc.select("span.blind"); // html 안에 <a class="nav"> 이걸 가져왓!
				System.out.println(codeList.size());
				System.out.println();

				Element tag1 = codeList.get(12);
				String today = tag1.text();
				System.out.println("현재가 :" + today);
				System.out.println();

				Element tag2 = codeList.get(20);
				String low = tag2.text();
				System.out.println("최저가 :" + low);
				System.out.println();

				Element tag3 = codeList.get(16);
				String high = tag3.text();
				System.out.println("최고가 :" + high);
				System.out.println();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}