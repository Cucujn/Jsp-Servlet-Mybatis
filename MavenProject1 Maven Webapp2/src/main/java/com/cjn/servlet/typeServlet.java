package com.cjn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjn.entity.Type;
import com.cjn.service.TypeService;

/**
 * Servlet implementation class typeServlet
 */
public class typeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public typeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通过typeOperation得知需要处理哪个页面
				String typeOperation = request.getParameter("typeOperation");
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				//此处调用添加type的方法
				if (typeOperation.equals("typeAdd")) {
					try {
						doAdd(request, response);
						response.sendRedirect("typeManage.jsp");
					} catch (Exception e) {
						out.print("添加失败！");
						out.println("<a href="+"typeAdd.jsp"+">返回添加界面</a>");
						out.println("         <a href="+"typeManage.jsp"+">返回上一级</a>");
					}
					//此处调用删除type的方法
				} else if (typeOperation.equals("typeDelete")) {
					try {
						dodelete(request, response);
						response.sendRedirect("typeManage.jsp");
					} catch (Exception e) {
						out.print("删除失败！");
						out.println("<a href="+"typeDelete.jsp"+">返回删除界面</a>");
						out.println("         <a href="+"typeManage.jsp"+">返回上一级</a>");
					}
					//此处调用更新type的方法
				} else if (typeOperation.equals("typeUpdate")) {
					try {
						doupdate(request, response);
						response.sendRedirect("typeManage.jsp");
					} catch (Exception e) {
						out.println("<a href="+"typeUpdate.jsp"+">返回更新界面</a>");
						out.println("         <a href="+"typeManage.jsp"+">返回上一级</a>");
					}
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	/*
	 * 添加商品种类
	 */
	protected void doAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Type type = new Type();
		String TypeName = request.getParameter("TypeName");
		//处理输入的中文字符
		try {
			byte bb[] = TypeName.getBytes("UTF-8");
			TypeName = new String(bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		type.setTypeName(TypeName);
		TypeService typeService = new TypeService();
		//调用添加type的方法
		typeService.insertType(type);
	}
	/*
	 * 删除商品种类
	 */
	protected void dodelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//得到需要删除的种类的ID
		String TypeId = request.getParameter("TypeId");
		int id =Integer.parseInt(TypeId);
		TypeService typeService = new TypeService();
		typeService.deleteType(id);
	}
	/*
	 * 更新商品种类
	 */
	protected void doupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Type type = new Type();
		//得到TypeID和TypeName，并将其存入一个type对象中
		int TypeId = Integer.parseInt(request.getParameter("TypeId"));
		String TypeName = request.getParameter("TypeName");
		try {
			byte bb[] = TypeName.getBytes("UTF-8");
			TypeName = new String(bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			byte bb[] = TypeName.getBytes("utf-8");
			TypeName = new String(bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//String TypeType = request.getParameter("TypeType");
		type.setTypeId(TypeId);
		type.setTypeName(TypeName);
		TypeService typeService = new TypeService();
		typeService.updateType(type);
	}
	

}
