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
public class Persona {
    private String Nombre;
    private int Edad;
    private  int Dni;

    public Persona(){}
    public Persona(String Nombre, int Edad, int Dni) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    
    public String esMayor() {
        if(Edad>17){
            return "Es mayor de edad";
        }else{
            return "Es menor de edad";
        }
   
    }
    public int AñoNacimiento (){
        int nacimiento=2019-Edad;
        return nacimiento;
    }
    
            
            
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Dni=" + Dni + '}';
    }
    
}


