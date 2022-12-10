package gt.edu.ingenieria.sistemas.ejemplo.triangulopascal;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bryan1010p
 */
public class TrianguloPascal {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int niveles = 0;
        int [] arreglo = new int[1];
        System.out.println("ingrese el numero de niveles");
        niveles = entrada.nextInt();
        for(int i=1; i<=niveles; i++) {
            int []pascal = new int[i];
             for(int j=niveles; j > i; j--){
                 System.out.print(" ");
             }
             for(int k = 0; k < i; k++){
                 if(k==0 || k==(i - 1)){
                     pascal[k] = 1;
                 }else{
                     pascal[k] = arreglo[k] + arreglo[k - 1];
                 }
                 System.out.println("{"+pascal[k]+"}");
             }
             arreglo =pascal;
             System.out.println();
        }
    }
}
