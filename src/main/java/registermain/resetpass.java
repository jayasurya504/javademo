package registermain;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class resetpass
 */
@WebServlet("/resetpass")
public class resetpass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter b=response.getWriter();
		
	String	name=request.getParameter("name");
	String	 pass=request.getParameter("pass");
	     
	
		
				     try {  
		         
		            Class.forName("com.mysql.jdbc.Driver");
					
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/surya","root","12345");
					PreparedStatement ps=c.prepareStatement("update dept1 SET pass=? WHERE sname=?");
				//	model m=new model (name,pass);
					    ps.setString(1,pass);
		                ps.setString(2,name);
		                int a=ps.executeUpdate();
		                

		    			if ( a==1) {
		    				b.print("updated");
		    				
		    			}
		    			
		    		
		    			else
		    			{
		    				b.print("failed");
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
		    		
		    	
		    	
