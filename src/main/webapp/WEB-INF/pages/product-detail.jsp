<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<c:url var="url" value="/checkout/addOrUpdateProduct" />
<div class="col-xs-5">
	<img src="data:image/png;base64, ${product.imageBase64 }"/>
</div>
<div class="col-xs-7">
	<h2>${product.productName}</h2>
	<p>${product.price}</p>
	<form class="form-inline" action="${url}" id="add-to-cart">
		<input type="hidden" name="product-id" value="${product.productId}"/>
		<div class="form-group">
			<label for="buyQty">Quantity: </label>
			<input type="number" min="1" max="100" value="1" name="buyQty" id="buyQty" class="form-control"/>
		</div>
		<button type="submit" class="btn btn-default">
			<span class="glyphicon glyphicon-shopping-cart"> Add to Cart</span>
		</button>
	</form>
</div>
<div class="col-xs-12">
	${product.description}
</div>