<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:set var="currentLocale" value="${pageContext.response.locale}"/>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title><tiles:getAsString name="title"></tiles:getAsString></title>

<!-- Bootstrap Core CSS -->
<link href="<c:url value='/resources/css/bootstrap.min.css'/>"
	rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<!-- Custom CSS -->
<link href="<c:url value='/resources/css/shop-homepage.css'/>"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<!-- Navigation -->
	<tiles:insertAttribute name="menu" />

	<!-- Page Content -->
	<div class="container">
		<tiles:insertAttribute name="body" />
	</div>
	<!-- /.container -->

	<div class="container">

		<hr>

		<!-- Footer -->
		<tiles:insertAttribute name="footer" />

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="<c:url value='/resources/js/jquery.js'/>"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
	
	<script src="<c:url value='/resources/js/shopping.js'/>"></script>

</body>

</html>
