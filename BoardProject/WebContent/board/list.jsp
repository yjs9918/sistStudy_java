<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,com.sist.board.*"%>
<%
     BoardDAO dao=new BoardDAO();
     ArrayList<BoardDTO> list=dao.boardListData(1);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
td,th{
   font-size: 9pt;
   font-family: 맑은 고딕;
}
a{
    text-decoration: none;
    color:black;
}
a:hover{
    text-decoration: underline;
    color:green;
}
</style>
</head>
<body>
    <center>
       <h3>게시판</h3>
       <table border=0 width=600>
         <tr>
          <td align=left>새글</td>
         </tr>
       </table>
       <table border=0 width=600>
         <tr bgcolor=pink>
           <th width=10%>번호</th>
           <th width=45%>제목</th>
           <th width=10%>이름</th>
           <th width=15%>작성일</th>
           <th width=10%>조회수</th>
         </tr>
         <%
             int i=0;
             String color="";
             for(BoardDTO d:list)
             {
            	 if(i%2==0)
            		 color="white";
            	 else
            		 color="yellow";

           %>
               <tr bgcolor=<%=color %>>
                <td width=10% align=center><%=d.getNo() %></td>
                <td width=45% align=left>
                 <a href="#"><%=d.getSubject() %></a></td>
                <td width=10% align=center><%=d.getName() %></td>
                <td width=15% align=center><%=new SimpleDateFormat("yyyy-MM-dd").format(d.getRegdate()) %></td>
                <td width=10% align=center><%=d.getHit() %></td>
               </tr>
              
         <%
                i++;
             }
         %>
       </table>
       <hr width=600>
    </center>
</body>
</html>





