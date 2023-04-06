package com.multi.mvc300;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {

	@Autowired
	BbsDAO dao;
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리 담당)
	//하나의 요청당 하나의 메서드
	//하나의 버튼호출당 하나의 함수 연결!
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를
	//써주어야 한다. 
	@RequestMapping("insert2")
	public void insert2(BbsVO bag) {
	
		System.out.println("insert요청됨.");
		System.out.println(bag);
		
		dao.insert2(bag);
	}
	
@RequestMapping("update2")
public void update2(BbsVO bag) {
System.out.println("update요청됨.");
System.out.println(bag);	
dao.update2(bag);
}
//	
	@RequestMapping("delete2")
	public void delete2(int no) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete2(no);
	}
//	
//	@RequestMapping("one2.multi")
//	public void one(int no, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(no);
//		BbsVO bag = dao.one(no);
//		//검색결과가 있는지 프린트!
//		System.out.println(bag);
//		model.addAttribute("bag", bag);
//	}
//	
//	@RequestMapping("list2")
//	public void list(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size()); //사이즈를 찍어보세요.
//		model.addAttribute("list", list);
//	}
//	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	
	
	
	
}
