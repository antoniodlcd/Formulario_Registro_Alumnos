package Ing.Sw.Uaz.sga.servicio;

import Ing.Sw.Uaz.sga.domain.Alumno;
import java.util.List;
import javax.ejb.Local;

@Local
public interface AlumnoService {
    public List<Alumno> listarAlumnos();
    public Alumno buscarAlumnoPorId(Alumno alumno);
    public Alumno buscarAlumnoPorCorreo(Alumno alumno);
    public void registrarAlumno(Alumno alumno);
    public void modificarAlumno(Alumno alumno);
    public void eliminarAlumno(Alumno alumno);
    
}
