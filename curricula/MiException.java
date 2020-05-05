/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curricula;

/**
 *
 * @author jpere
 */
public class MiException extends Exception{
    public MiException(String msg){
        super(msg);
    }
    public static void inscripto ( Alumno alumno, Materia materia ) throws MiException{
        if ( !alumno.getMaterias().isEmpty()){
            if (!materia.getAlumnos().isEmpty()){
                if(alumno.getMaterias().contains(materia.getIdMateria())){
                    if(materia.getAlumnos().contains(alumno.getLegajo())){
                        throw new MiException(" ya existe un alumno con este legajo registrado en la materia");
                    }
                    else throw new MiException(" el sistema precenta inconsistencia de los datos ( El alumno tiene la materia pero la materia no al alumno)");
                }
                else if(materia.getAlumnos().contains(alumno.getLegajo())){
                    throw new MiException(" el sistema precenta inconsistencia de los datos ( la materia tiene al alumno pero el alumno no a la materia)");
                }
            }
            else if(alumno.getMaterias().contains(materia.getIdMateria())){
                 throw new MiException(" el sistema precenta inconsistencia de los datos ( El alumno tiene la materia pero la materia no tiene alumnos)");
            }
        }
        else if (!materia.getAlumnos().isEmpty()){
            if(materia.getAlumnos().contains(alumno.getLegajo())){
                throw new MiException(" el sistema precenta inconsistencia de los datos ( la materia tiene al alumno pero el alumno no tiene ninguna materia)");
            }
        }
    }
}
