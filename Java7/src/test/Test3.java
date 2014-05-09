/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author rverbelchuk
 */
public class Test3 {
    public static void main(String arg[]){
        boolean b1 = true;
        boolean b2 = false;
        
        if (b1^b2)
            System.out.println(1^-1);
        else 
            System.out.println(1^1);
    }
}

