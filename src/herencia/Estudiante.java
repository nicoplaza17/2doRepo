/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author nico
 */
public class Estudiante extends Persona{
    private int Curso;
    private String Especialidad;
    
    
    public Estudiante(){}
    public Estudiante(String Nombre, int Edad, int Dni,int Curso, String Especialidad) {
        super(Nombre, Edad, Dni);
        this.Curso = Curso;
        this.Especialidad = Especialidad;
    }

    public int getCurso() {
        return Curso;
    }

    public void setCurso(int Curso) {
        this.Curso = Curso;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String Nivel(){
        if(Curso>3){
            return "Es de nivel superior";
        }else{
            return "Es de nivel inicial";
        }
    }
    public int Egreso(){
        int Egreso=7-Curso;
        Egreso=Egreso+2019;
        return Egreso;
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "Estudiante{"+super.toString() + "Curso=" + Curso + ", Especialidad=" + Especialidad + '}';
    }
    
    
    
    























}
