/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printgrades;

import java.util.Scanner;

/**This class takes String input grade code a+,a,b,c from user 
 * and calls method gradeDetail to print the 
 * grades: Excellent,Very good,Good and Satisfactory.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enum which avoids String input 
 * then print the grade details. 
 * @author srinivsi 
 */



public class PrintGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
      {
 
    
    Scanner in =new Scanner(System.in);
    System.out.print("Enter the student grade code: ");
    printInputs();
    System.out.println();
    Grade code = Grade.valueOf(in.next().toUpperCase());
    printResult(code);
    }  // TODO code application logic here
    
    // Print result from Grades class
    private static void printResult(Grade code){
        Grades t= new Grades();
        t.gradeDetail(code); 
    }
    // Print possible grades
    private static void printInputs(){
            for (Grade value : Grade.values()) {
            System.out.print(value + " ");
        }
    }
   
}
