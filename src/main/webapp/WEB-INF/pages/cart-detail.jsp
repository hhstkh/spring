<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<c:url var="url" value="/checkout/cart" />
<section>
	<h2>Order Detail</h2>

	<div class="row">
		<div class="col-lg-8">
			<div class="row title"></div>
			<form id="cart">
				<c:forEach items="${cart.cartItems}" var="cartItem">
					<div class="row">
						<div class="col-lg-3"></div>
						<div class="col-right">
							<div class="col-lg-8">${cartItem.productName}</div>
							<div class="col-lg-2">10</div>
							<div>
								<output class="item-total" name="item-total">${cartItem.totalPrice}</output>
							</div>
						</div>
					</div>
				</c:forEach>
			</form>
		</div>
		<div class="col-lg-4"></div>
	</div>


</section>