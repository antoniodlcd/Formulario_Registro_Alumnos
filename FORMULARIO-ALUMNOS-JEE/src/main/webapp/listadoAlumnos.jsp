<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTADO DE ALUMNOS</title>
        <link rel="stylesheet" type="text/css" href="recursos/estilos-listado.css">
    </head>
    <body>
        <img src="recursos/logo-uaz.png" alt="Logo institucional" 
             style="position: fixed; bottom: 10px; right: 10px; width: 100px; height: auto; z-index: 1000; opacity: 0.5;">
        <div class="contenedor-tabla">
            <h2>Listado de Alumnos</h2>
            <table border="1" id="tabla-alumno">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Sexo</th>
                        <th>Telefono</th>
                        <th>Correo</th>
                        <th>Residencia</th>
                        <th>Estado</th>
                        <th>Carrera</th>
                        <th>Justificacion</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${alumnos}" var="alumno">
                        <tr>
                            <td>${alumno.idAlumno}</td>
                            <td>${alumno.nombre}</td>
                            <td>${alumno.apellidos}</td>
                            <td>${alumno.sexo}</td>
                            <td>${alumno.telefono}</td>
                            <td>${alumno.correo}</td>
                            <td>${alumno.residencia}</td>
                            <td>${alumno.estado}</td>
                            <td>${alumno.carrera}</td>
                            <td>${alumno.justificacion}</td>
                            <td>
<!--                                <a href="EditarAlumno?id=${alumno.idAlumno}" class="boton-editar">Editar</a>
                                <a href="EliminarAlumno?id=${alumno.idAlumno}" class="boton-eliminar" onclick="return confirm('¿Estas seguro de eliminar este alumno?');">Eliminar</a>-->
                            
                                <form method="post" action="alumnos" style="display:inline;">
                                    <input type="hidden" name="accion" value="editarVista">
                                    <input type="hidden" name="idAlumno" value="${alumno.idAlumno}">
                                    <button type="submit" class="boton-editar">Editar</button>
                                </form>
                                <form method="post" action="alumnos" style="display:inline;"
                                      onsubmit="return confirm('¿Estas seguro de eliminar este alumno?\nEsta accion no se puede deshacer... ');">
                                    <input type="hidden" name="accion" value="eliminar">
                                    <input type="hidden" name="idAlumno" value="${alumno.idAlumno}">
                                    <button type="submit" class="boton-eliminar">Eliminar</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <button class="boton-regresar" onclick="window.location.href = 'index.html'">Regresar al formulario</button>
        </div>
    </body>
</html>
