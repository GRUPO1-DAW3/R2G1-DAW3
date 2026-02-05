import java.util.Scanner;

public class App {
    Autores Gabriel_Garcia = new Autores("Gabriel García Márquez", "Colombiana", 87, 5, 1001);
    Autores George_Orwell = new Autores("George Orwell", "Británica", 46, 6, 1002);
    Autores Patrick_Rothfuss = new Autores("Patrick Rothfuss", "Estadounidense", 47, 3, 1003);
    Autores Carlos_Ruiz_Zafón = new Autores("Carlos Ruiz Zafón", "Española", 55, 7, 1004);
    Autores Miguel_de_Cervantes = new Autores("Miguel de Cervantes", "Española", 68, 10, 1005);
    Autores J_K_Rowling = new Autores("J.K. Rowling", "Británica", 58, 15, 1006);
    Autores Jorge_R_R_Martin = new Autores("Jorge R.R. Martin", "Estadounidense", 76, 20, 1007);
    Autores Brandon_Sanderson = new Autores("Brandon Sanderson", "Estadounidense", 47, 25, 1008);

    Libros Cien_Anios_de_Soledad = new Libros("Cien Años de Soledad", Gabriel_Garcia, 1967, "Realismo Mágico", 20.5, 417);
    Libros El_amor_en_tiempos_del_colera = new Libros("El amor en tiempos del cólera", Gabriel_Garcia, 1985, "Novela", 18.0, 348);
    Libros Cronica_de_una_muerte_anunciada = new Libros("Cronica de una muerte anunciada", Gabriel_Garcia, 1981, "Novela", 15.0, 128);
    Libros El_otonio_del_patriarca = new Libros("El otoño del patriarca", Gabriel_Garcia, 1975, "Novela", 22.0, 256);
    Libros La_hojarasca = new Libros("La hojarasca", Gabriel_Garcia, 1955, "Novela", 14.0, 208);
    Libros Animal_Farm = new Libros("Animal Farm", George_Orwell, 1945, "Fábula", 12.0, 112);
    Libros Nineteen_Eighty_Four = new Libros("Nineteen Eighty-Four", George_Orwell, 1949, "Distopía", 16.0, 328);
    Libros _1984_ = new Libros("1984", George_Orwell, 1949, "Distopía", 16.0, 328);
    Libros Rebelión_en_la_granja = new Libros("Rebelión en la granja", George_Orwell, 1945, "Fábula", 12.0, 112);
    Libros Dias_en_Birmania = new Libros("Días en Birmania", George_Orwell, 1934, "Novela", 14.0, 256);
    Libros El_nombre_del_viento = new Libros("El nombre del viento", Patrick_Rothfuss, 2007, "Fantasía", 25.0, 662);
    Libros El_temor_de_un_hombre_sabio = new Libros("El temor de un hombre sabio", Patrick_Rothfuss, 2011, "Fantasía", 27.0, 994);
    Libros La_musica_del_silencio = new Libros("La música del silencio", Patrick_Rothfuss, 2014, "Fantasía", 20.0, 336);
    Libros El_juego_de_los_ender = new Libros("El juego de los Ender", Patrick_Rothfuss, 1985, "Ciencia Ficción", 18.0, 324);
    Libros La_voz_de_los_reyes = new Libros("La voz de los reyes", Patrick_Rothfuss, 2007, "Fantasía", 25.0, 662);
    Libros La_sombra_del_viento = new Libros("La sombra del viento", Carlos_Ruiz_Zafón, 2001, "Misterio", 22.0, 487);
    Libros El_juego_del_angel = new Libros("El juego del ángel", Carlos_Ruiz_Zafón, 2008, "Misterio", 24.0, 672);
    Libros El_prisionero_del_cielo = new Libros("El prisionero del cielo", Carlos_Ruiz_Zafón, 2011, "Misterio", 20.0, 368);
    Libros Triologia_de_la_neblina = new Libros("Trilogía de la niebla", Carlos_Ruiz_Zafón, 1993, "Misterio", 18.0, 288);
    Libros El_laberinto_de_los_espiritus = new Libros("El laberinto de los espíritus", Carlos_Ruiz_Zafón, 2016, "Misterio", 26.0, 912);
    Libros Don_Quijote_de_la_Mancha = new Libros("Don Quijote de la Mancha", Miguel_de_Cervantes, 1605, "Novela", 30.0, 863);
    Libros La_galatea = new Libros("La Galatea", Miguel_de_Cervantes, 1585, "Novela", 18.0, 320);
    Libros Novelas_ejemplares = new Libros("Novelas ejemplares", Miguel_de_Cervantes, 1613, "Novela", 20.0, 512);
    Libros Los_trabajos_de_Persiles_y_Sigismunda = new Libros("Los trabajos de Persiles y Sigismunda", Miguel_de_Cervantes, 1617, "Novela", 22.0, 432);
    Libros La_vida_del_buscon = new Libros("La vida del Buscón", Miguel_de_Cervantes, 1626, "Novela", 16.0, 256);
    Libros Harry_Potter_y_la_piedra_filosofal = new Libros("Harry Potter y la piedra filosofal", J_K_Rowling, 1997, "Fantasía", 20.0, 223);
    Libros Harry_Potter_y_la_camara_secreta = new Libros("Harry Potter y la cámara secreta", J_K_Rowling, 1998, "Fantasía", 22.0, 251);
    Libros Harry_Potter_y_el_prisionero_de_Azkaban = new Libros("Harry Potter y el prisionero de Azkaban", J_K_Rowling, 1999, "Fantasía", 24.0, 317);
    Libros Harry_Potter_y_el_cáliz_de_fuego = new Libros("Harry Potter y el cáliz de fuego", J_K_Rowling, 2000, "Fantasía", 26.0, 636);
    Libros Harry_Potter_y_la_orden_del_fenix = new Libros("Harry Potter y la orden del fénix", J_K_Rowling, 2003, "Fantasía", 28.0, 766);
    Libros Canción_de_hielo_y_fuego = new Libros("Canción de hielo y fuego", Jorge_R_R_Martin, 1996, "Fantasía", 30.0, 694);
    Libros Choque_de_reyes = new Libros("Choque de reyes", Jorge_R_R_Martin, 1998, "Fantasía", 32.0, 768);
    Libros Tormenta_de_espadas = new Libros("Tormenta de espadas", Jorge_R_R_Martin, 2000, "Fantasía", 34.0, 973);
    Libros Festin_de_cuervos = new Libros("Festín de cuervos", Jorge_R_R_Martin, 2005, "Fantasía", 36.0, 753);
    Libros Danza_de_dragones = new Libros("Danza de dragones", Jorge_R_R_Martin, 2011, "Fantasía", 38.0, 1016);
    Libros Elantris = new Libros("Elantris", Brandon_Sanderson, 2005, "Fantasía", 24.0, 638);
    Libros Mistborn = new Libros("Mistborn", Brandon_Sanderson, 2006, "Fantasía", 26.0, 541);
    Libros El_alarido_de_los_dioses = new Libros("El camino de los reyes", Brandon_Sanderson, 2010, "Fantasía", 28.0, 1007);
    Libros Juramentada = new Libros("Juramentada", Brandon_Sanderson, 2014, "Fantasía", 30.0, 1232);
    Libros El_ritmo_de_la_guerra = new Libros("El ritmo de la guerra", Brandon_Sanderson, 2020, "Fantasía", 32.0, 1232);

    public int mediaPaginasAutor(Autores autor) {
        int media = 1;
        int sumaPaginas = 0;
        int contadorLibros = 0;
        Libros[] listaLibros = {
            Cien_Anios_de_Soledad, El_amor_en_tiempos_del_colera, Cronica_de_una_muerte_anunciada,
            El_otonio_del_patriarca, La_hojarasca, Animal_Farm, Nineteen_Eighty_Four, _1984_,
            Rebelión_en_la_granja, Dias_en_Birmania, El_nombre_del_viento, El_temor_de_un_hombre_sabio,
            La_musica_del_silencio, El_juego_de_los_ender, La_voz_de_los_reyes, La_sombra_del_viento,
            El_juego_del_angel, El_prisionero_del_cielo, Triologia_de_la_neblina, El_laberinto_de_los_espiritus,
            Don_Quijote_de_la_Mancha, La_galatea, Novelas_ejemplares, Los_trabajos_de_Persiles_y_Sigismunda,
            La_vida_del_buscon, Harry_Potter_y_la_piedra_filosofal, Harry_Potter_y_la_camara_secreta,
            Harry_Potter_y_el_prisionero_de_Azkaban, Harry_Potter_y_el_cáliz_de_fuego,
            Harry_Potter_y_la_orden_del_fenix, Canción_de_hielo_y_fuego, Choque_de_reyes,
            Tormenta_de_espadas, Festin_de_cuervos, Danza_de_dragones, Elantris, Mistborn,
            El_alarido_de_los_dioses, Juramentada, El_ritmo_de_la_guerra};
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros[i].getAutores().equals(autor)) {
                sumaPaginas += listaLibros[i].getPaginas();
                contadorLibros++;
            }
        }
        if (contadorLibros > 0) {
            media = sumaPaginas / contadorLibros;
        }
        return media;
    }

    

    public static void main(String[] args) throws Exception {
       App app = new App();
       System.out.println("La media de paginas de Brandon Sanderson es: " + app.mediaPaginasAutor(app.Brandon_Sanderson));
        
    }
}
