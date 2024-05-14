/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Complementary_DNA;

/**
 *
 * @author ADMIN
 */
public class DnaStrand {
        public static String makeComplement(String dna) {
        StringBuilder complementary = new StringBuilder();

        
        for (char c : dna.toCharArray()) {
           
            switch (c) {
                case 'A':
                    complementary.append('T');
                    break;
                case 'T':
                    complementary.append('A');
                    break;
                case 'C':
                    complementary.append('G');
                    break;
                case 'G':
                    complementary.append('C');
                    break;
                
                default:
                    break;
            }
        }

       
        return complementary.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplement("ATTGC")); 
        System.out.println(makeComplement("GTAT")); 
    }
    
}
