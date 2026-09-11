public class Biblioteca {
    private String tituloLibro;
    private String autorLibro;
    private String isbnLibro;
    private int anioPublicacion;
    private String nombreUsuario;
    private String correoUsuario;
    private int idUsuario;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private double multaPorDia;
    private int diasRetraso;

    public double calcularMulta() {
        return multaPorDia * diasRetraso;
    }
    public void mostrarLibro() {
        System.out.println("Título: " + tituloLibro);
        System.out.println("Autor: " + autorLibro);
        System.out.println("ISBN: " + isbnLibro);
        System.out.println("Año: " + anioPublicacion);
    }
    public void mostrarUsuario() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Correo: " + correoUsuario);
        System.out.println("ID: " + idUsuario);
    }
    public void mostrarPrestamo() {
        System.out.println("Préstamo: " + fechaPrestamo);
        System.out.println("Devolución: " + fechaDevolucion);
    }
    public void aplicarMulta() {
        double total = calcularMulta();
        System.out.println("Multa total: $" + total);
    }
}
