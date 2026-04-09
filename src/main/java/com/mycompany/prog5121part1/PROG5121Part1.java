/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121part1;

import java.util.Scanner;


/**
 *
 * @author Student
 */
public class PROG5121Part1{

      public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
    //Ask for username  
      System.out.println("Enter your username");
      String username = sc.nextLine();
    //Ask for password
      System.out.println("Enter your password");
      String password = sc.nextLine();
    //Ask for cellphone number
      System.out.println("Enter your cellphone number");
      String cellphoneNumber = sc.nextLine();
    //Confirm regitration
      System.out.println("Regitration successful");
      String registration = sc.nextLine();
    //Confirm login
      System.out.println("Login successful");
      String login = sc.nextLine();
      
      
    //check if username is valid
    public static boolean checkUsername(String username)
    {
  
        if (username.length()<=5&&username.contains("_"))
        {
            System.out.println("Username successfully captured");
            return true;
        }
        else
        {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
            return false;
        }
    }//end of checkUsername()
    
    //check if password is valid
    public static boolean checkPasswordCompexity(String password)
    {              
        
        if (password.length()<=8&&password.matches(".*[^A-Za-z0-9 ].*")&&password.matches(".*\\d.*")&&password.matches(".*[A-Z].*"))
        {
            System.out.println("Password successfully captured");
            return true;
        }  
        else
        {
            System.out.println("Password is not correctly formatted;please ensure that the password contains atleast eight characters, a capital letter, a number and a special character.");
            return false;
        }
    }//end of checkPasswordCompexity
    
    //check if cellphone number is valid
    public static boolean checkCellphoneNumber(String cellphoneNumber)
    {
        
        if(cellphoneNumber.length()<=13&&cellphoneNumber.contains("+27...."))
        {
           System.out.println("Cell phone number successfully captured");
            return true; 
        }
        else
        {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code");
            return false; 
        }
    }//end of checkCellphoneNumber 
    
    //check if registration is valid
    public static boolean checkRegistration(String registration)
    {
      return true;  
    
    }//end of registration
    
    //check if login is valid
     public static boolean checkLogin(String login)
    {
      return true;  
    
    }//end of login

}
        
        
 

     

