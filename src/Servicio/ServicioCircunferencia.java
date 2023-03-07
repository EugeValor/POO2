/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class ServicioCircunferencia {
    Scanner leer = new Scanner(System.in);
  public Circunferencia crearCircunferencia (){  
    
    Circunferencia C1 = new Circunferencia();
    double num;
    do{
        System.out.println("Ingrese un radio positivo");
        num = leer.nextDouble();
    }while (num<0);
    C1.setRadio(num);
    return C1;
        
    }
public void area (Circunferencia C1){
    double area;
    area = PI * (C1.getRadio()*C1.getRadio());
    System.out.println("Es area es: "+area);
}
public void perimetro (Circunferencia C1){
    double perimetro;
    perimetro = 2 * PI *C1.getRadio();
    System.out.println("Es perimetro es: "+perimetro);
}}