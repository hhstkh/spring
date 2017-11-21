<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="row">

	<c:forEach items="${products}" var="product">
		<div class="col-sm-4 col-lg-4 col-md-4">
			<div class="thumbnail">
				<a href="<c:url value="/product/${product.productId}"/> " >
						<img src="data:image/png;base64, ${product.imageBase64}" alt="">
				</a>
				<div class="caption">
					<h4 class="pull-right">
						<fmt:formatNumber value="${product.price}" type="currency" />
					</h4>
					<h4>
						<a href="#">${product.productName}</a>
					</h4>
				</div>
				<div class="ratings">
					<p class="pull-right">15 reviews</p>
					<p>
						<span class="glyphicon glyphicon-star"></span> <span
							class="glyphicon glyphicon-star"></span> <span
							class="glyphicon glyphicon-star"></span> <span
							class="glyphicon glyphicon-star"></span> <span
							class="glyphicon glyphicon-star"></span>
					</p>
				</div>
			</div>

		</div>
	</c:forEach>

</div>