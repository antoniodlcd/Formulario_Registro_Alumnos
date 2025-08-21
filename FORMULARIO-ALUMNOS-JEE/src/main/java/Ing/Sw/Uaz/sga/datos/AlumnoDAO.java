
package Ing.Sw.Uaz.sga.datos;

import Ing.Sw.Uaz.sga.domain.Alumno;
import java.util.List;


public interface AlumnoDAO {
    public List<Alumno> buscarAlumnos();
    public Alumno buscarAlumnoPorID(Alumno alumno);
    public Alumno buscarAlumnoPorCorreo(Alumno alumno);
    public void registrarAlumno(Alumno alumno);
    public void modificarAlumno(Alumno alumno);
    public void eliminarAlumno(Alumno alumno);
}
