public class Colaboracion {
//Atributos de la clase Colaboracion
    private int ID_colaboracion;
    private Libro libro;
    private Autor autor;

//Metodo constructor de la clase Colaboracion
    public Colaboracion(int pID_colaboracion, Libro pLibro, Autor pAutor){
        this.ID_colaboracion=pID_colaboracion;
        this.libro=pLibro;
        this.autor=pAutor;
    }

//Getters de la clase Colaboracion
    public int getID_colaboracion(){
        return ID_colaboracion;
    }
    public Libro getLibro(){
        return libro;
    }
    public Autor getAutor(){
        return autor;
    }

//Setters de la clase Colaboracion
    public void setID_colaboraciones(int pID_colaboraciones){
        this.ID_colaboracion=pID_colaboraciones;
    }
    public void setLibro(Libro pLibro){
        this.libro=pLibro;
    }
    public void setAutor(Autor pAutor){
        this.autor=pAutor;
    }
//Otros Equals y toString de la clase Colaboracion
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Colaboracion colaboraciones = (Colaboracion) obj;
        return ID_colaboracion == colaboraciones.ID_colaboracion;
    }

    @Override
    public String toString() {
        return ""+ID_colaboracion+", "+libro+", "+autor;
    }
    
//Otros metodos de la clase Colaboracion

    //Este metodo lo usamos para comprobar si un autor ha participado en un libro o no
    public String comprobarColaboracion(){
        if (libro.getAutor().equals(autor)){ //LLamamos al getAturos de la clase libro y lo comparamos con el autor que aparece en la colaboracion
            return "El autor "+autor.getNombre()+" ha colaborado en el libro "+libro.getTitulo();
        }else{
            return "El autor "+autor.getNombre()+" no ha colaborado en el libro "+libro.getTitulo();
        }
    }

    //Este metodo lo usamos para comprobar si un libro es del genero que queremos o no
    public String comprobarGeneroColaboracion(String genero){
        if (libro.getGenero().equals(genero)){ //LLamamos al getGenero de la clase libro y lo comparamos con el genero que nos pasan por parametro
            return "El libro "+libro.getTitulo()+" es del genero "+genero;
        }else{
            return "El libro "+libro.getTitulo()+" no es del genero "+genero;
        }
    }
}
