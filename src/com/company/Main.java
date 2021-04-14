package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea ver");
        int ejercicio = sc.nextInt();

        switch (ejercicio) {

            case 1:

                Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
                //System.out.println(autor.toString());



                Libro libro = new Libro("Effective java",450,150);

                libro.cargarVariosAutores();

                libro.setPrecio(500);
                libro.setStock(200);
                //libro.mostrarLibro();


                System.out.println(libro.mostrarLibroFrase());

        }
    }
}
