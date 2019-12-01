
package cn.zptc.android;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/WinSockForAndroid")
public class WinSockForAndroid extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");  //设置编码方式
		response.setCharacterEncoding("utf-8");
		System.out.println("接收到请求");
		
		User user = null;  //初始化接收的传输对象为空
		
		//(1) 获取android 请求，对传输对象的数据进行处理
		InputStream is = request.getInputStream();
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		String userjson = br.readLine();
		System.out.println(userjson);  //输出 json 格式数据
		
		String[] strings=userjson.split(":|,");
		
		strings[strings.length-1]=strings[strings.length-1].substring(0, strings[strings.length-1].length()-2);
		for(int i=0;i<strings.length;i++) {
			if(i%2==1)
				System.out.println(strings[i]);
		}
		try {
			System.out.println("3");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kq","root","root");
			Statement st = con.createStatement();
			String sql="";
			if (strings[3].equals("1")) {
				sql="insert into user(username,gender,bh,sj,sfqd,sfqj) values ('"+strings[0]+"','"+strings[1]+"','"+strings[2]+"','','','')";
			}else {
				sql="DELETE FROM  user where bh='"+strings[2]+"')";
			}
			st.executeUpdate(sql);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
            if (is != null)  is.close();
            if (isr != null)  isr.close();
            if (br != null)  br.close();
           

		
	}
	

}

