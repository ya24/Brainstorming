<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<html>
  <head>
    <title>��ӭҳ������</title>
  </head> 
  <body>
    <%request.setCharacterEncoding("GBK"); %>
    <table width="80%" border="1">
    	<tr>
    		<td>�û�ID</td>
    		<td>�û���</td>
    		<td>����</td>
    		<td>ͷ��</td>
    	</tr>
    	<tr>
    		<td>${info.userID}</td>
    		<td>${info.userName}</td>
    		<td>${info.userEmail}</td>
    		<td>${info.picturePath}</td> 
    	</tr>
    </table>
  </body>
  
</html>
