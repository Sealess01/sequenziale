/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241119_4id_bolivar_minuscolo.app;
import java.util.Scanner;
/**
 *
 * @author ospite
 */
public class minuscolo {
    
    static final int TANTI = 30;
    private String parola;
   
    
    char[] minuscolo = new char[TANTI];
     
     
     
    public void getscannerutente(){
        
        Scanner in = new Scanner(System.in);
       
        System.out.print("\nInserisci una parola :");
     
        parola = in.next();
        
        
    }
    
    
        public void array(){
           
            for(int i = 0; i < parola.length(); i++){
                
                minuscolo[i] = parola.charAt(i);
                
            }
                 for(int x=0; x<parola.length(); x++){
                     
               minuscolo[x] = Character.toLowerCase(minuscolo[x]);
                
                 
                 
                 }
    
            }    
                
                public void stampa(){
                    
                    System.out.print("La parola in minuscolo (array):");
            
        
        for(int x=0; x< minuscolo.length; x++){
            
            System.out.print(""+ minuscolo[x]);
        }
        
        String parolaMinu =new String(minuscolo);
        System.out.print("\nLa parola in minuscolo (oggetto:");
        System.out.println(parolaMinu);
        
                    
                    
                }
                
                
                
            
            
            
        }
        
        
 
        
    
    
     

