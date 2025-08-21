<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Editar Alumno</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
        <script src="recursos/listas.js" defer></script>

    </head>
    <body>
        <img src="recursos/logo-uaz.png" alt="Logo institucional" 
             style="position: fixed; top: 10px; width: 100px; height: auto; z-index: 1000; opacity: 0.5;">
        <!--<img src="recursos/logo-uaz.png" alt="Logo institucional" class="logo">-->
        
        <form action="alumnos" method="post" 
              style="position: fixed; bottom: 10px; right: 20px;">
            <input type="hidden" name="accion" value="listar">
            <button type="submit"
                    style="background: none; border: none; color: white; 
                    text-decoration: underline; cursor: pointer; font-size: 1em;">
                regresar al listado de alumnos
            </button>
            
        </form>
        
        
        <form action="alumnos" method="post">
            <input type="hidden" name="accion" value="editar">
            <input type="hidden" name="idAlumno" value="${alumno.idAlumno}">

            <div class="form-container">
                <h2>Editar Alumno</h2>

                <label for="nombre">Nombre: <span class="obligatorio">*</span></label>
                <input type="text" id="nombre" name="nombre" value="${alumno.nombre}" required>

                <label for="apellidos">Apellidos <span class="obligatorio">*</span></label>
                <input type="text" id="apellidos" name="apellidos" value="${alumno.apellidos}" required>

                <label for="sexo">Sexo <span class="obligatorio">*</span></label>
                <select id="sexo" name="sexo" required>
                    <option value="">Seleccione</option>
                    <option value="H" ${alumno.sexo == 'H' ? 'selected' : ''}>Hombre</option>
                    <option value="M" ${alumno.sexo == 'M' ? 'selected' : ''}>Mujer</option>
                </select>

                <label for="telefono">Telefono <span class="obligatorio">*</span></label>
                <input type="text" id="telefono" name="telefono" value="${alumno.telefono}" required>

                <label for="correo">Correo <span class="obligatorio">*</span></label>
                <input type="text" id="correo" name="correo" value="${alumno.correo}" required>

                <label for="residencia">Lugar de Recidencia <span class="obligatorio">*</span></label>
                <input type="text" id="residencia" name="residencia" value="${alumno.residencia}" required>

                <label for="estado">Estado:<span class="obligatorio">*</span></label>
                <select id="estado" name="estado" data-seleccionado="${alumno.estado}" required>
                    <option value="">Seleccione un estado</option>
                </select>

                <label for="carrera">Carrera de Interes<span class="obligatorio">*</span></label>
                <select id="carrera" name="carrera" data-seleccionado="${alumno.carrera}" required>
                    <option value="">Seleccione una carrera</option>
                </select>

                <label for="justificacion">Justificacion <span class="obligatorio">*</span></label>
                <input type="text" id="justificacion" name="justificacion" value="${alumno.justificacion}" required>

                <button type="submit">Editar</button>

            </div>


        </form>
    </body>
</html>
