/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.izv.testarbol;

/**
 *
 * @author Alberto
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TestArbol {

    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Paint the tree!\n");

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        int cont = 0;
        int tama = 7;  // tama siempre con valores impares >= 3
        if (args.length>0)
            tama = Integer.parseInt(args[0]);
        else tama = 15;
        
        int finHojas = (int) (tama / 2);
        if (tama % 2 != 0) {
            finHojas++;
        }
        int numAsteriscos, numEspacios;
        for (int i = 1; i <= tama; i++) {
            if (i <= finHojas) {
                numAsteriscos = i + cont;
            } else {
                numAsteriscos = tama - finHojas;
            }

            numEspacios = (int) ((tama - numAsteriscos) / 2);
            if ((tama - numAsteriscos) % 2 != 0 && i > finHojas) {
                numAsteriscos++;
            }
            pinta(numEspacios, numAsteriscos);
            cont++;
        }
    }

    private static void pinta(int numEspacios, int numAsteriscos) {
        pinta(' ', numEspacios);
        pinta('*', numAsteriscos);
        pinta(' ', numEspacios);
        System.out.println("");
    }

    private static void pinta(char caracter, int tama) {
        for (int i = 1; i <= tama; i++) {
            System.out.printf("%c", caracter);
        }
    }
}
