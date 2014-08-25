/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldrngstff;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class HelloWorldRngStff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        welcome();
        plusleg();
        
        
    }
    
     static void welcome(){
         
         System.out.println("Hej og velkommen");
         System.out.println("Du skal nu spille et lille plus spil");
     }
    
     static void plusleg(){
         
         boolean game = true;
         boolean keepask = true;
         int a;
         int b;
         int svar;
         String indtast;
         
         
         while (game){
         
            a = 0 + (int)(Math.random()*100); 
            b = 0 + (int)(Math.random()*100);
            
             System.out.println("Hvad er "+a+"+"+b+"?");
             Scanner scan = new Scanner(System.in);
             System.out.println("Indtast dit tal, og afslut med enter");
             
            svar = scan.nextInt();
            
            if (svar==(a+b))
            {
                System.out.println("Korrekt");
            
            }
            else 
            {     System.out.println("forkert");
            
            }
            
            
            
            
                
            
             System.out.println("Vil du prøve igen?");
             System.out.println("y/n");
             System.out.println("Indtast dit svar, og afslut med enter");
             Scanner scan1 = new Scanner(System.in);
             indtast = scan1.nextLine();
             
            
             
             if(indtast.equals("y"))
             {
                 game = true;
                 
             }
             if(indtast.equals("n"))
             {
                 game = false;
                 System.out.println("Spillet er slut");
                
             }
             if(!indtast.equals("y") && !indtast.equals("n"))
                     {
                         System.out.println("Du kan ikke ramme, du får en ekstra omgang");
                         game = true;
                         
                     }
            
         }
             
             
     }
}
