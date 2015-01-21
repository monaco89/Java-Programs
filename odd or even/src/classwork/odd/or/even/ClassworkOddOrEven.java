/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classwork.odd.or.even;

import java.util.Scanner;
/**
 *
 * @author NickMonaco
 */
public class ClassworkOddOrEven {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int largerNum;
        
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num1 = input.nextInt();
       System.out.print("Enter another number: ");
       int num2 = input.nextInt();
       
       largerNum = (num1<num2)?num2:num1;
       
       System.out.println(largerNum);
    }
    
}
