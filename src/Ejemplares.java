public class Ejemplares {
//Atributos de la clase Ejemplares
    private int ID_ejemplares;
    private Libros libro;
    private String estado;


//Metodo constructor de la clase Ejemplares
    public Ejemplares(int pID_ejemplares, Libros pLibro, String pEstado) {
        this.ID_ejemplares = pID_ejemplares;
        this.libro = pLibro;
        this.estado = pEstado;
    }

// Constructor vacío
    public Ejemplares() {
        this.ID_ejemplares = 0;
        this.libro = null;
        this.estado = "";
    }

//Getters de la clase Ejemplares
    public int getID_ejemplares(){
        return ID_ejemplares;
    }
    public Libros getLibro(){
        return libro;
    }
    public String getEstado(){
        return estado;
    }

//Setters de la clase Ejemplares
    public void setID_ejemplares(int pID_ejemplares){
        this.ID_ejemplares=pID_ejemplares;
    }
    public void setLibro(Libros pLibro){
        this.libro=pLibro;
    }
    public void setEstado(String pEstado){
        this.estado=pEstado;
    }

//Equal y toString de la clase Ejemplares
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ejemplares ejemplares = (Ejemplares) obj;
        return ID_ejemplares == ejemplares.ID_ejemplares;
    }

    @Override
    public String toString() {
        return ""+ ID_ejemplares+", "+libro+", "+estado;
    }

//Otros metodos de la clase Ejemplares

    //Metodo que utilizaremos para comprobar el autor de un ejemplar
    public String comprobarAutor(){
        if (libro == null) {
            return "No hay libro asociado a este ejemplar.";
        }else{
            return libro.getAutor().toString(); //Llamamos al getAutor de la clase libro para obtener el autor del libro asociado a este ejemplar
        }
    }

    //Metodo que utilizaremos para comprobar el precio de un ejemplar
    public int comprobarPrecio(){
        if (libro == null) {
            return 0; //Si no hay libro asociado a este ejemplar, el precio es 0
        }else{
            return (int) libro.getPrecio(); //Llamamos al getPrecio de la clase libro para obtener el precio del libro asociado a este ejemplar
        }
    }
}