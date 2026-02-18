public class Colaboraciones {
//Atributos de la clase Colaboraciones
    private int ID_colaboraciones;
    private Libros libro;
    private Autores autor;

//Metodo constructor de la clase Colaboraciones
    public Colaboraciones(int pID_colaboraciones, Libros pLibro, Autores pAutor){
        this.ID_colaboraciones=pID_colaboraciones;
        this.libro=pLibro;
        this.autor=pAutor;
    }

//Getters de la clase Colaboraciones
    public int getID_colaboracione(){
        return ID_colaboraciones;
    }
    public Libros getlibro(){
        return libro;
    }
    public Autores getAutor(){
        return autor;
    }

//Setters de la clase Colaboraciones
    public void setID_colaboraciones(int pID_colaboraciones){
        this.ID_colaboraciones=pID_colaboraciones;
    }
    public void setLibro(Libros pLibro){
        this.libro=pLibro;
    }
    public void setAutor(Autores pAutor){
        this.autor=pAutor;
    }
//Otros Equals y toString de la clase Colaboraciones
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Colaboraciones colaboraciones = (Colaboraciones) obj;
        return ID_colaboraciones == colaboraciones.ID_colaboraciones;
    }

    @Override
    public String toString() {
        return "Colaboraciones{" +
                "ID_colaboraciones=" + ID_colaboraciones +
                ", libro=" + libro +
                ", autor=" + autor +
                '}';
    }
//Otros metodos de la clase Colaboraciones
    
}
