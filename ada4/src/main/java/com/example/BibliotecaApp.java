package com.example;
package java.util.Scanner; 

public class BibliotecaApp 
{
    public static void main( String[] args )
    {
        Usuario usuario = new Usuario('Agustin', 'agustincorreo@gmail.com', 5);
        Libro libro = new Libro('Construccion', 'Daniel', '1235-abc', 2026);
        Prestamo prestamo = new Prestamo('12-05-20', '12-07-20', 500, 5);

        usuario.mostrarUsuario();
        libro.mostrarLibro();
        prestamo.calcularMulta()
        prestamo.aplicarMulta();
        prestamo.mostrarPrestamo();

    }
}
