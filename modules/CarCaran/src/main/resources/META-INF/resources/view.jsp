<%@ page import="java.util.List" %>
<%@ page import="com.liferay.commerce.product.service.CPSpecificationOptionLocalServiceUtil" %>
<%@ page import="com.liferay.commerce.product.model.CPSpecificationOption" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ include file="init.jsp" %>

<portlet:defineObjects />

<style>

	.formStyle {
		margin-right: 25%;
		margin-left: 25%;
	}

</style>

<%
	List<CPSpecificationOption> cpSpecificationOptionList = CPSpecificationOptionLocalServiceUtil.
			getCPSpecificationOptions(-1,-1);
%>

<script>

	async function startAddCarWorkFlow (productId) {
		console.log("ProductId : " , productId)
		Liferay.Service(
				'/rm.timesheet/start-add-car-work-flow',
				{
					productId: productId
				},
				function(obj) {
					console.log(obj);
				}
		);
	}
	//  For Add New Car

	async function addProduct() {

		let productName = document.getElementById("<portlet:namespace/>name").value;
		let productPrice = document.getElementById("<portlet:namespace/>price").value;

		let myHeaders = new Headers();
		myHeaders.append("Authorization", "Basic YW50b255LmFAaWNhbmlvLmNvbTpZbm90bmFIc2lzYTEzMzE=");
		myHeaders.append("Content-Type", "application/json");

		let raw = JSON.stringify(
				{
					"active": true,
					"catalogId": "74639",
					"name": {
						"en_US": productName
					},

					"productStatus":1,
					"productType": "simple"
				}
		);

		let requestOptions = {
			method: 'POST',
			headers: myHeaders,
			body: raw,
			redirect: 'follow'
		};

		await fetch("http://localhost:8080/o/headless-commerce-admin-catalog/v1.0/products", requestOptions)
				.then(response => response.text())
				.then(result => {
					let response = JSON.parse(result);
					startAddCarWorkFlow(response.id);
					addPriceToProduct(response.productId,productPrice);
				})
				.catch(error => {
					console.log("error : " ,error);
					alert("Car Details Not Save , Please Check Your NetWork Connection !");
				} );
	}

	//  For Add Car's Price

	async function addPriceToProduct(productId,productPrice) {
		let price = productPrice;

		let myHeaders = new Headers();
		myHeaders.append("Authorization", "Basic YW50b255LmFAaWNhbmlvLmNvbTpZbm90bmFIc2lzYTEzMzE=");
		myHeaders.append("Content-Type", "application/json");

		let raw = JSON.stringify(
				{
					"cost": 0,
					"depth": 1.1,
					"discontinued": false,
					"discontinuedDate": "2023-06-03T15:52:01.851Z",
					"displayDate": "2023-06-03T15:52:01.851Z",
					"expirationDate": "2023-06-03T15:52:01.851Z",
					"externalReferenceCode": "AB-34098-789-N",
					"gtin": "Default",
					"height": 20.2,
					"manufacturerPartNumber": "12341234",
					"neverExpire": true,
					"price": price,
					"promoPrice": 0,
					"published": true,
					"purchasable": true,
					"replacementSkuExternalReferenceCode": "SKU0111",
					"replacementSkuId": 33135,
					"sku": "12341234",
					"skuOptions": [
						{}
					],
					"unspsc": "1234567890",
					"weight": 1.1,
					"width": 20.2
				}
		);

		let requestOptions = {
			method: 'POST',
			headers: myHeaders,
			body: raw,
			redirect: 'follow'
		};

		let isSuccess = false;
		await fetch("http://localhost:8080/o/headless-commerce-admin-catalog/v1.0/products/"+ productId +"/skus", requestOptions)
				.then(response => response.text())
				.then(result => {
					isSuccess = true;
					console.log(result);
				})
				.catch(error => {
					console.log('error', error)
				});

		if(isSuccess) {
			alert("Car Details Add Successfully ! ");
		} else {
			alert("Price Not Added To The Car , Please Check Connection !");
		}

	}

</script>

<div class="formStyle">

	<h1> Add Car </h1>
	<br>

	<portlet:actionURL var="addCarURL" name="addCar" >
	</portlet:actionURL>

	<portlet:renderURL var="backURL" >
		<portlet:param name="mvcPath" value="/view.jsp"/>
	</portlet:renderURL>

	<aui:form name="addCarForm" onSubmit="addProduct()" method="post" >

		<aui:input name="name" type="text" label="Name" />

		<aui:input name="price" type="text" value="0" label="Price" >
			<aui:validator name="number" />
		</aui:input>

		<aui:input name="carImage" type="file" label="Image" accept="image/png, image/gif, image/jpeg" />

		<%  for(CPSpecificationOption cpSpecificationOption : cpSpecificationOptionList) {  %>

		<aui:input name="<%= cpSpecificationOption.getTitle(locale,false) %>"
				   type="text" label="<%= cpSpecificationOption.getTitle(locale,false) %>" />

		<%  }  %>

		<aui:button type="submit" value="Save" > </aui:button>

		<a href="${backURL}" class="btn  btn-primary btn-default" > Cancel </a>

	</aui:form>

	<%

//
//		List<CPDefinitionSpecificationOptionValue> cpDefinitionSpecificationOptionValueList =
//				CPDefinitionSpecificationOptionValueLocalServiceUtil.getCPDefinitionSpecificationOptionValues(-1,-1);
//		for(CPDefinitionSpecificationOptionValue cpDefinitionSpecificationOptionValue : cpDefinitionSpecificationOptionValueList) {
//			System.out.println("cpDefinitionSpecificationOptionValue : " + cpDefinitionSpecificationOptionValue.getValue(locale,false));
//		}
	%>

</div>