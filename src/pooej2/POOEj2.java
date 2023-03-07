/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;


/**
 *
 * @author 54343
 */
public class POOEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      ServicioCircunferencia SC = new ServicioCircunferencia();
       
      Circunferencia C1 = SC.crearCircunferencia();
      
      SC.area(C1);
      SC.perimetro(C1);
      
    
}}

    
    