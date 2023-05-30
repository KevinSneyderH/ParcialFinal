/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomundial.model;

/**
 *
 * @author miguelropero
 */
public class Seleccion {

    String nombre;
    String continente;
    String dt;
    String nacionalidad;
    
    String username;
    String contra;

    public Seleccion() {
    }

    public Seleccion(String nombre, String continente, String dt, String nacionalidad) {
        this.nombre = nombre;
        this.continente = continente;
        this.dt = dt;
        this.nacionalidad = nacionalidad;
    }
    
    public Seleccion(String username, String contra) {
        this.username = username;
        this.contra = contra;
    }

    public String getUsername() {
        return username;
    }

    public String getContra() {
        return contra;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
