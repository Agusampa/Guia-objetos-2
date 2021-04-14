package com.company;


import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor[] autores;

    //Constructores
    public Libro(String titulo, double precio, int stock) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }
    /*public void mostrarLibro(){
        System.out.println("-Libro: "+this.titulo + " "+this.autores.toString() + " -Precio: "+this.precio + " -Stock: "+this.stock);
    }*/

    public String mostrarLibroFrase(){
        StringBuilder nombres = new StringBuilder();
        for(Autor autor : autores){
            if(autor != null){
                nombres.append("-");
                nombres.append(autor.getNombre());
                nombres.append(" ");
                nombres.append(autor.getApellido());
            }
        }
        return "El libro "+this.titulo+" de "+nombres+"se vende a"+this.precio;
    }

    public void cargarVariosAutores(){
        int validos = 0;
        char seguir = 'n';
        Scanner sc = new Scanner(System.in);
        while (seguir != 'n'){
            System.out.println("Ingrese el nombre del autor: ");
            this.autores[validos].setNombre(sc.nextLine());
            System.out.println("Ingrese el apellido del autor: ");
            this.autores[validos].setApellido(sc.nextLine());
            System.out.println("Ingrese el email del autor: ");
            this.autores[validos].setEmail(sc.nextLine());
            System.out.println("Ingrese el genero del autor ('M' o 'F'):");
            this.autores[validos].setGenero(sc.next().charAt(0));
            validos++;
            System.out.println("Desea agregar otro autor al libro?('s' o 'n')");
            seguir = sc.next().charAt(0);
        }
    }

}


