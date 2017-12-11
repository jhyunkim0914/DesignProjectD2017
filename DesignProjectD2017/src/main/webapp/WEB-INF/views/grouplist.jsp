<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자왜점</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
 <link rel='stylesheet' href='stylesheets/style.css'/>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<!-- 인클루드 top -->
    <%@ include file="./top/top.jspf" %>

<div id ="mynav">
     <ul class="sidenav">
          <li><a class="active" href="#">초대하기</a></li>
          <li><a href="#">ON/OFF</a></li>

          <li><a href="#">주문하기</a></li>
          <li><a href="#">정보보기</a></li>
     </ul>
</div>

<!-- 게시물 리스트 보여주기 -->
<div class="container">
    <table class="table table-board">
        <colgroup>
            <col width="7%">  <!-- 글 번호 -->
            <col width="*">       <!--  제목   -->
            <col width="15%"> <!-- 작성자 -->
            <col width="10%"> <!-- 작성일 -->
            <col width="7%">  <!-- 조회수 -->
        </colgroup>
        <thead>
            <tr>
                <th style="text-align:center;">그룹 번호</th>
                <th style="text-align:center;">그룹 이름</th>
                <th style="text-align:center;">상태</th>
            </tr>
            <c:forEach var="item" items="${groupList}" varStatus="status">
				<tr>
	                <td style="text-align:center;">${item.groupidx}</td>
	                <td>${item.name}</td>
	                <td style="text-align:center;">${item.groupState}</td>
	            </tr>
			</c:forEach>            
	</table>
	
    <div class="huge-top">
        <button class="btn btn-normal pull-right" id="insert" onclick="location.href = '/makegroupview'" >그룹결성</button>
    </div>
</div>

</body>
</html>