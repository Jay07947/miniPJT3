package com.movie;

//  [서블릿 작성 규칙]
//  1) public 클래스로 작성하기
//  2) HttpServlet 상속하기
//  3) 서블릿의 lifecycle 관련 메서드 오버라이딩하기
//   - init : 서블릿이 생성된 후 서블릿 객체가 초기화될 때 호출되는 메서드
//   - service : 요청을 받을 때마다 호출되는 메서드 (요청 방식 구분 없이 실행되는 메서드)
//   - doGet : get 방식으로 요청될 때 호출되는 메서드
//   - doPost : post 방식으로 요청될 때 호출되는 메서드
//   - destroy : 서블릿 객체가 소멸될 때 호출되는 메서드
//   4) web.xml에 서블릿 등록하기

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{
	
//	public void service(HttpServletRequest req,HttpServletResponse res)
//		   throws ServletException,IOException{
//			System.out.println("service()");
//			}

	public void doPost(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException,IOException{
			res.setContentType("text/html;charset=UTF-8");
			PrintWriter out = res.getWriter();
			
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			
			out.print("<html><head><title>질의 문자열 테스트</title></head>");
			out.print("<body>");
			out.print("<h1>POST방식으로 요청</h1>");
			out.print("<h3>"+id+"   "+pwd+"</h3>");
			out.print("<h3>"+req.getQueryString()+"</h3>");
			out.println("</body></html>");
			out.close();
	}


}
