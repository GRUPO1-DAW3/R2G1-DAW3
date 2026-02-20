public class App {

    // Autores
    Autor Gabriel_Garcia = new Autor("Gabriel García Márquez", "Colombiana", 87, 5, 1001);
    Autor George_Orwell = new Autor("George Orwell", "Británica", 46, 6, 1002);
    Autor Patrick_Rothfuss = new Autor("Patrick Rothfuss", "Estadounidense", 47, 3, 1003);
    Autor Carlos_Ruiz_Zafon = new Autor("Carlos Ruiz Zafón", "Española", 55, 7, 1004);
    Autor Miguel_de_Cervantes = new Autor("Miguel de Cervantes", "Española", 68, 10, 1005);
    Autor J_K_Rowling = new Autor("J.K. Rowling", "Británica", 58, 15, 1006);
    Autor Jorge_R_R_Martin = new Autor("Jorge R.R. Martin", "Estadounidense", 76, 20, 1007);
    Autor Brandon_Sanderson = new Autor("Brandon Sanderson", "Estadounidense", 47, 25, 1008);

    // Libros
    Libro Cien_Anios = new Libro("Cien Años de Soledad", Gabriel_Garcia, 1967, "Realismo Mágico", 20.5, 417);
    Libro Amor_Colera = new Libro("El amor en tiempos del cólera", Gabriel_Garcia, 1985, "Novela", 18.0, 348);
    Libro Cronica_Muerte = new Libro("Crónica de una muerte anunciada", Gabriel_Garcia, 1981, "Novela", 15.0, 128);
    Libro Otono_Patriarca = new Libro("El otoño del patriarca", Gabriel_Garcia, 1975, "Novela", 22.0, 256);
    Libro Hojarasca = new Libro("La hojarasca", Gabriel_Garcia, 1955, "Novela", 14.0, 208);

    Libro Animal_Farm = new Libro("Animal Farm", George_Orwell, 1945, "Fábula", 12.0, 112);
    Libro Nineteen_Eighty_Four = new Libro("Nineteen Eighty-Four", George_Orwell, 1949, "Distopía", 16.0, 328);
    Libro Orwell_1984 = new Libro("1984", George_Orwell, 1949, "Distopía", 16.0, 328);
    Libro Rebelion_Granja = new Libro("Rebelión en la granja", George_Orwell, 1945, "Fábula", 12.0, 112);
    Libro Dias_Birmania = new Libro("Días en Birmania", George_Orwell, 1934, "Novela", 14.0, 256);

    Libro Nombre_Viento = new Libro("El nombre del viento", Patrick_Rothfuss, 2007, "Fantasía", 25.0, 662);
    Libro Temor_Hombre_Sabio = new Libro("El temor de un hombre sabio", Patrick_Rothfuss, 2011, "Fantasía", 27.0, 994);
    Libro Musica_Silencio = new Libro("La música del silencio", Patrick_Rothfuss, 2014, "Fantasía", 20.0, 336);

    Libro Sombra_Viento = new Libro("La sombra del viento", Carlos_Ruiz_Zafon, 2001, "Misterio", 22.0, 487);
    Libro Juego_Angel = new Libro("El juego del ángel", Carlos_Ruiz_Zafon, 2008, "Misterio", 24.0, 672);
    Libro Prisionero_Cielo = new Libro("El prisionero del cielo", Carlos_Ruiz_Zafon, 2011, "Misterio", 20.0, 368);

    Libro Don_Quijote = new Libro("Don Quijote de la Mancha", Miguel_de_Cervantes, 1605, "Novela", 30.0, 863);
    Libro La_Galatea = new Libro("La Galatea", Miguel_de_Cervantes, 1585, "Novela", 18.0, 320);

    Libro HP_Piedra = new Libro("Harry Potter y la piedra filosofal", J_K_Rowling, 1997, "Fantasía", 20.0, 223);
    Libro HP_Camara = new Libro("Harry Potter y la cámara secreta", J_K_Rowling, 1998, "Fantasía", 22.0, 251);

    Libro Elantris = new Libro("Elantris", Brandon_Sanderson, 2005, "Fantasía", 24.0, 638);
    Libro Mistborn = new Libro("Mistborn", Brandon_Sanderson, 2006, "Fantasía", 26.0, 541);
    Libro Camino_Reyes = new Libro("El camino de los reyes", Brandon_Sanderson, 2010, "Fantasía", 28.0, 1007);
    Libro Juramentada = new Libro("Juramentada", Brandon_Sanderson, 2014, "Fantasía", 30.0, 1232);
    Libro Ritmo_Guerra = new Libro("El ritmo de la guerra", Brandon_Sanderson, 2020, "Fantasía", 32.0, 1232);
}