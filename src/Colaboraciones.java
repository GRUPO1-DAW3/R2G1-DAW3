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
        return ""+ID_colaboraciones+", "+libro+", "+autor;
    }
    
//Otros metodos de la clase Colaboraciones

    //Este metodo lo usamos para comprobar si un autor ha participado en un libro o no
    public String comprobarColaboracion(){
        if (libro.getAutores().equals(autor)){ //LLamamos al getAturos de la clase libro y lo comparamos con el autor que aparece en la colaboracion
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
