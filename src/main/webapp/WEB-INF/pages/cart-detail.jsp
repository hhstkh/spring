<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<c:url var="url" value="/checkout/cart" />
<section>
	<h2>Order Detail</h2>

	<div class="row">
		<div class="col-lg-8">
			<div class="row title">2 sp</div>
			<c:forEach items="${cart.cartItems}" var="cartItem">
				<div class="row">
					<div class="col-lg-3">
						<img src="data:image/png;base64, ${cartItem.productImageBase64}"/>
					</div>
					<div class="col-right">
						<div class="col-lg-8">${cartItem.productName}</div>
						<div class="col-lg-2">${cartItem.productPrice}</div>
						<div class="col-lg-1">${cartItem.quantity}</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<div class="col-lg-4">
			<p>Total ${cart.grandTotal}</p>
			<a href="<c:url value="/checkout/shipping"/> ">Payment</a>
		</div>
	</div>


</section>