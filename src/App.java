import java.util.Scanner;

public class App {

    // Lista de autores
    Autores Gabriel_Garcia;
    Autores George_Orwell;
    Autores Patrick_Rothfuss;
    Autores Carlos_Ruiz_Zafon;
    Autores Miguel_de_Cervantes;
    Autores J_K_Rowling;
    Autores Jorge_R_R_Martin;
    Autores Brandon_Sanderson;

    // Lista de libros
    Libros[] listaLibros;

    public App() {

        // Crear autores
        Gabriel_Garcia = new Autores("Gabriel García Márquez", "Colombiana", 87, 5, 1001);
        George_Orwell = new Autores("George Orwell", "Británica", 46, 6, 1002);
        Patrick_Rothfuss = new Autores("Patrick Rothfuss", "Estadounidense", 47, 3, 1003);
        Carlos_Ruiz_Zafon = new Autores("Carlos Ruiz Zafón", "Española", 55, 7, 1004);
        Miguel_de_Cervantes = new Autores("Miguel de Cervantes", "Española", 68, 10, 1005);
        J_K_Rowling = new Autores("J.K. Rowling", "Británica", 58, 15, 1006);
        Jorge_R_R_Martin = new Autores("Jorge R.R. Martin", "Estadounidense", 76, 20, 1007);
        Brandon_Sanderson = new Autores("Brandon Sanderson", "Estadounidense", 47, 25, 1008);

        // Crear libros
        listaLibros = new Libros[] {
            new Libros("Cien Años de Soledad", Gabriel_Garcia, 1967, "Realismo Mágico", 20.5, 417),
            new Libros("El amor en tiempos del cólera", Gabriel_Garcia, 1985, "Novela", 18.0, 348),
            new Libros("Crónica de una muerte anunciada", Gabriel_Garcia, 1981, "Novela", 15.0, 128),
            new Libros("El otoño del patriarca", Gabriel_Garcia, 1975, "Novela", 22.0, 256),
            new Libros("La hojarasca", Gabriel_Garcia, 1955, "Novela", 14.0, 208),

            new Libros("Animal Farm", George_Orwell, 1945, "Fábula", 12.0, 112),
            new Libros("Nineteen Eighty-Four", George_Orwell, 1949, "Distopía", 16.0, 328),
            new Libros("1984", George_Orwell, 1949, "Distopía", 16.0, 328),
            new Libros("Rebelión en la granja", George_Orwell, 1945, "Fábula", 12.0, 112),
            new Libros("Días en Birmania", George_Orwell, 1934, "Novela", 14.0, 256),

            new Libros("El nombre del viento", Patrick_Rothfuss, 2007, "Fantasía", 25.0, 662),
            new Libros("El temor de un hombre sabio", Patrick_Rothfuss, 2011, "Fantasía", 27.0, 994),
            new Libros("La música del silencio", Patrick_Rothfuss, 2014, "Fantasía", 20.0, 336),

            new Libros("La sombra del viento", Carlos_Ruiz_Zafon, 2001, "Misterio", 22.0, 487),
            new Libros("El juego del ángel", Carlos_Ruiz_Zafon, 2008, "Misterio", 24.0, 672),
            new Libros("El prisionero del cielo", Carlos_Ruiz_Zafon, 2011, "Misterio", 20.0, 368),

            new Libros("Don Quijote de la Mancha", Miguel_de_Cervantes, 1605, "Novela", 30.0, 863),
            new Libros("La Galatea", Miguel_de_Cervantes, 1585, "Novela", 18.0, 320),

            new Libros("Harry Potter y la piedra filosofal", J_K_Rowling, 1997, "Fantasía", 20.0, 223),
            new Libros("Harry Potter y la cámara secreta", J_K_Rowling, 1998, "Fantasía", 22.0, 251),

            new Libros("Elantris", Brandon_Sanderson, 2005, "Fantasía", 24.0, 638),
            new Libros("Mistborn", Brandon_Sanderson, 2006, "Fantasía", 26.0, 541),
            new Libros("El camino de los reyes", Brandon_Sanderson, 2010, "Fantasía", 28.0, 1007),
            new Libros("Juramentada", Brandon_Sanderson, 2014, "Fantasía", 30.0, 1232),
            new Libros("El ritmo de la guerra", Brandon_Sanderson, 2020, "Fantasía", 32.0, 1232)
        };
    }
    //Metodo para calcular la media de paginas de un autor
    public int mediaPaginasAutor(Autores autor) {
        int media = 0;
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < listaLibros.length; i++) {
            Libros libro = listaLibros[i];
            if (libro.getAutores().equals(autor)) {
                suma += libro.getPaginas();
                contador++;
            }
        }

        if (contador > 0) {
            media = suma / contador;
        }
        return media;
    }
    //Metodo para buscar un autor por su nombre
    public Autores buscarAutorPorNombre(String nombre) {
        Autores[] autores = {
            Gabriel_Garcia, George_Orwell, Patrick_Rothfuss,
            Carlos_Ruiz_Zafon, Miguel_de_Cervantes, J_K_Rowling,
            Jorge_R_R_Martin, Brandon_Sanderson
        };

        for (int i = 0; i < autores.length; i++) {
            if (autores[i].getNombre().equalsIgnoreCase(nombre)) {
                return autores[i];
            }
        }
        return null;
    }
    //Metodo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App app = new App();

        System.out.println("Ingrese el nombre del autor para calcular la media de páginas:");
        String nombreAutor = sc.nextLine();

        Autores autorBuscado = app.buscarAutorPorNombre(nombreAutor);

        if (autorBuscado == null) {
            System.out.println("El autor no se encuentra en la lista.");
            return;
        }

        int media = app.mediaPaginasAutor(autorBuscado);

        System.out.println(autorBuscado);
        System.out.println("La media de páginas del autor " + autorBuscado.getNombre() + " es: " + media);
        
    }
}