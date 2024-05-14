/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sum_of_odd_numbers_3;

/**
 *
 * @author ADMIN
 */
public class RowSumOddNumbers {
   public static int rowSumOddNumbers(int n) {
        // Jumlah bilangan pada baris ke-n adalah n^3
        return n * n * n;
    }

    // Metode main untuk menjalankan program utama
    public static void main(String[] args) {
        // Contoh penggunaan fungsi
        System.out.println(rowSumOddNumbers(1)); // Output: 1
        System.out.println(rowSumOddNumbers(2)); // Output: 8
        System.out.println(rowSumOddNumbers(42)); // Output: 74088
    }
    
}
