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
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        materias.add ( new Materia(0,"ingles 1",1));
        materias.add ( new Materia(1,"matematica",1));
        materias.add ( new Materia(2,"laboratorio 1",1));
        
        alumnos.add( new Alumno(1001,"lopez","Martin"));
        alumnos.add( new Alumno(1002,"lopez","Martin"));
        
        alumnos.get(0).agregarMateria(materias.get(0));
        alumnos.get(0).agregarMateria(materias.get(1));
        alumnos.get(0).agregarMateria(materias.get(2));
        
        alumnos.get(1).agregarMateria(materias.get(0));
        alumnos.get(1).agregarMateria(materias.get(1));
        alumnos.get(1).agregarMateria(materias.get(2));
        alumnos.get(1).agregarMateria(materias.get(2));
        
        System.out.println(alumnos.get(1).getMaterias().size());
    }
    
}
