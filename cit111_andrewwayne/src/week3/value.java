/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author andrew.wayne
 */
public class value {
    public static void main(String[] args) {
        boolean tomato = true;
        boolean ginger = false;
        int oregeno = 50;
        int fenugreek = 2; 
        if(tomato){
            oregeno = oregeno / fenugreek;
        } else {
            oregeno = fenugreek;
        }
        if(ginger && tomato){
            oregeno = oregeno * fenugreek;
        }
        ginger = !ginger;
        System.out.println("Tomato: " + tomato);
        System.out.println("Ginger: " + ginger);
        System.out.println("Oregeno: " + oregeno);
        System.out.println("Fenugreek: " + fenugreek);
        
    } // close main
} // close class

