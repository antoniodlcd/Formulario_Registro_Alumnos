package Ing.Sw.Uaz.sga.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
    @NamedQuery(name = "Alumno.buscarAlumnos", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.buscarAlumnoPorID", query = "SELECT a FROM Alumno a WHERE a.idAlumno = :idAlumno"),
    @NamedQuery(name = "Alumno.buscarAlumnoPorNombre", query = "SELECT a FROM Alumno a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumno.buscarAlumnoPorApellidos", query = "SELECT a FROM Alumno a WHERE a.apellidos = :apellidos"),
    @NamedQuery(name = "Alumno.buscarAlumnoPorTelefono", query = "SELECT a FROM Alumno a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Alumno.buscarAlumnoPorCorreo", query = "SELECT a FROM Alumno a WHERE a.correo = :correo")
})
public class Alumno implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    
    @Column(nullable = false, length = 45)
    private String nombre;
    
    @Column(nullable = false, length = 45)
    private String apellidos;
    
    @Column(nullable = false, length = 1)
    private String sexo;
    
    @Column(nullable = false, length = 15, unique = true)
    private String telefono;
    
    @Column(nullable = false, length = 45, unique = true)
    private String correo;
    
    @Column(nullable = false, length = 45)
    private String residencia;
    
    @Column(nullable = false, length = 45)
    private String estado;
    
    @Column(nullable = false, length = 45)
    private String carrera;
    
    @Lob
    @Column(nullable = false)
    private String justificacion;
    
    
    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String sexo, String telefono, String correo, String residencia, String estado, String carrera, String justificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
        this.residencia = residencia;
        this.estado = estado;
        this.carrera = carrera;
        this.justificacion = justificacion;
    }

    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumno != null ? idAlumno.hashCode() : 0);
        return hash;
    
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) obj;
        if ((this.idAlumno == null && other.idAlumno != null) || (this.idAlumno != null && !this.idAlumno.equals(other.idAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", telefono=" + telefono + ", correo=" + correo + ", residencia=" + residencia + ", estado=" + estado + ", carrera=" + carrera + ", justificacion=" + justificacion + '}';
    }
    
}
