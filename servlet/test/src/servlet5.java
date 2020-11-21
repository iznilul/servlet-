import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet5 extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void  doPost(HttpServletRequest request,HttpServletResponse response)
                throws ServletException,IOException{
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out=response.getWriter();
      out.println("<html><body bgcolor=#FFAA99>");
      String s=request.getParameter("number");
      String []a=s.split(",");
      double sum = 0;
      for(String item:a) {
         if(item.length()>=1)
          sum+=Double.parseDouble(item);
      } 
      out.print("请求方式是"+request.getMethod()+"<br>") ;
      for(String item:a) {
         if(item.length()>=1)
          out.print(item+" ");
      }  
      out.print("<br>数的和:"+sum);
      out.println("</body></html>");
   } 
   public  void  doGet(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException{
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out=response.getWriter();
      out.println("<html><body bgcolor=#EEFFCC>");
      String s=request.getParameter("number");
      String []a=s.split("[,??]+");
      double product = 1;
      for(String item:a) {
         if(item.length()>=1)
          product*=Double.parseDouble(item);
      }
      out.print("请求方式是"+request.getMethod()+"<br>") ;
      for(String item:a) {
         if(item.length()>=1)
          out.print(item+" ");
      }   
      out.print("<br>数的积:"+product);
      out.println("</body></html>");
   }
}
