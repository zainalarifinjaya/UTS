/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Is_this_a_triangle;

/**
 *
 * @author ADMIN
 */
public class TriangleTester {
        public static boolean isTriangle(int a, int b, int c) {
        // Cek apakah semua sisi lebih besar dari 0
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        
        // Cek apakah memenuhi aturan segitiga
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Metode main untuk menjalankan program utama
    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2)); // Output: true
        System.out.println(isTriangle(4, 2, 3)); // Output: true
        System.out.println(isTriangle(2, 2, 2)); // Output: true
        System.out.println(isTriangle(1, 2, 3)); // Output: false
        System.out.println(isTriangle(-5, 1, 3)); // Output: false
        System.out.println(isTriangle(0, 2, 3)); // Output: false
        System.out.println(isTriangle(1, 2, 9)); // Output: false
    }
}
