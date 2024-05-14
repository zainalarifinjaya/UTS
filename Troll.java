
package Disemvowel_Trolls;

public class Troll {
        public static String disemvowel(String input) {
        StringBuilder result = new StringBuilder();

        
        for (char c : input.toCharArray()) {
            
            if ("AEIOUaeiou".indexOf(c) == -1 || c == 'y' || c == 'Y') {
               
                result.append(c);
            }
        }

        
        return result.toString();
    }

    public static void main(String[] args) {
        
        String input1 = "Situs web ini untuk pecundang LOL!";
        String output1 = disemvowel(input1);
        System.out.println(output1); 

        String input2 = "Jangan tersinggung,\nTulisanmu termasuk yang terburuk yang pernah kubaca";
        String output2 = disemvowel(input2);
        System.out.println(output2); 

        String input3 = "Siapa kamu, seorang komunis?";
        String output3 = disemvowel(input3);
        System.out.println(output3); 
    }
    
}
