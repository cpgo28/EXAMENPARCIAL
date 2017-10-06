/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                      
        ArrayList ListadeTelefonosMoviles = new ArrayList();
        
        Scanner input = new Scanner (System.in);
         
        System.out.println("EXAMEN PARCIAL");
        System.out.println("PAMELA GONZALES");
        System.out.println(" ");
        System.out.println("CATALOGO DE TELEFONOS MOVILES");
        System.out.println(" ");
        System.out.println("TELEFONOS MOVILES");
        System.out.println("[1] SAMSUNG S6");
        System.out.println("[2] IPHONE 6");
        System.out.println("[3] HUAWEI P8");                    
        System.out.println("SELECCIONE UN MODELO");
        
        char opcion = input.next().charAt(0);
       
        switch (opcion){
            case '1':
                System.out.println("PANTALLA  : 4,7\"");
                System.out.println("CAMARA    : 8MP");
                System.out.println("PROCESADOR : 1.4Ghz");
                break;
                
            case '2':
                System.out.println("PANTALLA  : 4,7\"");
                System.out.println("CAMARA    : 12MP");
                System.out.println("PROCESADOR : A11");
                break;
                
            case '3':
                System.out.println("PANTALLA  : 5,2\"");
                System.out.println("CAMARA    : 13MP");
                System.out.println("PROCESADOR : 2Ghz");
                break;
        } 
        ArrayList Operadora = new ArrayList();
        Scanner OPERADORA;
         
        input = new Scanner (System.in);
        System.out.println(" ");
        System.out.println("SELECCIONE UNA OPERADORA");
        System.out.println("[1] CLARO");
        System.out.println("[2] MOVISTAR");
        System.out.println("[3] ENTEL"); 
    
        switch (opcion){
            case '1':
                System.out.println("PRECIO : S/99");
                System.out.println("MINUTOS ILIMITADOS");
                System.out.println("RPC ILIMITADOS");
                System.out.println("INTERNET 6GB");
                System.out.println("SMS ILIMITADOS");
                break;
            case '2':
                System.out.println("S/121");
                System.out.println("MINUTOS ILIMITADOS");
                System.out.println("RPM ILIMITADOS");
                break;
                
            case '3':
                System.out.println("455");
                System.out.println("MINUTOS ILIMITADOS");
                System.out.println("RPE ILIMITADOS");
                break;    
        }

    }
}

        
    
  
    
    
    

        
    
        
       
        
         
    
    

