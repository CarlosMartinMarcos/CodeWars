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
        String devolver = "";
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Sheldon");nombres.add("Sheldon");
        nombres.add("Leonard");nombres.add("Leonard");
        nombres.add("Penny");nombres.add("Penny");
        nombres.add("Rajesh");nombres.add("Rajesh");
        nombres.add("Howard");nombres.add("Howard");
        switch (n) {
            case 1:devolver = "Sheldon";break;
            case 2:devolver = "Leonard";break;
            case 3:devolver = "Penny";break;
            case 4:devolver = "Rajesh";break;
            case 5:devolver = "Howard";break;
            default:for(int i = 0; i < n; i++){
                if((i + 1) == n)devolver = nombres.get(i);
                else ;
            }break;
        }
        return devolver;
    }
}
