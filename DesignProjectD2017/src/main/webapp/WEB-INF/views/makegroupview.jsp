<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel='stylesheet' href='stylesheets/style.css'/>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>그룹 만들기</title>
</head>
<body>
<!-- 인클루드 top -->
    <%@ include file="./top/top.jspf" %>


<!-- 게시물 리스트 보여주기 -->
<div id ="mynav">
     <ul class="sidenav">
          <li><a class="active" href="#">초대하기</a></li>
          <li><a href="#">ON/OFF</a></li>

          <li><a href="#">주문하기</a></li>
          <li><a href="#">정보보기</a></li>
     </ul>
</div>

<div class="container">
    <div id="content"> <br/>
      <div id="search">
        <select style="weight:20%; height:25px;">
            <option value="name" >이름</option>
            <option value="email">이메일</option>
        </select>
        <input type='text' name='usersearch' style = "width:200px; height:25px;"><button class ="search">검색</button><br/><br/></div><!--온클릭이벤트 제이쿼리써서 출력-->
        <p class="searchtitle">검색결과</p>
        <form action="/inviteCustomers">
        <table class="sub_news" border="1" cellspacing="0" summery="게시판 글제목 리스트">
            <colgroup>
              <col width="100">
              <col width="100">
              <col width="80">
            </colgroup>

            <thead>
              <tr>
                <th scope="col">이름</th>
                <th scope="col">이메일</th>
                <th scope="col">선택</th>
              </tr>
            </thead>

            <tbody>
            	<c:forEach var="item" items="${customerList}" varStatus="status">
					<tr>
						<td class="tdname">${item.name}</td>
						<td class="tddate">${item.email}</td>
					  	<td class="hit"><input type="checkbox" name="check" value="${item.id}"></td>
					</tr>
				</c:forEach>
            </tbody>

        </table>
		
        <p class="searchtitle">초대리스트 <img src ="public/images/refresh.png" width="20" id= "refresh" /></p>
        김민경, 김정은, 김재현, 정현희 총 4명을 추가했습니다<br/><br/><br/>


          <button class="searchbutton">초대하겠습니다</button>
          </form>
    </div>
	
    <div class="huge-top">
        <button class="btn btn-normal pull-right" id="insert" onclick="location.href = '/makegroupview'" >그룹결성</button>
    </div>
</div>
</body>