<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body bgcolor=pink><font size=2>
 <h3>尽管servlet6.jsp它没有直接请求我<br></h3>
 <h3>我能获得servlet6.jsp提交的非负数，
 <br>但不能获得servlet6.jsp提交的负数。
 </h3>
 <%
     String number= request.getParameter("number");
 %>
 <h2>
  <b><br>用户在servlet6.jsp输入的非负数是<%= number%>
 </h2>
</body></HTML>
