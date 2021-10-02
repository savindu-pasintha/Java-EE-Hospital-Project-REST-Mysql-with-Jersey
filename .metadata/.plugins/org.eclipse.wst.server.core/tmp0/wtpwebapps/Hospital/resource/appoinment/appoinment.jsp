<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%
/*
<link rel="stylesheet" href="../common/css/bootstrap.min.css">

*/
%>
<style>
.box-rox {
	width: 100%;
}

.box-row-item {
	width: 50%;
	height: auto;
	background: #e6e6e6;
	border: 2px solid none;
	position: relative;
	left: 25%;
	right: 25%;
	padding: 25px;
}

.box-row-item-1 {
	height: 50px;
}

.box-row-item-1 p {
	color: black;
	text-align: justify;
}

.box-row-item-1 h4 {
	text-align: center;
	font-weight: bolder;
	padding: 5px;
	color: white;
	font-size: 15px;
}

.box-row-item-1 h1 {
	font-size: 50px;
	font-weight: bolder;
}

@media all and (max-width: 300px) {
	.test h1{
		font-size:30px;
		text-align:center;
		
		width:100%;
		height:auto;
	}
}

@media all and (min-width: 300px) {
	.test h1{
		font-size:50px;
		text-align:center;
		
		width:100%;
		height:auto;
	}
}
</style>

</head>
<body>
	<div class="container-fluid test">
		<div class="text-center p-5">
			<h1>ABC Hospital</h1>
		</div>

		<div class="box-row">
			<div class="box-row-item">
				<div class="bg-primary box-row-item-1">
					<h4>Book an Appointment and Save upto Rs.300/=</h4>
				</div>
				<div>
					<label class="text-danger"> <% 
				    String validation = "Sorry, the doctor you searched is not available. Please try- Selecting an alternative Hospital :- Selecting an alternative Specialization";
				    if(true){
				    	out.print(validation);
				    }
				    %>
					</label>

					<form>
						<div class="mb-3">
							<label for="exampleFormControlInput1" class="form-label"></label>
							<select class="form-select  form-control"
								aria-label="Default select example">
								<option selected>Any Doctor</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
						</div>
						<div class="mb-3">
							<select class="form-select  form-control"
								aria-label="Default select example">
								<option selected>Any Specialization</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
						</div>
						<div class="mb-3">
							<select class="form-select form-control"
								aria-label="Default select example">
								<option selected>Any Hospital</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
						</div>
						<div class="mb-3">
							<input type="datetime-local" class="form-control"
								id="exampleFormControlInput1" required>
						</div>
						<div class="text-center mb-3">
							<button type="submit" class="btn btn-dark ">search</button>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>
</body>
<% /*
<script type="text/javascript"
src="../common/js/bootstrap.min.js"></script>
*/ %>
</html>