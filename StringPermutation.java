
package hw4;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author alexgeronimo
 */
public class StringPermutation {
    
    /**
     * Main Permutation Program
     */
    public static void mainPermutation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string with unique elements: \n");
        String string_in = in.nextLine().trim();
        
        boolean check = uniqueChars(string_in);
        if (check == false){
            System.out.println("Error: Not all characters of string unique\nExiting program");
        }
        else{
            ArrayList<Character> U = new ArrayList<Character>();
            for(int i=0; i < string_in.length(); i++){
                U.add(string_in.charAt(i));
            }
            ArrayList<Character> S = new ArrayList<Character>();
            PrintPermutation(U.size(),S,U);   
        }
        
    }
    
    public static boolean uniqueChars(String str){
        //Loop over each character in string, loop over remaining character elements
        // Return false if duplicate is found
       for (int i=0; i<str.length(); i++)
            for (int j=i+1; j<str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false; 
       
        // No duplicates found 
       return true;
    }
    /**
     * Uses recursion to print all unique combinations of string characters 
     * @param k - Number of characters in ArrayList U
     * @param S - Empty ArrayList
     * @param U - Input String elements in ArrayLIs
     */
    public static void PrintPermutation (int k, ArrayList<Character> S, ArrayList<Character> U){
        for (int i=0; i < k; i++){
             char c = U.get(i);
             U.remove(i);
             S.add(c);
             
             if (k ==1){
                 System.out.println(S.toString());
             }
             else{
                 PrintPermutation(k-1,S,U);
             }
             S.remove(S.size()-1);
             U.add(i, c);
             
        }
        
        
    }
    
}
