package libreria;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1000123", "El Tunel", "Anselmo Larrañaga", 325);
        Libro libro2 = new Libro("1000125", "Los Otros", "Federico x", 500);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas que el libro " + libro2.getTitulo());
        } else {
            System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas que el libro " + libro1.getTitulo());
        }
    }
}