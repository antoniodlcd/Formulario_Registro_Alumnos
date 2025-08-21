package Ing.Sw.Uaz.sga.datos;

import Ing.Sw.Uaz.sga.domain.Alumno;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;


@Stateless
public class AlumnoDAOImpl implements AlumnoDAO{
    @PersistenceContext(unitName = "AlumnoPU")
    EntityManager em;

    @Override
    public List<Alumno> buscarAlumnos() {
        return em.createNamedQuery("Alumno.buscarAlumnos").getResultList();
    }

    @Override
    public Alumno buscarAlumnoPorID(Alumno alumno) {
        return em.find(Alumno.class, alumno.getIdAlumno());
    }

    @Override
    public Alumno buscarAlumnoPorCorreo(Alumno alumno) {
        Query query = em.createQuery("SELECT a FROM Alumno a WHERE a.correo = :correo");
        query.setParameter("correo", alumno.getCorreo());
        return (Alumno) query.getSingleResult();
    }

    @Override
    public void registrarAlumno(Alumno alumno) {
        em.persist(alumno);
    }

    @Override
    public void modificarAlumno(Alumno alumno) {
        em.merge(alumno);
    }

    @Override
    public void eliminarAlumno(Alumno alumno) {
        em.remove(em.merge(alumno));
    }
    
    
}
