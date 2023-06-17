package com.KissApp.component.Usuario;


public class CardData {



    private String nombre;
    private int edad;
    private String imagen;
    private String descripcion;


    public CardData(String nombre, int edad, String imagen, String descripcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

