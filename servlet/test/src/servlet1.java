import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet1 extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void service(HttpServletRequest reqest,HttpServletResponse response)
                       throws IOException{
      reqest.setCharacterEncoding("utf-8");
      String str=reqest.getParameter("hello");
      response.setContentType("text/html;charset=utf-8");//?????????MIME????
      PrintWriter out=response.getWriter();//?????????????????????????
      String sevletName=getServletName();
      out.println("<html><body bgcolor = #EEDDFF>");
      out.println("<b>"+sevletName+"<br></b>");
      if(str!=null&&str.length()>=1)
         out.println("<br>额外的参数是<h2>"+str+"<h2>");
      out.println("</body></html>");
   } 
}
