public class App {

    // Autores
    Autores Gabriel_Garcia = new Autores("Gabriel García Márquez", "Colombiana", 87, 5, 1001);
    Autores George_Orwell = new Autores("George Orwell", "Británica", 46, 6, 1002);
    Autores Patrick_Rothfuss = new Autores("Patrick Rothfuss", "Estadounidense", 47, 3, 1003);
    Autores Carlos_Ruiz_Zafon = new Autores("Carlos Ruiz Zafón", "Española", 55, 7, 1004);
    Autores Miguel_de_Cervantes = new Autores("Miguel de Cervantes", "Española", 68, 10, 1005);
    Autores J_K_Rowling = new Autores("J.K. Rowling", "Británica", 58, 15, 1006);
    Autores Jorge_R_R_Martin = new Autores("Jorge R.R. Martin", "Estadounidense", 76, 20, 1007);
    Autores Brandon_Sanderson = new Autores("Brandon Sanderson", "Estadounidense", 47, 25, 1008);

    // Libros
    Libros Cien_Anios = new Libros("Cien Años de Soledad", Gabriel_Garcia, 1967, "Realismo Mágico", 20.5, 417);
    Libros Amor_Colera = new Libros("El amor en tiempos del cólera", Gabriel_Garcia, 1985, "Novela", 18.0, 348);
    Libros Cronica_Muerte = new Libros("Crónica de una muerte anunciada", Gabriel_Garcia, 1981, "Novela", 15.0, 128);
    Libros Otono_Patriarca = new Libros("El otoño del patriarca", Gabriel_Garcia, 1975, "Novela", 22.0, 256);
    Libros Hojarasca = new Libros("La hojarasca", Gabriel_Garcia, 1955, "Novela", 14.0, 208);

    Libros Animal_Farm = new Libros("Animal Farm", George_Orwell, 1945, "Fábula", 12.0, 112);
    Libros Nineteen_Eighty_Four = new Libros("Nineteen Eighty-Four", George_Orwell, 1949, "Distopía", 16.0, 328);
    Libros Orwell_1984 = new Libros("1984", George_Orwell, 1949, "Distopía", 16.0, 328);
    Libros Rebelion_Granja = new Libros("Rebelión en la granja", George_Orwell, 1945, "Fábula", 12.0, 112);
    Libros Dias_Birmania = new Libros("Días en Birmania", George_Orwell, 1934, "Novela", 14.0, 256);

    Libros Nombre_Viento = new Libros("El nombre del viento", Patrick_Rothfuss, 2007, "Fantasía", 25.0, 662);
    Libros Temor_Hombre_Sabio = new Libros("El temor de un hombre sabio", Patrick_Rothfuss, 2011, "Fantasía", 27.0, 994);
    Libros Musica_Silencio = new Libros("La música del silencio", Patrick_Rothfuss, 2014, "Fantasía", 20.0, 336);

    Libros Sombra_Viento = new Libros("La sombra del viento", Carlos_Ruiz_Zafon, 2001, "Misterio", 22.0, 487);
    Libros Juego_Angel = new Libros("El juego del ángel", Carlos_Ruiz_Zafon, 2008, "Misterio", 24.0, 672);
    Libros Prisionero_Cielo = new Libros("El prisionero del cielo", Carlos_Ruiz_Zafon, 2011, "Misterio", 20.0, 368);

    Libros Don_Quijote = new Libros("Don Quijote de la Mancha", Miguel_de_Cervantes, 1605, "Novela", 30.0, 863);
    Libros La_Galatea = new Libros("La Galatea", Miguel_de_Cervantes, 1585, "Novela", 18.0, 320);

    Libros HP_Piedra = new Libros("Harry Potter y la piedra filosofal", J_K_Rowling, 1997, "Fantasía", 20.0, 223);
    Libros HP_Camara = new Libros("Harry Potter y la cámara secreta", J_K_Rowling, 1998, "Fantasía", 22.0, 251);

    Libros Elantris = new Libros("Elantris", Brandon_Sanderson, 2005, "Fantasía", 24.0, 638);
    Libros Mistborn = new Libros("Mistborn", Brandon_Sanderson, 2006, "Fantasía", 26.0, 541);
    Libros Camino_Reyes = new Libros("El camino de los reyes", Brandon_Sanderson, 2010, "Fantasía", 28.0, 1007);
    Libros Juramentada = new Libros("Juramentada", Brandon_Sanderson, 2014, "Fantasía", 30.0, 1232);
    Libros Ritmo_Guerra = new Libros("El ritmo de la guerra", Brandon_Sanderson, 2020, "Fantasía", 32.0, 1232);
}