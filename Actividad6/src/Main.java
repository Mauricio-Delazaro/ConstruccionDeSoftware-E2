import java.util.Scanner;

import com.Alumno;
import com.Grupo;
import com.Profesor;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Registro de datos del prfesor");
        System.out.print("Nombre: ");
        String nombreProf = sc.nextLine();
        System.out.print("Apellido paterno: ");
        String apellidoPaternoProf = sc.nextLine();
        System.out.print("Apellido materno: ");
        String apellidoMaternoProf = sc.nextLine();
        System.out.print("Grado academico: ");
        String gradoAcademico = sc.nextLine();
        System.out.print("Numero de empleado: ");
        String numEmpleado = sc.nextLine();

        Profesor profesor = new Profesor(nombreProf, apellidoPaternoProf, apellidoMaternoProf, gradoAcademico, numEmpleado);
        Grupo grupo = new Grupo(profesor);

        int opcion;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar informacion del profesor");
            System.out.println("3. Mostrar informacion de los alumnos");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombreAlumno = sc.nextLine();
                    System.out.print("Apellido paterno: ");
                    String apellidoPaternoAlumno = sc.nextLine();
                    System.out.print("Apellido materno: ");
                    String apellidoMaternoAlumno = sc.nextLine();
                    System.out.print("Numero de cuenta: ");
                    String numCuenta = sc.nextLine();

                    Alumno alumno = new Alumno(nombreAlumno, apellidoPaternoAlumno, apellidoMaternoAlumno, numCuenta);
                    grupo.agregarAlumnos(alumno);
                    System.out.println("Alumno agregado correctamente.");
                    break;
                case 2:
                    grupo.mostrarInformacionProfesor();
                    break;
                case 3:
                    grupo.mostrarInformacionAlumnos();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}