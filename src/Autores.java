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
    public void setNumLibros(int numLibros) {
        if (numLibros >= 0)
            this.numLibros = numLibros;
    }
    public void setEdad(int edad) {
        if (edad > 0)
            this.edad = edad;
    }
/*hash y equals */
    @Override
    public int hashCode() {
        return Integer.hashCode(cod_autor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Autores autores = (Autores) obj;
        return cod_autor == autores.cod_autor;
    }
//Otros metodos de la clase autores
    @Override
    public String toString() {
        return "Autores{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad=" + edad +
                ", numLibros=" + numLibros +
                ", cod_autor=" + cod_autor +
                '}';
    }

}

