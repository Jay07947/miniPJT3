package com.movie;

//  [���� �ۼ� ��Ģ]
//  1) public Ŭ������ �ۼ��ϱ�
//  2) HttpServlet ����ϱ�
//  3) ������ lifecycle ���� �޼��� �������̵��ϱ�
//   - init : ������ ������ �� ���� ��ü�� �ʱ�ȭ�� �� ȣ��Ǵ� �޼���
//   - service : ��û�� ���� ������ ȣ��Ǵ� �޼��� (��û ��� ���� ���� ����Ǵ� �޼���)
//   - doGet : get ������� ��û�� �� ȣ��Ǵ� �޼���
//   - doPost : post ������� ��û�� �� ȣ��Ǵ� �޼���
//   - destroy : ���� ��ü�� �Ҹ�� �� ȣ��Ǵ� �޼���
//   4) web.xml�� ���� ����ϱ�

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
			
			out.print("<html><head><title>���� ���ڿ� �׽�Ʈ</title></head>");
			out.print("<body>");
			out.print("<h1>POST������� ��û</h1>");
			out.print("<h3>"+id+"   "+pwd+"</h3>");
			out.print("<h3>"+req.getQueryString()+"</h3>");
			out.println("</body></html>");
			out.close();
	}


}
