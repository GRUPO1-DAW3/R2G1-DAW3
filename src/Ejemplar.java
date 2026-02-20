public class Ejemplar {
//Atributos de la clase Ejemplar
    private int ID_ejemplar;
    private Libro libro;
    private String estado;


//Metodo constructor de la clase Ejemplar
    public Ejemplar(int pID_ejemplar, Libro pLibro, String pEstado) {
        this.ID_ejemplar = pID_ejemplar;
        this.libro = pLibro;
        this.estado = pEstado;
    }

// Constructor vacío
    public Ejemplar() {
        this.ID_ejemplar = 0;
        this.libro = null;
        this.estado = "";
    }

//Getters de la clase Ejemplar
    public int getID_ejemplar(){
        return ID_ejemplar;
    }
    public Libro getLibro(){
        return libro;
    }
    public String getEstado(){
        return estado;
    }

//Setters de la clase Ejemplar
    public void setID_ejemplar(int pID_ejemplar){
        this.ID_ejemplar=pID_ejemplar;
    }
    public void setLibro(Libro pLibro){
        this.libro=pLibro;
    }
    public void setEstado(String pEstado){
        this.estado=pEstado;
    }

//Equal y toString de la clase Ejemplar
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ejemplar ejemplar = (Ejemplar) obj;
        return ID_ejemplar == ejemplar.ID_ejemplar;
    }

    @Override
    public String toString() {
        return ""+ ID_ejemplar+", "+libro+", "+estado;
    }

//Otros metodos de la clase Ejemplar

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