import java.util.Arrays;

public class TestLibroAutor {
    public static void main(String[] args) {
        Autor gabriel=new Autor("Gabriel García Marquez", "Gabriel@gabriel.garcia.com");
        Autor marcela=new Autor("Marcela Paz", "marcela@marcela.paz.cl");
        Libro gabriel1=new Libro("Cien años de soledad", 1967);
        Libro gabriel2=new Libro("Crónica de una muerte anunciada", 1981);
        Libro gabriel3=new Libro("El amor en los tiempos del cólera", 1985);
        Libro marcela1=new Libro("Papelucho", 1947);
        Libro marcela2=new Libro("Papelucho detective", 1967);
        Libro marcela3=new Libro("Papelucho Historiador", 1955);

        //la asociación de autores con libros no ocurre automáticamente
        //lo siguiente da listas vacías, porque no se ha asociado aún los libros a los autores
        System.out.println("Listado de libros de: "+gabriel.getNombre());
        System.out.println(Arrays.toString(gabriel.obtieneTitulosLibros()));

        System.out.println("Listado de libros de: "+marcela.getNombre());
        System.out.println(Arrays.toString(marcela.obtieneTitulosLibros()));

        System.out.println("autores del libro: "+gabriel1.getTitulo()+" son:"+
                Arrays.toString(gabriel1.obtieneNombreAutores()));
        System.out.println("");
        System.out.println("Asociando autores con sus libros");
        System.out.println("");

        gabriel.agregarLibro(gabriel1);
        gabriel.agregarLibro(gabriel2);
        gabriel.agregarLibro(gabriel3);

        marcela.agregarLibro(marcela1);
        marcela.agregarLibro(marcela2);
        marcela.agregarLibro(marcela3);

        //la asociación de autores con libros no ocurre automáticamente
        //lo siguiente da listas vacías, porque no se ha asociado aún los libros a los autores
        System.out.println("Listado de libros de: "+gabriel.getNombre());
        System.out.println(Arrays.toString(gabriel.obtieneTitulosLibros()));

        System.out.println("Listado de libros de: "+marcela.getNombre());
        System.out.println(Arrays.toString(marcela.obtieneTitulosLibros()));

        System.out.println("autores del libro: "+gabriel1.getTitulo()+" son:"+
                Arrays.toString(gabriel1.obtieneNombreAutores()));

        System.out.println("autores del libro: "+marcela1.getTitulo()+" son:"+
                Arrays.toString(marcela1.obtieneNombreAutores()));

    }

}
