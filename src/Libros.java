public class Libros {
//Atributos de la clase Libros; Aqui metemos todos los atributos que tendra nuestra clase
    private String titulo;
    private Autores Autores;
    private int anioPublic;
    private String genero;
    private double precio;
    private int paginas;
    private int cod_libro;
//Constructor de la clase libros; En este constructor haremos que el codigo del libro sea aleatorio
    public Libros(String titulo, Autores Autores, int anioPublic, String genero, double precio, int paginas) {
        this.titulo = titulo;
        this.Autores = Autores;
        this.anioPublic = anioPublic;
        this.genero = genero;
        this.precio = precio;
        this.paginas = paginas;
        this.cod_libro = (int) (Math.random() * 100000);
    }
//Getters de la clase libros; En este caso haremos un getter a todods los atributos de la clase
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

//Setter de la clase libros; Aqui explicaremos los setters que hemos decidio alterar
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutores(Autores Autores) {
        this.Autores = Autores;
    }
//En este caso, hemos decidido que si el año de publicacion es menor a 1000 o mayor a 2026 de un error
    public void setAnioPublic(int anioPublic) {
        if (anioPublic < 1000 || anioPublic > 2026) {
            System.out.println("Error: Año de publicación no válido.");
        } else {
            this.anioPublic = anioPublic;
        }
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
//En este caso, hemos decidido que el precio y las paginas deben ser mayores a 0
    public void setPrecio(double precio) {
        if (precio >= 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setPaginas(int paginas) {
        if (paginas > 0){
            this.paginas = paginas;
        }else{
            System.out.println("El número de páginas debe ser mayor que 0.");
        }
    }



//Otros metodos de la clase libros.
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

    //Este metodo se encargara de calcular laa media de paginas de un autor
    public int mediaPaginasAutor(Autores autor) {
        int suma = 0;
        int contador = 0;

        if (this.Autores.equals(autor)) {//Comparamos el autor del libro con el autor del parametro
            suma += this.paginas;
            contador++;
        }

        if (contador > 0) {
            return suma / contador;
        }
        return 0;
    }

    //Este metodo lo usaremos para buscar libros por su genero
    public void buscarLibroPorGenero(Libros[] libros, String genero) { //En los parametros pedimos el array de libros en el que queremos buscar y el genero que queremos buscar
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getGenero().equalsIgnoreCase(genero)) { //Comparamos el genero del libro que se encuentra en esa posicion del array con el genero del parametro ignorando mayusculas y minusculas
                System.out.println(libros[i]);
            }
        }
    }

}
