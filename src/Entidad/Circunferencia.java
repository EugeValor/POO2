/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class Circunferencia {
    private double radio;
    public double area;
    public double perimetro;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia() {
    }
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }    

}

   
