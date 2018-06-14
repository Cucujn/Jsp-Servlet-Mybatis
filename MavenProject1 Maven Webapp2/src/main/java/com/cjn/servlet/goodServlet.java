package com.cjn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cjn.entity.Good;
import com.cjn.mapping.GoodOperation;
import com.cjn.service.AdminService;
import com.cjn.service.GoodService;

/**
 * Servlet implementation class goodServlet
 */
public class goodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public goodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通过goodOperation得知需要处理哪个页面
		String goodOperation = request.getParameter("goodOperation");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (goodOperation.equals("goodAdd")) {
			try {
				doAdd(request, response);
				response.sendRedirect("goodManage.jsp");
			} catch (Exception e) {
				out.print("添加失败！");
				out.println("<a href="+"goodAdd.jsp"+">返回添加界面</a>");
				out.println("         <a href="+"goodManage.jsp"+">返回上一级</a>");
			}
			//doselectAll(request, response);
		} else if (goodOperation.equals("goodDelete")) {
			try {
				dodelete(request, response);
				response.sendRedirect("goodManage.jsp");
			} catch (Exception e) {
				out.print("删除失败！");
				out.println("<a href="+"goodDelete.jsp"+">返回删除界面</a>");
				out.println("         <a href="+"goodManage.jsp"+">返回上一级</a>");
			}
		} else if (goodOperation.equals("goodUpdate")) {
			try {
				doupdate(request, response);
				response.sendRedirect("goodManage.jsp");
			} catch (Exception e) {
				out.println("<a href="+"goodUpdate.jsp"+">返回更新界面</a>");
				out.println("         <a href="+"goodManage.jsp"+">返回上一级</a>");
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
	protected void doAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Good good = new Good();
		String GoodName = request.getParameter("GoodName");
		String GoodPrice = request.getParameter("GoodPrice");
		String GoodStore = request.getParameter("GoodStore");
		//String GoodType = request.getParameter("GoodType");
		try {
			byte bb[] = GoodName.getBytes("UTF-8");
			GoodName = new String(bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		good.setGoodName(GoodName);
		good.setGoodPrice(Double.parseDouble(GoodPrice));
		good.setGoodStore(Integer.parseInt(GoodStore));
		GoodService goodService = new GoodService();
		goodService.insertGood(good);
	}
	protected void dodelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String GoodId = request.getParameter("GoodId");
		int id =Integer.parseInt(GoodId);
		GoodService goodService = new GoodService();
		goodService.deleteGood(id);
	}
	protected void doupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Good good = new Good();
		int GoodId = Integer.parseInt(request.getParameter("GoodId"));
		String GoodName = request.getParameter("GoodName");
		try {
			byte bb[] = GoodName.getBytes("UTF-8");
			GoodName = new String(bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String GoodPrice = request.getParameter("GoodPrice");
		String GoodStore = request.getParameter("GoodStore");
		try {
			byte bb[] = GoodName.getBytes("utf-8");
			GoodName = new String(bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//String GoodType = request.getParameter("GoodType");
		good.setGoodId(GoodId);
		good.setGoodName(GoodName);
		good.setGoodPrice(Double.parseDouble(GoodPrice));
		good.setGoodStore(Integer.parseInt(GoodStore));
		GoodService goodService = new GoodService();
		goodService.updateGood(good);
	}
	

}
