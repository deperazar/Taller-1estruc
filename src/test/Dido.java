/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

public class Dido {
      
    public static void main(String[] args) {
        
        int N,Q,Num,Ntimes;
        String numbers;
     
        Scanner lec0 = new Scanner (System.in);
        N = lec0.nextInt();        
        
        int[] num=new int[N];
        
        Scanner lec1 = new Scanner (System.in);
        numbers = lec1.nextLine();
        String[] parts = numbers.split(" ");
        if(parts.length>N){
            System.out.println("Error");
            System.exit(0);
        }   
        Scanner lec2 = new Scanner (System.in);
        Q = lec2.nextInt();        
        
        for (int i = 0; i < parts.length; i++) {
            num[i]=Integer.parseInt(parts[i]);
        }
        do{
            Ntimes=0;
            Scanner lect3 = new Scanner(System.in) ;
            Num = lect3.nextInt();        
            for (int i = 0; i < num.length; i++) {
                if(num[i]==Num){
                    Ntimes+=1;
                }
            }
            if(Ntimes==0){
                System.out.println("NOT PRESENT");
               
            }else{
                System.out.println(Ntimes);
            }
            Q=Q-1;
        }while(Q>0);          
    }
}