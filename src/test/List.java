/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;
/**
 *
 * @author Usuario
 */
public class List {
    public static void main(String[] args ){
        int tc, n,count;
        String numbers;
        count=0;
        Scanner lec0= new Scanner(System.in);
        tc=lec0.nextInt();
        do{
            n=0;
            Scanner lec1= new Scanner(System.in);
            n=lec1.nextInt();
            int[] num=new int[n];
            Scanner lec2 = new Scanner (System.in);
            numbers = lec2.nextLine();
            
            String[] parts = numbers.split(" ");
            for (int i = 0; i < parts.length; i++) {
                num[i]=Integer.parseInt(parts[i]);
            }
            
            for (int i = 1; i <= num.length; i++) {
                if(i==num[i-1]){
                    count+=1;
                }
            }
            System.out.println("count: "+count);
            if(count==num.length){
                System.out.println("Inverse");
            }else{
                System.out.println("Not inverse");
            }
            
            
        }while(tc>0);
        
    }
}
