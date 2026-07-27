import java.util.*;
class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        isValid(word);
    }

    public static boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        if(!word.matches("[a-zA-Z0-9]+")){
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;
        String vowels = "aeiouAEIOU";

        for(char c : word.toCharArray()){
             if (Character.isLetter(c)){
                if(vowels.indexOf(c) != -1){
                    hasVowel = true;
                }
                else{
                    hasConsonant = true;
                }
            }

            if(hasVowel && hasConsonant){
                return true;
            }

            
        }
        return false;
    }
    
}
