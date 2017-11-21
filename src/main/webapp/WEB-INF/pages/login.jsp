<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8"%>
<c:url var="loginUrl" value="/login" />
<form action="${loginUrl}" method="post" class="form-signin">
	<c:if test="${param.error != null}">
		<div class="alert alert-danger">
			<p>Invalid username and password.</p>
		</div>
	</c:if>
	<c:if test="${param.logout != null}">
		<div class="alert alert-success">
			<p>You have been logged out successfully.</p>
		</div>
	</c:if>
	
	<div class="form-group">
		<label class="sr-only" for="username">Username</label>
		<input type="text" class="form-control"
				id="username" name="ssoId" placeholder="Enter Username" required autofocus>
	</div>
	<div class="form-group">
		<label class="sr-only" for="password"></label>
		<input type="password" class="form-control"
				id="password" name="password" placeholder="Enter Password" required>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox" value="remember-me"> Remember me
		</label>
	</div>
	
	<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />
		
	<button class="btn  btn-lg btn-primary btn-block" type="submit">Sign in</button>

</form>