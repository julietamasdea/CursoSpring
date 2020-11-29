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
                      <td><form:input path="nombre" /> <form:errors path="nombre"/></td>
                  </tr>
                  <tr>
                      <td>Apellido:</td>
                      <td><form:input path="apellido" /> <form:errors path="apellido"/></td>
                  </tr>
                  <tr>
                    <td>Edad:</td>
                    <td><form:input path="edad" /> <form:errors path="edad"/></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><form:input path="email" /> <form:errors path="email"/> </td>
                </tr>
                  <tr>
                      <td>Asignatura Optativa:</td>
                      <td>
                        <form:select path="asignaturaOptativa" multiple="true">
                            <form:option value="matematica" label="matematica" />
                            <form:option value="historia" label="historia" />
                            <form:option value="naturales" label="naturales" />
                            <form:option value="economia" label="economia" />
                        </form:select>
                      </td>

                  </tr>
                  <tr>
                    <td>Genero</td>
                    <td>Hombre: <form:radiobutton path="genero" value="H"/> <br/>
                        Mujer: <form:radiobutton path="genero" value="M"/> </td>
                    </tr>
                  <tr>

                <tr>
                    <td>Deporte:</td>
                    <td>
                        <%-- Approach 2: Property is of an array or of type java.util.Collection --%>
                        Voley: <form:checkbox path="deporte" value="Voley"/>
                        Basquet: <form:checkbox path="deporte" value="Basquet"/>
                        HandBall: <form:checkbox path="deporte" value="HandBall"/>

                    </td>
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
