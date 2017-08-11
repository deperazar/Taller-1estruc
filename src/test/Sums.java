/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Usuario
 */
import java.util.*;

public class Sums {
    public static void main(String[] args ){
        
        double k;
        String a;
        Scanner lect0= new Scanner(System.in);
        a=lect0.nextLine();
        
  
        int i=0;
        System.out.println((int) a.charAt(0));

        //Lo de arriba devuelve tu 104...

        int c = 0;
        for (i = 0; i < a.length(); i++) {
        c += (int)a.charAt(i);
        }
        System.out.println(c-(96*i));
    }
    
}
