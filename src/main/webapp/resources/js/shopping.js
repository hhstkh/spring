function Cart() {
    this.grantTotal = 0;
}

Cart.prototype.calculateTotal = function($output) {
    var total = 0;
    $output.each(function(idx, el) {
        total += parseFloat(el.value);
    })

    this.grantTotal = total;
};

$(document).ready(function($) {
	$("#add-to-cart").submit(function(event) {

		// Prevent the form from submitting via the browser.
		event.preventDefault();
		
		var data = {};
		var $form = $(this),
			url = $form.attr("action"),
			$qty = $form.find("input[name='qty']"),
			$productId = $form.find("input[name='product-id']"),
			$productName = $form.find("input[name='product-name']"),
			$productPrice = $form.find("input[name='product-price']");
		
		data["qty"] = parseInt($qty.val());
		data["productId"] = parseInt($productId.val());
		data["productName"] = $productName.val();
		data["productPrice"] = $productPrice.val();
		
	
		$.ajax({
			type : "POST",
			url : url,
			dataType: "json",
			data: { 
				productId: data["productId"], 
				qty: data["qty"],
				productName: data["productName"],
				productPrice: data["productPrice"]
			},
			success : function(result) {
				var $cartNumber = $("#cart-number");
				var qty = parseInt($cartNumber.html());
				$cartNumber.html(qty + data["qty"]);
			},
			error : function(e) {
				console.log("ERROR: ", e);
			}
			
		});
		

	});
	
	var cart = new Cart();

    $("#cart input[type='number']").on("input", function() {
        var $changingQty = $(this),
            $chaningTr = $changingQty.closest("tr");

        var $price = $chaningTr.find("td.p-price"),
            $itemTotal = $chaningTr.find("output.item-total");

        var price = parseFloat($price.html());
        var qty = parseInt($changingQty.val());

        $itemTotal.html(price * qty);

        console.log("aaaaaa");
        // Update total money
        var $order = $("#cart"),
            $itemTotals = $order.find("output.item-total");
            $grantTotal = $order.find("output.order-total");
        
        cart.calculateTotal($itemTotals);

        console.log(numberWithCommas(cart.grantTotal));
        
        $grantTotal.html(cart.grantTotal);

    })
});