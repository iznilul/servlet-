import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet3 extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void service(HttpServletRequest request,HttpServletResponse response)
                       throws IOException{
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out=response.getWriter();
      out.println("<html><body bgcolor=#EEFFAA>");
      String a=request.getParameter("height");
      String b=request.getParameter("weight");
      String c=request.getParameter("age");
      if(a==null||a.length()==0)
         return;
      out.print("身高"+a+",体重"+b+",年龄"+c);
      out.println("</body></html>");
   } 
}
