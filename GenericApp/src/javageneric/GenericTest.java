/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javageneric;

import javax.swing.JButton;

/**
 *
 * @author user
 */
public class GenericTest {

    public static void main(String[] args) {
        Generic<JButton> iOb = new Generic<>(new JButton("OK"));
        iOb.showType();
//        int v = iOb.getob();
//        System.out.println("value : " + v);
//        System.out.println();
//        MyGeneric<String> strOb = new MyGeneric<>("Generic Test");
//        String v2 = strOb.getob();
//        strOb.showType();
//        System.out.println("value: " + v2);
//        System.out.println();
//Integer i = (Integer) strOb.getob();
//Error: cannot cast from String to Integer
    }
}
