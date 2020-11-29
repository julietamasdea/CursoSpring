<%-- 
    Document   : pruebaEjemplo
    Created on : Nov 28, 2020, 5:31:56 PM
    Author     : julieta.masdea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/static/styles/estilos.css">
    </head>
    <body>
        Hola ${param.nombreAlumno}, bienvenido al curso de spring!
        <br>
        ${mensajeFinal}
<p>El contextPath es: ${pageContext.request.contextPath}</p>
        <img alt ="foto" src="${pageContext.request.contextPath}/resources/static/images/springimage.png">
    </body>
</html>
