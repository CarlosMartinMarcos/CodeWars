/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionesparacodewar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author DAM107
 */
public class AplicacionesParaCodeWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    
    public static String WhoIsNext(String[] names, int n){
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Sheldon");
        nombres.add("Leonard");
        nombres.add("Penny");
        nombres.add("Rajesh");
        nombres.add("Howard");
        int i = 0;
        while((i + 1) < n){
            i++;
            nombres.add(nombres.get(0));
            nombres.add(nombres.get(0));
            nombres.remove(nombres.get(0));
        }
        return nombres.get(0);
    }
}
