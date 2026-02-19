public class Autores {
/* Atributos de la clase autores */
    private String nombre;
    private String nacionalidad;
    private int edad;
    private int numLibros;
    private int cod_autor;
/* Metodo constructor de la clase autores */
    public Autores(String nombre, String nacionalidad, int edad, int numLibros, int cod_autor){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.numLibros = numLibros;
        this.cod_autor = cod_autor;
    }
/* Metodos getters de la clase autores */
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public int getEdad() {
        return edad;
    }
    public int getNumLibros() {
        return numLibros;
    }
    public int getCod_autor() {
        return cod_autor;
    }
/* Metodos setters de la clase autores */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setNumLibros(int numLibros) {
        if (numLibros >= 0){
            this.numLibros = numLibros;
        }else{
            System.out.println("El autor debe tener al menos un libro.");
        }
    }
    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        }else{
            System.out.println("La edad debe ser mayor a 0");
        }
    }
    public void setCod_autor(int cod_autor) {
        this.cod_autor = cod_autor;
    }

//Equals y toString de la clase autores
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Autores autores = (Autores) obj;
        return cod_autor == autores.cod_autor;
    }

    @Override
    public String toString() {
        return ""+ nombre + ", " + nacionalidad + ", " + edad + " años, " + numLibros + " libros disponibles.";
    }

}

