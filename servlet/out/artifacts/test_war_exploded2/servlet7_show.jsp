<%@ page contentType="text/html;charset=gb2312" %>
<HTML><body>
<%  String message=(String)session.getAttribute("message"); //��ȡ�Ự�е���Ϣ
%>
<table border=1>
<form action="seven" method=post>
 <tr><td> �������Ĳ²⣨a~z֮�����ĸ��:</td>
 <td><input Type=text name=letter size=4>
     <input Type=submit value="�ύ"></td>
 </tr><td> ��ʾ��Ϣ:</td>
      <td> <%= message%></td>
</form>
<form action="servlet7.jsp" method=post>
  <tr><td>������ť���¿�ʼ: </td>
      <td><Input type=submit value="����õ�һ����ĸ"></td>
  </tr>
</form>
</table>
</body></HTML>
