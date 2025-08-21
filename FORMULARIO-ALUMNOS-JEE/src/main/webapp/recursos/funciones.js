document.addEventListener("DOMContentLoaded", () => {
    const forma = document.forms["form1"];
    
    forma.addEventListener("submit", function (event) {
        let errores = [];

        var nombre = forma.nombre.value.trim();
        if (nombre === "" || nombre.length > 45) {
            errores.push("Debes proporcionar un nombre de menos de 45 caracteres.");
            forma.nombre.focus();
            forma.nombre.select();
        }

        var apellidos = forma.apellidos.value.trim();
        if (apellidos === "" || apellidos.length > 45) {
            errores.push("Debes proporcionar los apellidos de menos de 43 caracteres.");
            forma.apellidos.focus();
            forma.apellidos.select();
        }


        if (forma.sexo.value === "") {
            errores.push("Debes seleccionar el sexo.");
            forma.sexo.focus();
        }

        var telefono = forma.telefono.value.trim();
        if (telefono === "" || telefono.length > 45) {
            errores.push("Debes proporcionar un telefono valido.");
            forma.telefono.focus();
            forma.telefono.select();
        }

        var correo = forma.correo.value.trim();
        if (correo === "" || correo.length > 45) {
            errores.push("Debes proporcionar un correo de menos de 45 caracteres.");
            forma.correo.focus();
            forma.correo.select();
        }

        var residencia = forma.residencia.value.trim();
        if (residencia === "" || residencia.length > 45) {
            errores.push("Debes proporcionar una residencia de menos de 45 caracteres.");
            forma.residencia.focus();
            forma.residencia.select();
        }

        
        if (forma.estado.value === "") {
            errores.push("Debes seleccionar un estado.");
            forma.estado.focus();
        }


        if (forma.carrera.value === "") {
            errores.push("Debes seleccionar una carrera.");
            forma.carrera.focus();
        }

        var justificacion = forma.justificacion.value.trim();
        if (justificacion === "" || justificacion.length > 500) {
            errores.push("Debes justificar por qué quieres estudiar esa carrera en no mas de 500 caracteres.");
            forma.justificacion.focus();
            forma.justificacion.select();
        }

        if (errores.length > 0) {
            alert("Errores: \n" + errores.join("\n"));
            event.preventDefault()
            return false;
        }

        alert("Los datos han sido guardados correctamente");
        return true;

    });
    console.log("funciones.js cargado correctamente.")
});