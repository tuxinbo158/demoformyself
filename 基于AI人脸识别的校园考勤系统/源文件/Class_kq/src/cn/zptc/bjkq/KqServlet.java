package cn.zptc.bjkq;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/kq")
public class KqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KqServlet() {
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
		System.out.println("0");
		try {
			System.out.println("1");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kq", "root", "root");
			Statement st = con.createStatement();
			String sql = "SELECT * FROM user";
			ResultSet rs = st.executeQuery(sql);
			System.out.println(sql);
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			Map<String, Object> map = new HashMap<String, Object>();
			String string = "";
			while (rs.next()) {
				string += rs.getString("sj") + "z" + rs.getString("bh") + "z" + rs.getString("username")
						+ "z" + rs.getString("kc");
				string += "zz";
				string += rs.getString("sfqd");
				string += "zz";
				string += rs.getString("sfqj");
				string += "zzz";
				map = new HashMap<String, Object>();

				map.put("sj", rs.getString("sj"));

				map.put("bh", rs.getString("bh"));

				map.put("username", rs.getString("username"));

				map.put("kc", rs.getString("kc"));

				map.put("sfqd", rs.getString("sfqd"));

				map.put("sfqj", rs.getString("sfqj"));
				list.add(map);
			}
			System.out.println(string);
			PrintWriter out = response.getWriter();
			out.println(string);
			out.flush();
			out.close();
			return;
		} catch (Exception e) {
			// TODO: handle exception
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
