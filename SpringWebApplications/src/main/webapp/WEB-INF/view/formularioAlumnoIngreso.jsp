<%-- 
    Document   : pruebaEjemplo
    Created on : Nov 28, 2020, 5:31:56 PM
    Author     : julieta.masdea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="procesarFormularioAlumnosIngreso" modelAttribute="alumno" method="get">
              <table>
                  <tr>
                      <td>Nombre:</td>
                      <td><form:input path="nombre" /></td>
                  </tr>
                  <tr>
                      <td>Apellido:</td>
                      <td><form:input path="apellido" /></td>
                  </tr>
                  <tr>
                      <td colspan="2">
                          <input type="submit" value="Enviar" />
                      </td>
                  </tr>
              </table>
        </form:form>
    </body>
</html>
