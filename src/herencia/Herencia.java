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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Estudiante 1 = new Estudiante();
    Estudiante l1 = new Estudiante("Nicolas",16,43998396,5,"Programacion");
    System.out.println(l1.toString());
    System.out.println(l1.esMayor());
    System.out.println(l1.Egreso());
    System.out.println(l1.AñoNacimiento());
        System.out.println(l1.Nivel());
    }

}
