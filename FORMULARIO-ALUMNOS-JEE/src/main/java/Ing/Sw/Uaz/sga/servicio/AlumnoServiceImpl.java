package Ing.Sw.Uaz.sga.servicio;

import Ing.Sw.Uaz.sga.datos.AlumnoDAO;
import Ing.Sw.Uaz.sga.domain.Alumno;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AlumnoServiceImpl implements AlumnoService{
    
    @Inject
    private AlumnoDAO alumnoDao;

    @Override
    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        return alumnoDao.buscarAlumnos();
    }

    @Override
    public Alumno buscarAlumnoPorId(Alumno alumno) {
        return alumnoDao.buscarAlumnoPorID(alumno);
    }

    @Override
    public Alumno buscarAlumnoPorCorreo(Alumno alumno) {
        return alumnoDao.buscarAlumnoPorCorreo(alumno);
    }

    @Override
    public void registrarAlumno(Alumno alumno) {
        alumnoDao.registrarAlumno(alumno);
    }

    @Override
    public void modificarAlumno(Alumno alumno) {
        alumnoDao.modificarAlumno(alumno);
    }

    @Override
    public void eliminarAlumno(Alumno alumno) {
        alumnoDao.eliminarAlumno(alumno);
    }
    
}
