<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header role="banner">
	<div>
		<h1 class="logo">
			<a href="#"><img src="<c:url value="/resources/images/logo_new.png" /> " alt="Ffly"></a>
		</h1>
		<ul class="nav-anchors">
			<li><a href="#">Menu</a></li>
			<li><a href="#">Search</a></li>
		</ul>
		<form class="search reveal" action="#">
			<fieldset>
				<legend>Search the Site</legend>
				<label for="search-site">Search the site</label> <input
					type="search" id="search-site" placeholder="Search Store">
				<input type="submit" value="Search">
			</fieldset>
		</form>
		<nav class="nav reveal">
			<ul role="navigation">
				<c:forEach items="${categories}" var="category">
					<li><a href="<c:url value="/category/${category.id}"/> ">${category.name}</a></li>
				</c:forEach>
				<li>
					<a href="<c:url value="/checkout/cart"/> ">Cart: <span id="cart-number">0</span></a>
				</li>
			</ul>
		</nav>
	</div>
</header>