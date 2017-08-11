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
public class Test {
    private int a;
    private int b;
    
    public int Add(){
        return a+b;
    }
        
    public static void main(String[] args){
        Adder a;
        a.Add();
    }
    
}class Adder extends Test{
    public void Adder(){
        this.a=a;
        this.b=b;
    }
}
    
