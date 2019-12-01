package cn.zptc.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import cn.zptc.entity.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("username").toString(), pswd = request.getParameter("password").toString();
		  PrintWriter out = response.getWriter();
		if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "账号不能为空！");
			  out.println(false); 
			  return;
		} else if (pswd.equals("")) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			 out.println(false); 
			 return;
		} else {
			boolean bol = false;
			System.out.println("0");
			try {
				System.out.println("1");
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kq", "root", "root");
				Statement st = con.createStatement();
				String sql = "SELECT * FROM manage WHERE manage_name= '" + name + "' AND manage_pswd= '" + pswd
						+ "9647' ";
				System.out.println(sql);
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()) {
					Login login = new Login();
//					login.setName(name);
//					login.setPswd(pswd);
//					login.setSjmc(rs.getString("manage_sjmc"));
					request.getSession().setAttribute("name", name);
					request.getSession().setAttribute("sjmc", rs.getString("manage_sjmc"));
					bol = true;
					break;
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
			if (!bol) {
				JOptionPane.showMessageDialog(null, "账号或密码错误！");		
			}
			out.println(bol); 
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
