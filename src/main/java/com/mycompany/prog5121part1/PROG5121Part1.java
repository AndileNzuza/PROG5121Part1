/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121part1;


/**
 *
 * @author Student
 */
public class PROG5121Part1{

      public static void main(String[] args) {
        String username = "And_l";
        boolean valid = checkUsername(username);
        System.out.println(valid);
        String password = "ppppkppp";
        valid = checkPasswordCompexity(password);
        System.out.println(valid);
        String cellphoneNumber = "ZA"+276990909;
        valid = checkCellphoneNumber(cellphoneNumber);
        System.out.println(valid);        
    }
      
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
    }//end of checkCellphoneNumber blessed
}
        
        
 

     

