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
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private ArrayList<Integer> materias;

    public ArrayList getMaterias() {
        return materias;
    }
    
    public Alumno ( int legajo , String apellido, String nombre){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        materias = new ArrayList<Integer>();
    }
    
    public void agregarMateria(Materia materia){
        try {
           MiException.inscripto(this, materia);
           materia.setAlumnos(legajo);
           this.materias.add(materia.getIdMateria());
        }
        catch (Exception e){
         System.out.println(e);
        }
    }
    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
