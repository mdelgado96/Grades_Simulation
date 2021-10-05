
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marvindelgado
 */
public class Grade 
{
    public static void main(String [] args)
    {
                                                                            //Intialize the variables used
        int nst, nTest;
        long timeCount = System.currentTimeMillis();
        long duration = 0;
        double sum = 0.0, test = 0.0; String name = "";
        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        
                                                                            //Get the number of students
        System.out.print("Enter number of the students: ");
         nst = inputNum.nextInt();
         
                                                                            //Start loop for number of students
         for (int i = 0; i < nst; i++)
         {                                                                  //Loop for 1st student 
             System.out.print("Enter your name: ");                         //Groes through loop
                                                                            //then asks for next student
             name   = inputStr.nextLine();
             System.out.print("Hello " + name + 
                     ",\nHow many tests: ");                                //Starts loop for number of tests
             nTest = inputNum.nextInt();
             for (int j = 0; j < nTest; j++)
             {
                 System.out.print("Enter Test# " + (j + 1) + ": ");
                  test = inputNum.nextDouble();
                  sum += test;
                  lGrade (sum, nTest, duration, name, timeCount);
             }
         }
         
    }
    public static char lGrade(double sum, int nTest, 
            long duration, String name, long timeCount)
        {
             double avg = sum / nTest;
             System.out.println(name + " your average is " + avg);
             sum = 0.0;
             
             if(avg >= 90.0)
                 System.out.println("You receive an A");
             else if(avg >= 80.0)
                 System.out.println("You receive a B");
             else if(avg >= 70.0)
                 System.out.println("You recieve a C");
             else if(avg >= 60.0)
                 System.out.println("You receive a D");
             else if(avg <= 59.9)
                 System.out.println("You receive an F");
             
             duration = System.currentTimeMillis() - timeCount;
             System.out.printf("Time for code execution: %.2f\n", duration / 1000.0);
             return 0;
         }
    
}
