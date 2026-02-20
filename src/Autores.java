public class Autores {
//Atributos de la clase autores
    private String nombre;
    private String nacionalidad;
    private int edad;
    private int numLibros;
    private int cod_autor;
//Metodo constructor de la clase autores
    public Autores(String nombre, String nacionalidad, int edad, int numLibros, int cod_autor){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.numLibros = numLibros;
        this.cod_autor = cod_autor;
    }
//Getters de la clase autores
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
//Setters de la clase autores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    //En este caso, hemos decidido que el numero de libros y la edad deben ser mayor o igual a 0
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

    
    //Otros metodos de la clase autores

    //Metodo con el que haremos la cuenta de los libors que escribe un autor por año
    public void calcularLibrosPorAnio() {
        if (edad > 0) {
            int aniosEscritos = edad - 20; // Suponemos que el autor comenzó a escribir a los 20 años
            if (aniosEscritos > 0) {
                double librosPorAnio = (double) numLibros / aniosEscritos;
                System.out.println(nombre + " ha escrito un promedio de " + librosPorAnio + " libros por año.");
            } else {
                System.out.println(nombre + " es muy joven para haber escrito libros.");
            }
        } else {
            System.out.println("Edad no válida para calcular libros por año.");
        }
    }
    //Metodo con el que determinaremos si un autor es famoso o no
    public boolean esAutorFamoso() {
        return numLibros >= 5; // Consideramos un autor famoso si tiene 5 o más libros disponibles
    }
    //Metodo con el que diremos si un autro es mayor o no
    public boolean esAutorMayor() {
        return edad >= 60; // Consideramos un autor mayor si tiene 60 años o más
    }

}


