<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/test_struts.js"></script>
</head>
<body>

<input id="hidId" type="hidden" value="${pageContext.request.contextPath}" />

    ${username}
    <hr />

    <div id="divId"></div>

</body>
</html>
