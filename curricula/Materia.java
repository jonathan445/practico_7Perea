/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curricula;

import java.util.ArrayList;

/**
 *
 * @author jpere
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;
    private ArrayList alumnos;
    
    public ArrayList<Integer> getAlumnos() {
        return alumnos;
    }
    public boolean equals(Materia materia){
        if ( this.idMateria == materia.idMateria )
            return true;
        else return false;
    }
    
    
    public void setAlumnos( int alumno) {
        this.alumnos.add(alumno);
    }
    
    
    public Materia ( int idMateria , String nombre , int anio ) {
        this.anio = anio;
        this.idMateria = idMateria;
        this.nombre = nombre;
        alumnos = new ArrayList<Integer>();
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
