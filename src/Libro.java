import java.util.ArrayList;
import java.util.stream.Collectors;

public class Libro {
    //atributos
    private String titulo;
    private int anioPublicacion;
    //para implementar la asociación
    //agrego variables de instancia
    private ArrayList<Autor> autores;

    public Libro(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        autores=new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean agregarAutor(Autor autor){
        //NOOOOO!!! autor.agregarLibro(this);
        //generaría una llamada circular (infinita)
        //uno de los dos debe hacerse cargo de mantener la consistencia de la asociación
        //no ambos
        return autores.add(autor);
    }

    public boolean eliminaAutor(Autor autor){
        return autores.remove(autor);
    }

    public String[] obtieneNombreAutores(){
        return autores.parallelStream().map(autor -> autor.getNombre()).collect(Collectors.toList()).toArray(new String[0]);
    }
}
