public class Colaboraciones {
//Atributos de la clase Colaboraciones
    private int ID_colaboraciones;
    private Libros libro;
    private Autores autor;

//Metodo constructor
    public Colaboraciones(int pID_colaboraciones, Libros pLibro, Autores pAutor){
        this.ID_colaboraciones=pID_colaboraciones;
        this.libro=pLibro;
        this.autor=pAutor;
    }
}
