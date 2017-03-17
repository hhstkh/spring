<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<c:url value="/" />"> Home</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="<c:url value="/products"  />" >Products</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                    <li>
                    	<a href="<c:url value="/logout"/>" >Logout</a>
                    </li>
                    <li>
                    	<a href="<c:url value="/register"/>"></a>
                    </li>
                    <li>
                    	<a class="glyphicon glyphicon-shopping-cart" href="<c:url value="/checkout/cart"/>">
                    		<span id="cart-count">
                    			<c:if test="${cart.numberOfItems gt 0}">
                    				${cart.numberOfItems}
                    			</c:if>
                    		</span>
                    	</a>
                    </li>
                    <!-- 
                    <li>
                    	<a href="<c:url value="/changeLang?lang=en"/> ">English</a>
                    	<a href="<c:url value="/changeLang?lang=vi"/> ">Vietnamese</a>
                    </li>
                     -->
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>