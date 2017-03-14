<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="content product-info" role="main">
	<section class="product-main">
		<header>
			<h1 class="product-name">${product.productName}</h1>
			<div class="product-overview">
				<strong class="price">$23</strong>
				<ol class="star">
					<li>*</li>
					<li>*</li>
					<li>*</li>
					<li>*</li>
				</ol>
				<a class="review-count" href="#">8 Reviews</a>
			</div>
		</header>
		<div class="product-img">
			<figure class="img-container">
				<div id="img-list">
					<ul>
						<li><img src="data:image/png;base64,${product.imageBase64}"></li>
						<li><img src="images/product_img_2.jpg"></li>
						<li><img src="images/product_img_3.jpg"></li>
					</ul>
				</div>
			</figure>
			<nav>
				<ul>
					<li><img src="images/product_img_1_thumb.jpg"></li>
					<li><img src="images/product_img_2_thumb.jpg"></li>
					<li><img src="images/product_img_3_thumb.jpg"></li>
				</ul>
			</nav>
		</div>
		
		<c:url var="addProductUrl" value="/checkout/addProduct"/>
		
		<form class="product-form" id="add-to-cart" action="${addProductUrl}">
			<fieldset>
				<legend>Add to Cart</legend>
				<div class="field qty-field">
					<label for="qty">Qty</label> <input name="qty" id="qty"
						type="number" value="1" min="1" max="999">
				</div>
				<div class="field size-field">
					<label for="size">Size</label> <select>
						<option value="s">S</option>
						<option value="m">M</option>
						<option value="l">L</option>
						<option value="xl">XL</option>
					</select>
				</div>
				<div class="submit-form">
					<input type="submit" value="Add to Cart">
				</div>
				<input type="hidden" name="product-id" value="${product.productId}">
				<input type="hidden" name="product-name" value="${product.productName}">
				<input type="hidden" name="product-price" value="${product.price}">
			</fieldset>
		</form>
		<div class="product-utils">
			<a href="#">Share</a><a href="#">Find Nearby</a>
		</div>
		<div class="product-description">
			<div>
				<p>Behold, your new favorite shirt! This built-to-last tee
					adapts to your size and capabilities, starting off XS then
					stretches and scales to keep you comfortable as you grow taller and
					wider. The future is here, so look sharp.</p>
			</div>
		</div>
	</section>
	<section class="aux related-products">
		<header>
			<a href="#">
				<h2>Similar T-shirts</h2>
			</a>
		</header>
		<div role="tabpanel">
			<div class="related-list">
				<ul>
					<c:forEach items="${products}" var="p">
						<li>
							<a href="#">
								<img src="data:image/png;base64,${p.imageBase64}">
							</a>
						</li>
					</c:forEach>
					
				</ul>
			</div>
		</div>
	</section>
	<section class="aux reviews">
		<header>
			<a href="#">
				<h2>8 Reviews</h2>
				<ol class="star">
					<li>*</li>
					<li>*</li>
					<li>*</li>
					<li>*</li>
				</ol>
			</a>
		</header>
		<div role="tabpanel">
			<div>
				<ol class="reviews-list">
					<li><img src="images/avatar.png">
						<div class="review-meta">
							<ol class="star">
								<li>*</li>
								<li>*</li>
								<li>*</li>
								<li>*</li>
							</ol>
							<h3>Awesome shirt!</h3>
							<a href="#"><time datetime="2010-01-20">11/12/2011</time> By
								Nick McKinsey</a>
						</div>
						<div class="review-content">
							<p>This shirt looks awesome and is really comfortable to
								wear. It did shrink quite a lot when washed, but that could have
								just been how I ran it. All in all, it's my favourite shirt, and
								I love wearing it.</p>
						</div></li>
					<li><img src="images/avatar.png">
						<div class="review-meta">
							<ol class="star">
								<li>*</li>
								<li>*</li>
								<li>*</li>
								<li>*</li>
							</ol>
							<h3>Awesome shirt!</h3>
							<a href="#"><time datetime="2010-01-20">11/12/2011</time> By
								Nick McKinsey</a>
						</div>
						<div class="review-content">
							<p>This shirt looks awesome and is really comfortable to
								wear. It did shrink quite a lot when washed, but that could have
								just been how I ran it. All in all, it's my favourite shirt, and
								I love wearing it.</p>
						</div></li>
					<li><img src="images/avatar.png">
						<div class="review-meta">
							<ol class="star">
								<li>*</li>
								<li>*</li>
								<li>*</li>
								<li>*</li>
							</ol>
							<h3>Awesome shirt!</h3>
							<a href="#"><time datetime="2010-01-20">11/12/2011</time> By
								Nick McKinsey</a>
						</div>
						<div class="review-content">
							<p>This shirt looks awesome and is really comfortable to
								wear. It did shrink quite a lot when washed, but that could have
								just been how I ran it. All in all, it's my favourite shirt, and
								I love wearing it.</p>
						</div></li>
					<li><img src="images/avatar.png">
						<div class="review-meta">
							<ol class="star">
								<li>*</li>
								<li>*</li>
								<li>*</li>
								<li>*</li>
							</ol>
							<h3>Awesome shirt!</h3>
							<a href="#"><time datetime="2010-01-20">11/12/2011</time> By
								Nick McKinsey</a>
						</div>
						<div class="review-content">
							<p>This shirt looks awesome and is really comfortable to
								wear. It did shrink quite a lot when washed, but that could have
								just been how I ran it. All in all, it's my favourite shirt, and
								I love wearing it.</p>
						</div></li>
				</ol>
				<a href="#">Read All Reviews</a>
			</div>
		</div>
	</section>
</div>