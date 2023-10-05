package registermain;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class registermain
 */
@WebServlet("/registermain")
public class registermain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String name;
       private String pass;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter b=response.getWriter();
		
		
		 name=request.getParameter("name");
		 pass=request.getParameter("pass");
		String phno=request.getParameter("phno");
	//	String email=request.getParameter("email");

		
		
		try {
 		Class.forName("com.mysql.jdbc.Driver");
			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/surya","root","12345");
			
		PreparedStatement ps=c.prepareStatement("insert into DEPT1 values(?,?,?)");
			//PreparedStatement ps=c.prepareStatement("insert into DEPT1 values  (?,?,?) ");
			//PreparedStatement ps=c.prepareStatement("delete from  DEPT1 where  pass='12340'");
			
		ps.setString(3,phno);
			
			
		model m=new model (name,pass);
	
		ps.setString(1,m.getName());
		ps.setString(2,m.getPass());
			
			int a=ps.executeUpdate();		
			if ( a==0) {
				b.print("failed");
				
			}
			
		
			else
			{
				RequestDispatcher dis1=request.getRequestDispatcher("login.jsp");
				dis1.forward(request,response);
					
			}
			
			
			
			
		}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter b=response.getWriter();
			 String name1= request.getParameter("name");
			 String pass1=request.getParameter("pass");
			 String phno1=request.getParameter("phno");
			 
				
			
				try {
			 		Class.forName("com.mysql.jdbc.Driver");
						
						Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/surya","root","12345");
						
					PreparedStatement ps=c.prepareStatement("select * from DEPT1  where sname =? and pass=?");
					
						//PreparedStatement ps=c.prepareStatement("insert into DEPT1 values  (?,?,?) ");
						//PreparedStatement ps=c.prepareStatement("delete from  DEPT1 where  pass='12340'");
						
					ps.setString(1,name1);
					ps.setString(2,pass1);
					//ps.setString(3,phno1);
						
						
					
	
				
						
					ResultSet rs=ps.executeQuery();
						
						if(rs.next()) {
						b.print("success");
						}
						
						else {
							b.print(name);
							
								
						}

						
						
						
					}
						catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
							
				
				

		
				}
	