<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>

<style type="text/css">
.backgroundimg{
		       background-image: url('https://images.unsplash.com/photo-1603389335957-10bea39c9d32?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8dGVjaG5vbG9neSUyMHByb2R1Y3RzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80');
		       background-size: cover;
		       background-position: center;
		       background-repeat: no-repeat;
		       
		}
		
body header{
			text-align: center;
			color: white;
			font-size: x-large;
}

section article, footer{
			height:200px;
			width:500px;
			border:5px solid black;
			padding:60px 30px;
			margin:0 auto;	
			margin-top:85px;
			text-align:center;
			font-family:"Cooper", sans-serif,Arial;
			background-color: white;	
			 box-shadow: 0 10px 10px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			 opacity: 0.7;
		}
</style>
</head>
<body class="backgroundimg">
<section>
	<article>
		<h2>Product Management</h2>
				<a href="productform">Add Product</a><br><br>
			 <a href="viewproduct">View Product</a> 
    </article>
</section> 
</body>
</html>