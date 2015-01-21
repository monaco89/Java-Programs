/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ssn;

import java.util.Scanner;
/**
 *
 * @author NickMonaco
 */
public class SSN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter your ssn: ");
        String ssn = input.nextLine();
        
        
        if(isValidSSN(ssn))
        {
            System.out.println("Valid SSN");
        }
        else
        {
            System.out.println("Invalid SSN");
        }
            
        
    }
    public static boolean isValidSSN(String ssn)
        {
            return ssn.length() == 11 &&
                    Character.isDigit(ssn.charAt(0)) &&
                    Character.isDigit(ssn.charAt(1)) &&
                    Character.isDigit(ssn.charAt(2)) &&
                    ssn.charAt(3) == '-' &&
                    Character.isDigit(ssn.charAt(4)) &&
                    Character.isDigit(ssn.charAt(5)) &&
                    ssn.charAt(6) == '-' &&
                    Character.isDigit(ssn.charAt(7)) &&
                    Character.isDigit(ssn.charAt(8)) &&
                    Character.isDigit(ssn.charAt(9)) &&
                    Character.isDigit(ssn.charAt(10));
        }
    
}