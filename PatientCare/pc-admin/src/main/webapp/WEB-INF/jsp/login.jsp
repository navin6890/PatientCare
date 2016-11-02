<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
</head>
<body>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;</p>

	<form:form method="POST" action="signIn"
		modelAttribute="admin" autocomplete="off">
		<table width="100%" border="0">
			<tr>
				<td><div class="form-control">
						<label>
							<p>
								User Name<small class="required"></small>
							</p> <form:input path="emailId" class="inputControl"
								placeholder="Please enter your email" required="autofocus"
								maxlength="50" id="emailId" />
						</label>
					</div></td>
			</tr>
			<tr>
				<td><div class="form-control">
						<label>
							<p>
								Password<small class="required"></small>
							</p> <form:password path="password" placeholder="Password"
								required="autofocus" maxlength="15" id="password" />
						</label>
					</div></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
</body>
</html>