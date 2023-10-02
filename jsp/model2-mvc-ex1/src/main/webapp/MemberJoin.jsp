<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<center>
		<h2>회원가입</h2>
		<form action="JoinHello" method="post">
			<table width="500" border="1">
				<tr height="50">
					<td width="150" align="center">
						아이디
					</td>
					<td width="350" align="center">
						<input type="text" name="id" size="40" placeholder="id를 입력하세요"/>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">
						비밀번호
					</td>
					<td width="350" align="center">
						<input type="password" name="password1" size="40" placeholder="비밀번호를 입력하세요"/>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">
						비밀번호 확인
					</td>
					<td width="350" align="center">
						<input type="password" name="password2" size="40" placeholder="비밀번호를 확인해주세요"/>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">
						이메일
					</td>
					<td width="350" align="center">
						<input type="email" name="email" size="40"/>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">
						전화번호
					</td>
					<td width="350" align="center">
						<input type="tel" name="phone_number" size="40"/>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">
						당신의 관심분야
					</td>
					<td width="350" align="center">
						<input type="checkbox" name="hobby" size="40" value="캠핑"/>캠핑 &nbsp;
						<input type="checkbox" name="hobby" size="40" value="등산"/>등산 &nbsp;
						<input type="checkbox" name="hobby" size="40" value="영화"/>영화 &nbsp;
						<input type="checkbox" name="hobby" size="40" value="독서"/>독서 &nbsp;
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">
						당신의 직업은
					</td>
					<td width="350" align="center">
						<select name="job">
							<option type="checkbox" value="교사">교사</option>
							<option type="checkbox" value="변호사">변호사</option>
							<option type="checkbox" value="의사">의사</option>
							<option type="checkbox" value="기술사">기술사</option>
						</select>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">
						당신의 연령은
					</td>
					<td width="350" align="center">
						<input type="checkbox" name="age" size="40" value="10">10대 &nbsp;</input>
						<input type="checkbox" name="age" size="40" value="20">20대  &nbsp;</input>
						<input type="checkbox" name="age" size="40" value="30">30대  &nbsp;</input>
						<input type="checkbox" name="age" size="40" value="40">40대  &nbsp;</input>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">하고 싶은말</td>
					<td width="350" align="center">
							<textarea rows="5" cols="40" name="info"></textarea>	
					</td>
				</tr>
					
				<tr height="50">
					<td width="150" colspan="2">
						<input type="submit" value="회원 가입">	
						<input type="reset" value="취소">			
					</td>
				</tr>												
			</table>
		
		</form>
	</center>
</body>
</html>