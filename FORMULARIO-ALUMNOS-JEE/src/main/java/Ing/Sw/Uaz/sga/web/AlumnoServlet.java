
package Ing.Sw.Uaz.sga.web;

import Ing.Sw.Uaz.sga.domain.Alumno;
import Ing.Sw.Uaz.sga.servicio.AlumnoService;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/alumnos")
public class AlumnoServlet extends HttpServlet {
    @Inject
    AlumnoService alumnoService;

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Alumno> alumnos = alumnoService.listarAlumnos();
//        System.out.println("alumnos: " + alumnos);
//        request.setAttribute("alumnos", alumnos);
//        request.getRequestDispatcher("/listadoAlumnos.jsp").forward(request, response);
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        if ("listar".equals(accion)) {
            
            System.out.println("Accion recibida: " + request.getParameter("accion"));
            List<Alumno> alumnos = alumnoService.listarAlumnos();
            request.setAttribute("alumnos", alumnos);
            request.getRequestDispatcher("/listadoAlumnos.jsp").forward(request, response);
        } else if ("guardar".equals(accion)) {
            System.out.println("Accion recibida: " + request.getParameter("accion"));
            Alumno alumno = new Alumno();
            alumno.setNombre(request.getParameter("nombre"));
            alumno.setApellidos(request.getParameter("apellidos"));
            alumno.setSexo(request.getParameter("sexo"));
            alumno.setTelefono(request.getParameter("telefono"));
            alumno.setCorreo(request.getParameter("correo"));
            alumno.setResidencia(request.getParameter("residencia"));
            alumno.setEstado(request.getParameter("estado"));
            alumno.setCarrera(request.getParameter("carrera"));
            alumno.setJustificacion(request.getParameter("justificacion"));
            
            alumnoService.registrarAlumno(alumno);
            System.out.println("Alumno registrado exitosamente!");
            response.sendRedirect(request.getContextPath() + "/index.html");
        } else if ("eliminar".equals(accion)) {
            System.out.println("Accion recibida: " + request.getParameter("accion"));
            Integer idAlumno = Integer.valueOf(request.getParameter("idAlumno"));
            alumnoService.eliminarAlumno(new Alumno(idAlumno));
//            request.getRequestDispatcher("/listadoAlumnos.jsp").forward(request, response);
            response.sendRedirect("alumnos?accion=listar");
        } else if ("editarVista".equals(accion)) {
            System.out.println("Accion recibida: " + request.getParameter("accion"));
            Integer idAlumno = Integer.valueOf(request.getParameter("idAlumno"));
            Alumno alumno = alumnoService.buscarAlumnoPorId(new Alumno(idAlumno));
            request.setAttribute("alumno", alumno);
            request.getRequestDispatcher("/editarAlumno.jsp").forward(request, response);
            
        } else if ("editar".equals(accion)) {
            System.out.println("Accion recibida: " + request.getParameter("accion"));
            Integer idAlumno = Integer.valueOf(request.getParameter("idAlumno"));
            Alumno alumno = new Alumno();
            alumno.setIdAlumno(idAlumno);
            alumno.setNombre(request.getParameter("nombre"));
            alumno.setApellidos(request.getParameter("apellidos"));
            alumno.setSexo(request.getParameter("sexo"));
            alumno.setTelefono(request.getParameter("telefono"));
            alumno.setCorreo(request.getParameter("correo"));
            alumno.setResidencia(request.getParameter("residencia"));
            alumno.setEstado(request.getParameter("estado"));
            alumno.setCarrera(request.getParameter("carrera"));
            alumno.setJustificacion(request.getParameter("justificacion"));
            
            alumnoService.modificarAlumno(alumno);
            response.sendRedirect("alumnos?accion=listar");
        }
    }
    
    
    
}
