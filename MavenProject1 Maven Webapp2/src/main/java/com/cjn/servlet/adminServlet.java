package com.cjn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cjn.entity.Admin;
import com.cjn.service.AdminService;

/**
 * Servlet implementation class adminServlet
 */
public class adminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		doLogin(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String AdminId = request.getParameter("AdminId");//得到用户输入的id
		int id = Integer.parseInt(AdminId);
		String AdminPassword = request.getParameter("AdminPassword");//得到用户输入的密码
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		AdminService adminService = new AdminService();
		Admin admin = adminService.selectAdminById(id);//根据账号查询用户
		if (admin == null) {
			//如果数据库中不存在当前账号，重定向到登录失败界面
			response.sendRedirect("loginFail.jsp");
		} else if (admin.getAdminPassword().equals(AdminPassword)) {
			//如果账号和密码都正确，则转到显示所有功能的界面
			session.setAttribute("admin", admin);//将用户保存到名为admin的session中
			response.sendRedirect("showFunction.jsp");
		} else {
			//如果当前账号或者密码错误，重定向到登录失败界面
			response.sendRedirect("loginFail.jsp");
		}
	}
	

}
