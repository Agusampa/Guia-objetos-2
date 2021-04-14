package com.company;

import java.util.Scanner;

public class Autor {
    private String nombre;
    private String Apellido;
    private String email;
    private char genero;

    //Constructores
    public Autor() {
    }

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.Apellido = apellido;
        this.email = email;
        this.genero = genero;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    //Metodos
    /*public mostrarAutor() {
        System.out.println("Autor: " + this.nombre + " " + this.Apellido + " Email: " + this.email + " Genero: " + this.genero);
    }*/

    @Override
    public String toString() {
        return "-Autor: " + this.nombre + " " + this.Apellido + " -Email: " + this.email + " -Genero: " + this.genero;
    }

}
