

<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BankAccount Management</title>
</head>
<body>
	<div align="center">
		<h1>BankAccount List</h1>
		<h3>
		<a href="savingAccount">savingAccount</a>
			
		</h3>
		<h3><a href="salaryAccount">salaryAccount</a></h3>
		<table border="1">
			<tr>
				<th>  AccountNumber  </th>
				<th>AccountHolderName</th>
				<th>Balance</th>
				<th>EditAccount</th>
				<th>DeleteAccount</th>
				
				
			</tr>
			<c:forEach var="bankAccount" items="${listBankAccount}">
				<tr>
                 
					<td>${bankAccount.accNo}</td>
					<td>${bankAccount.accName}</td>
					<td>${bankAccount.balance}</td>
					
					<td><a href="editBankAccount?id=${bankAccount.id}">Edit</a></td> 
					
					<td> <a
						href="deleteBankAccount?id=${bankAccount.id}">Delete</a></td>
					
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>