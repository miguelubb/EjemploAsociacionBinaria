import java.util.ArrayList;

public class Autor {
    private String nombre;
    private String email;

    private ArrayList<Libro> libros;

    public Autor(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        libros=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Por una decisión de implementación,
    //el autor se encarga de mantener la consistencia de la asociación.
    //podría haber sido la clase Libro, o bien la clase que use libro y autores
    //lo que nunca puede pasar es que tanto libro y autores mantengan la relación porque fallaría.
    public boolean agregarLibro(Libro libro){
        libro.agregarAutor(this);
        return libros.add(libro);
    }

    public boolean eliminarLibro(Libro libro){
        libro.eliminaAutor(this);
        return libros.remove(libro);
    }

    public String[] obtieneTitulosLibros(){
        String[] out=new String[libros.size()];
        int i=0;
        for (Libro libro : libros) {
            out[i++]=libro.getTitulo();
        }
        return out;
    }
}
