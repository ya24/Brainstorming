<%@ page contentType="text/html" pageEncoding="GBK" %>
<html>
  <head>
    <title>��¼</title>
  </head> 
  <body>
<%
	request.setCharacterEncoding("GBK") ;
%>
    <form action="LoginServlet" method="post">
    	�û�����<input type="text" name="uname"><br>
    	���룺<input type="password" name="upsw"><br>
    	<input type="submit" value="��¼">
    	<input type="reset" value="����">  <a href="regist.jsp">ע��</a>  	
    </form>
  </body>
</html>
