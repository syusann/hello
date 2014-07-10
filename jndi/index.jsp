<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<b>Test DB using jndi</b> <hr />
<%
Context initContext = null;
Context envContext  = null;
DataSource ds       = null;
Connection connection = null;
Statement stmt = null;
ResultSet rs = null;
String sql = null;
try {            
  initContext = new InitialContext();
  envContext = (Context)initContext.lookup("java:/comp/env");
  ds = (DataSource)envContext.lookup("jdbc/MysqlWorld");
  connection = ds.getConnection();
  if(connection != null && !connection.isClosed()) {                                   
        out.println("connect success！");  
        stmt = connection.createStatement();
    rs = stmt.executeQuery("select * from country");
    while(rs.next()){
      out.println(rs.getString(1)+ "<BR>");
      out.println(rs.getString(2)+ "<BR>");
         }       
    }
} catch(SQLException e) {         
    out.println("connect error");              
} finally {
  rs.close();
  stmt.close();
  connection.close();  
}   
%>
</body>
</html>