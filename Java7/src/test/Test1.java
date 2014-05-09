/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import javax.sound.midi.SysexMessage;

/**
 *
 * @author rverbelchuk
 */

class A{
        A(int a){ System.out.println("Inside A");}

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Test1 extends A {
    public static void main(String arg[]){
       A a= new Test1(1);
       a.print();
       }

    public Test1(int a) {
        super(a);
    }


    void print(){
        System.out.println("Inside B");
    }
}


