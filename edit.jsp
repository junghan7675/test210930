<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int b_id = Integer.parseInt(request.getParameter("b_id"));
	BoardDBBean db = BoardDBBean.getInstance();
	//BoardBean board = db.getBoard(b_id);
	BoardBean board = db.getBoard(b_id, false);
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<script type="text/javascript" src="board2.js" charset="utf-8" ></script>
</head>
<body>
	<center>
		<h1>글 수 정 하 기</h1>
		<form name="form" method="post" action="edit_ok.jsp?b_id=<%= b_id %>">
			<table>
				<tr height="30">
					<td width="80">작성자</td>
					<td width="140">
						<input type="text" name="b_name" maxlength="20" size="20" value="<%= board.getB_name() %>" >
					</td>
					<td width="80">이메일</td>
					<td width="240">
						<input type="text" name="b_email" maxlength="50" size="50" value="<%= board.getB_email() %>" >
					</td>
				</tr>
				<tr height="30">
					<td width="80">글제목</td>
					<td colspan="3">
						<input type="text" name="b_title" maxlength="80" size="80" value="<%= board.getB_title() %>" >
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea name="b_content" rows="10" cols="65">
							<%= board.getB_content() %>
						</textarea>
					</td>
				</tr>
				<tr>
					<td width="80">암&nbsp;&nbsp;호</td>
					<td colspan="3">
						<input type="password" name="b_pwd" maxlength="12" size="12">
					</td>
				</tr>
				<tr height="50" align="center">
					<td colspan="4">
						<input type="button" value="글수정" onclick="check_ok()">
						<input type="reset" value="다시작성">
						<input type="button" value="글목록" onclick="location.href='list.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>








