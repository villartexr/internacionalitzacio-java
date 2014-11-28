/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrius;

import java.util.Scanner;

/**
 *
 * @author villartexr
 */
public class Matrius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int FILAS = 5, COLUMNAS = 4;
        Scanner sc = new Scanner(System.in);
        Scanner idiom = new Scanner(System.in);
        int i, j, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;
        int[][] A = new int[FILAS][COLUMNAS];
        System.out.println("Idioma? ca (catala), es (español), en (english)  :  ");
        String idi = idiom.next();
        if(!idi.equals("ca") && !idi.equals("es") && !idi.equals("en")){
            System.out.println("English Predeterminated");
            idi = "en";
        
        }
        String idioma = ("matrius/"+idi);
        //System.out.println("idioma = " + idioma);
        System.out.println(java.util.ResourceBundle.getBundle(idioma).getString("BIENVENIDO A NUESTRO PROGRAMA"));
        System.out.println(java.util.ResourceBundle.getBundle(idioma).getString("LECTURA DE ELEMENTOS DE LA MATRIZ: "));
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle(idioma).getString("INTRODUCE EL ELEMENTO A[{0}][{1}]= "), new Object[] {i, j}));
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println(java.util.ResourceBundle.getBundle(idioma).getString("VALORES INTRODUCIDOS:"));
        for (i = 0; i < A.length; i++) { 
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + java.util.ResourceBundle.getBundle(idioma).getString(" "));
            }
            System.out.println();
        }
        mayor = menor = A[0][0];//se toma el primero como mayor y menor
        filaMayor = filaMenor = colMayor = colMenor = 0;

        for (i = 0; i < A.length; i++) {  //
            for (j = 0; j < A[i].length; j++) {
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    filaMayor = i;
                    colMayor = j;
                } else if (A[i][j] < menor) {
                    menor = A[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }           
        }
        System.out.print(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle(idioma).getString("ELEMENTO MAYOR: {0}"), new Object[] {mayor}));
        System.out.println(java.util.ResourceBundle.getBundle(idioma).getString(" FILA: ")+ filaMayor + java.text.MessageFormat.format(java.util.ResourceBundle.getBundle(idioma).getString(" COLUMNA: {0}"), new Object[] {colMayor}));
        System.out.print(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle(idioma).getString("ELEMENTO MENOR: {0}"), new Object[] {menor}));
        System.out.println(java.util.ResourceBundle.getBundle(idioma).getString(" FILA: ")+ filaMenor + java.text.MessageFormat.format(java.util.ResourceBundle.getBundle(idioma).getString(" COLUMNA: {0}"), new Object[] {colMenor}));
    }
}
    

