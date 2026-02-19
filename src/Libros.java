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
    /*public Autores getAutores1(String nombreAutor) {
        if (this.Autores.getNombre().equalsIgnoreCase(nombreAutor)) {
            return this.Autores;
        }
        return null; // Retorna null si no se encuentra el autor 
    }*/
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
    public Autores getAutores(Autores nombreAutor) {
        if (this.Autores.getNombre().equalsIgnoreCase(nombreAutor.getNombre())) {
            return this.Autores;
        }
        return null; // Devuelve null si no se encuentra el autor
    }

/* Metodos setters de la clase libros */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutores(Autores Autores) {
        this.Autores = Autores;
    }
    public void setAnioPublic(int anioPublic) {
        this.anioPublic = anioPublic;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(double precio) {
        if (precio >= 0)
            this.precio = precio;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0)
            this.paginas = paginas;
    }
    public void setCod_libro(int cod_libro) {
        this.cod_libro = cod_libro;
    }



//Equals y toString de la clase libros
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libros libro = (Libros) obj;
        return cod_libro == libro.cod_libro;
    }
    @Override
    public String toString() {
        return ""+ titulo + ", " + Autores + ", " + anioPublic + ", " + genero + ", " + precio + "euros, " + paginas + " páginas, código: " + cod_libro;
    }
}
