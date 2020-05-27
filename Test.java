package org.oar.emp.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.oar.emp.dao.CommonDao;
import org.oar.emp.dto.Employee;

public class Test extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) 
	throws IOException,ServletException
	{
		/*String ename=req.getParameter("enm"); //for adding data
		String ecode=req.getParameter("ecd");
		String email=req.getParameter("eid");
		String mno=req.getParameter("cno");
		Long cno=Long.parseLong(mno);
		String rm=req.getParameter("rm");
		String doj=req.getParameter("doj");
		String dor=req.getParameter("dor");
		
		Employee e=new Employee();
		e.setEname(ename);
		e.setEcode(ecode);
		e.setEmail(email);
		e.setCno(cno);
		e.setRm(rm);
		e.setDoj(doj);
		e.setDor(dor);
		if(dor==null)
		{
			e.setStatus("active");
		}
		else
		{
			e.setStatus("resigned");
		}
		CommonDao dao=new CommonDao();
		dao.saveEmployeeDetails(e);
		System.out.println("saved data");
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'><h1>data stored</h1></body></html>");*/
		
		
	/*	String name=req.getParameter("nm");//for deleting data
		CommonDao dao1=new CommonDao();
		dao1.deleteByName(name);
		System.out.println("data deleted");
		PrintWriter out1=resp.getWriter();
		out1.println("<html><body bgcolor='yellow'><h1>data deleted</h1></body></html>");*/

		String name1=req.getParameter("enm");//for updating
		CommonDao dao2=new CommonDao();
		dao2.updateEmployeeDetails(name1, 827496395);
		System.out.println("data updated");
		PrintWriter out2=resp.getWriter();
		out2.println("<html><body bgcolor='yellow'><h1>data stored</h1></body></html>");
		
		
	}
 
}
