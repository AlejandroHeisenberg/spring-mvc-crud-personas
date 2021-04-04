
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>   
       
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
      
        <title>CRUD-agregar</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Agregar nuevo registro</h4>
                </div>
                <div class="card-body ">
                    <form:form commandName="formAddPersona" method="POST">

                        <form:label path="DNI" >DNI</form:label>
                        <form:input path="DNI"  cssClass="form-control"></form:input><br><br>
                        <form:errors path="DNI" element="div" cssClass="alert alert-danger" />
                        <form:label path="nombres" >Nombres</form:label>
                        <form:input path="nombres" cssClass="form-control"></form:input><br><br>
                        <form:errors path="nombres" element="div" cssClass="alert alert-danger" />
                        <form:button name="enviar" Class="btn btn-primary">Agregar</form:button>
                            <a href="index.htm" Class="btn btn-warning">Regesar</a>
                    </form:form>

                </div>
            </div>
        </div>

    </body>
</html>
