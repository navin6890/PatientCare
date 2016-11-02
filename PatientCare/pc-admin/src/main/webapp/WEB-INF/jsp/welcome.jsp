<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>${user.name}</title>
</head>
<body>
NAME      : ${user.name}<br/>
EMAIL ID  : ${user.emailId}<br/>
ID        : ${user.id}<br/>
PASSWORD  : ${user.password}<br/>
IS DELETED: ${user.isDeleted}<br/>
USERNAME  : ${user.username}<br/>
DATE      : ${user.date}<br/>
ROLE ID   : ${user.roleId}
</body>
</html>