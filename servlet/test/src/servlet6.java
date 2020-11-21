import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet6 extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      String number=request.getParameter("number");     
      try{   double n=Double.parseDouble(number);
             if(n<0)
                response.sendRedirect("servlet6_show.jsp");
             else{
                RequestDispatcher dispatcher= 
                request.getRequestDispatcher("servlet6_show.jsp");
                dispatcher.forward(request, response);
             }
      }
      catch(NumberFormatException e){
           response.sendRedirect("servlet6.jsp");
      }
   } 
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
        doPost(request,response);
   }
}
