package com.KissApp.component.Usuario;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UsuarioDTO {


    @NotBlank(message = "El Campo userName no puede ir vacio")
    private String userName;
    @NotBlank(message = "El Campo nombre no puede ir vacio")
    private String nombre;
    @NotBlank(message = "El Campo Apellido no puede ir vacio")
    private String apellido;
    @NotBlank(message = "Constraseña no puede ir vacia")
    private String password;

    @NotBlank(message = "Constraseña no puede ir vacia")
    private String confirmPassword;

    @NotBlank(message = "Telefono no puede ir vacio")
    private String telefono;
    @NotNull(message = "El Campo Edad no puede ir vacia")
    private String edad;
    @NotNull(message = "El Campo Altura no puede ir vacia")
    private String altura;
    @NotBlank(message = "El Campo genero no puede ir vacia")
    private String genero;
    @NotBlank(message = "El ciudad genero no puede ir vacia")
    private String ciudad;
    private String coche;
    @NotBlank(message = "El musica_favorita genero no puede ir vacia")
    private String musica_favorita;
    @NotNull(message = "El salario genero no puede ir vacia")
    private String salario;






    public UsuarioDTO(String userName, String nombre, String apellido, String password, String confirmPassword, String telefono, String edad, String altura, String genero, String ciudad, String coche, String musica_favorita, String salario) {
        this.userName = userName;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.telefono = telefono;
        this.edad = edad;
        this.altura = altura;
        this.genero = genero;
        this.ciudad = ciudad;
        this.coche = coche;
        this.musica_favorita = musica_favorita;
        this.salario = salario;
    }


    public UsuarioDTO(){
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getMusica_favorita() {
        return musica_favorita;
    }

    public void setMusica_favorita(String musica_favorita) {
        this.musica_favorita = musica_favorita;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getConfirmPassword() {return confirmPassword;}

    public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword;}

}
