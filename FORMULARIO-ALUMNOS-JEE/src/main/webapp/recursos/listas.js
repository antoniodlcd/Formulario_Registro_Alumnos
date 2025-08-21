const estados = [
    "Aguascalientes", "Baja California", "Baja California Sur", "Campeche",
    "Chiapas", "Chihuahua", "Ciudad de Mexico", "Coahuila", "Colima",
    "Durango", "Estado de Mexico", "Guanajuato", "Guerrero", "Hidalgo",
    "Jalisco", "Michoacan", "Morelos", "Nayarit", "Nuevo Leon", "Oaxaca",
    "Puebla", "Queretaro", "Quintana Roo", "San Luis Potosi", "Sinaloa",
    "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatan",
    "Zacatecas"
];

const carreras = [
    "Ingenieria de Software", "Arquitectura",
    "Medicina", "Derecho", "Psicologia"
];

document.addEventListener("DOMContentLoaded", () => {
    const selectEstado = document.getElementById('estado');
    const selectCarrera = document.getElementById('carrera');

    const estadoSeleccionado = selectEstado.getAttribute('data-seleccionado');
    const carreraSeleccionada = selectCarrera.getAttribute('data-seleccionado');

    estados.forEach(estado => {
        const option = document.createElement('option');
        option.value = estado;
        option.textContent = estado;
        if (estado === estadoSeleccionado) {
            option.selected = true;
        }
        selectEstado.appendChild(option);
    });
    
    carreras.forEach(carrera => {
        const option = document.createElement('option');
        option.value = carrera;
        option.textContent = carrera;
        if (carrera === carreraSeleccionada) {
            option.selected = true;
        }
        selectCarrera.appendChild(option);
    });
    
});