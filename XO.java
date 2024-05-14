/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exes_and_Ohs_05;

/**
 *
 * @author ADMIN
 */
public class XO {
    public static boolean getXO (String str) {
        if (str == null) return true;

        int countX = 0;
        int countO = 0;
        
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'x') countX++;
            if (c == 'o') countO++;
        }
        
        return countX == countO;
    }

    // Metode main untuk menjalankan contoh langsung
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));    // true
        System.out.println(getXO("xooxx"));   // false
        System.out.println(getXO("ooxXm"));   // true
        System.out.println(getXO("zpzpzpp")); // true
        System.out.println(getXO("zzoo"));    // false
    }
}
