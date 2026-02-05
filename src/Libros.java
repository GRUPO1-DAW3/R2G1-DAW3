public class Libros {
    /* Atributos de la clase libros */
    private String titulo;
    private Autores Autores;
    private int anioPublic;
    private String genero;
    private double precio;
    private int paginas;
    private int cod_libro;
/* Metodo constructor de la clase libros */
    public Libros(String titulo, Autores Autores, int anioPublic, String genero, double precio, int paginas) {
        this.titulo = titulo;
        this.Autores = Autores;
        this.anioPublic = anioPublic;
        this.genero = genero;
        this.precio = precio;
        this.paginas = paginas;
        this.cod_libro = (int) (Math.random() * 100000);
    }
/* Metodos getters de la clase libros */
    public String getTitulo() {
        return titulo;
    }
    public Autores getAutores() {
        return Autores;
    }
    public int getAnioPublic() {
        return anioPublic;
    }
    public String getGenero() {
        return genero;
    }
    public double getPrecio() {
        return precio;
    }
    public int getPaginas() {
        return paginas;
    }
    public int getCod_libro() {
        return cod_libro;
    }

/* Metodo setters de la clase libros */
    public void setPrecio(double precio) {
        if (precio >= 0)
            this.precio = precio;
    }
/*Equals y hash*/
    @Override
    public int hashCode() {
        return Integer.hashCode(cod_libro);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libros libro = (Libros) obj;
        return cod_libro == libro.cod_libro;
    }
/* Otros metodos de la clase libros */
    @Override
    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", Autores=" + Autores +
                ", anioPublic=" + anioPublic +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                ", paginas=" + paginas +
                ", cod_libro=" + cod_libro +
                '}';
    }
}
