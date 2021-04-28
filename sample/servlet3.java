import java.io.*;  
import java.util.*;  
import javax.servlet.*; 
import javax.servlet.http.*;  
  
public class servlet3 extends HttpServlet 
{  

public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException
			{  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("userName");  
String p=request.getParameter("userPass");  
String e=request.getParameter("userEmail");  
String c=request.getParameter("userCountry");  

out.println("username="+n);
out.println("<br>");
out.println("userpass="+p);
out.println("<br>");
out.println("useremail="+e);
out.println("<br>");
out.println("usercountry="+c);
out.close();
			}
}

          
