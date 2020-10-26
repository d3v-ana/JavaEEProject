package org.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.dao.UserDao;
import org.model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 设置请求编码
// 该类为项目与数据的接口（DAO接口），用于处理数据与数据库表的一些操作
		UserDao userDao = new UserDao();
		User user = userDao.checkUser(request.getParameter("userName"), request.getParameter("password"));
		if (user != null) { // 如果登录成功
			HttpSession session = request.getSession(); // 获得会话，用来保存当前登录用户信息
			session.setAttribute("user", user); // 把获取的对象保存在Session中
			response.sendRedirect("main.jsp"); // 验证成功中转到欢迎主页
		} else {
			response.sendRedirect("error.jsp"); // 验证失败跳转到错误处理页
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
