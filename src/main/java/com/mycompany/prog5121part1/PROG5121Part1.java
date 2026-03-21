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
                
    }
      
    //check if user name is valid 
    public static boolean checkUsername(String username){
  
        if (username.length()<=5&&username.contains("_"))
        {
            System.out.println("Username successfully captured");
            return true;
        }
        else
        {
            System.out.println("Username is not correctly formatted");
            return false;
        }
    }//end of checkUsername()
    
    //check if password is valid
    public static boolean checkPasswordCompexity(String Password)
    {              
        
        if (Password.length()<=8&&Password.matches(".*[^A-Za-z0-9 ].*")&&Password.matches(".*\\d.*")&&Password.matches(".*[A-Z].*"))
        {
            System.out.println("You have success");
            return true;
        }  
        else
        {
            System.out.println("Incorrect");
            return false;
        }
    }//end of checkPasswordCompexity
}
        
        
 

     

