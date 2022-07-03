/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperacionesBasicas;

import javax.swing.JOptionPane;
import java.lang.NullPointerException;

/**
 * 0
 *
 * @author Usuario
 */
public class OperacionesBasicas {

    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
    private double radicacion, radicacion2;
    private double potenciacion;
    private String operaciones;
    private String opcion;
    private String opcion2;
    private double numeroUno;
    private double numeroDos;

    public void opcionesIniciales() {

        VentanasJOP();
        ConvertirNumeros();
        //Salir();

    }

    public void VentanasJOP() {
       //while (Integer.parseInt(opcion2) == 1) {
        opcion = JOptionPane.showInputDialog(null, "Seleccione una opción: \n 1. Realizar una operación."
                + " \n 2. Salir ");
        operaciones = JOptionPane.showInputDialog(null, "Seleccione una operación: \n 1. Sumar \n 2. Restar"
                + "\n 3. Multiplicar \n 4. Dividir \n 5. Radicación \n 6. Potenciación \n 7. Salir");
        //opcion2 = JOptionPane.showInputDialog(null, "Desea continuar: \n 1. si \n 2. no");
        //}

    }

    public void ConvertirNumeros() {
        numeroUno = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
        numeroDos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número"));

        if (Integer.parseInt(operaciones) == 1) {
            suma = (numeroUno) + (numeroDos);
            JOptionPane.showMessageDialog(null, "El resultado de sumar " + numeroUno + " + " + numeroDos + " es " + (double)Math.round(suma*100d)/100);
        } else if (Integer.parseInt(operaciones) == 2) {
            resta = (numeroUno) - (numeroDos);
            JOptionPane.showMessageDialog(null, "El resultado de restar " + numeroUno + " - " + numeroDos + " es " + (double)Math.round(resta*100d)/100);
        } else if (Integer.parseInt(operaciones) == 3) {
            multiplicacion = (numeroUno) * (numeroDos);
            JOptionPane.showMessageDialog(null, "El resultado de multiplicar " + numeroUno + " * " + numeroDos + " es " + (double)Math.round(multiplicacion*100d)/100);
        } else if ((Integer.parseInt(operaciones) == 4)) {
            if (((numeroDos) == 0)) {
                JOptionPane.showMessageDialog(null, "La división por cero no esta permitida", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            } else {
                division = (numeroUno) / (numeroDos);
                JOptionPane.showMessageDialog(null, "El resultado de dividir " + numeroUno + " / " + numeroDos + " es " + (double)Math.round(division*100d)/100);
            }
        } else if (Integer.parseInt(operaciones) == 5) {
            radicacion = Math.sqrt((numeroUno));
            radicacion2 = Math.sqrt((numeroDos));
            JOptionPane.showMessageDialog(null, "El resultado de la radicación " + numeroUno + " es " + (double)Math.round(radicacion*100d)/100);
            JOptionPane.showMessageDialog(null, "El resultado de la radicación " + numeroDos + " es " + (double)Math.round(radicacion2*100d)/100);
        } else if (Integer.parseInt(operaciones) == 6) {
            potenciacion = Math.pow((numeroUno), (numeroDos));
            JOptionPane.showMessageDialog(null, "El resultado de la potenciación de base " + numeroUno + " y exponente " + numeroDos + " es " + (double)Math.round(potenciacion*100d)/100);
        }

    }

    public void Salir() {
        if (Integer.parseInt(opcion) == 2 || Integer.parseInt(operaciones) == 7) {
            opcion2 = JOptionPane.showInputDialog(null, "Desea continuar: \n 1. si \n 2. no");
        } else {
            VentanasJOP();
            ConvertirNumeros();
        }
    }

}
