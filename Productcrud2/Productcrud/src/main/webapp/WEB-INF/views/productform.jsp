<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
  <%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<style type="text/css">
.center {
  margin-left: auto;
  margin-right: auto;
}
</style>
</head>
<body>

        <h1 style="text-align: center;">Add New Product</h1> </h1><hr><br><br> 
       <form:form method="post" action="save">    
        <table class="center">  
         
         <tr>    
          <td>Product Name : </td>   
          <td><form:input path="productname"  /></td>  
         </tr>    
         <tr>    
          <td>Price :</td>    
          <td><form:input path="price" /></td>  
         </tr>     
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form> 
</body>
</html>