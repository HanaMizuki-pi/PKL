/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author Legion
 */
public class Calculator {
        public Integer add (Integer arg1, Integer arg2){
        Integer result= arg1+arg2;
        return result;
    }
    public static void main(String[] args) {
        Calculator cal= new Calculator();
        Integer result=cal.add(10,30);
        System.out.println("Printing arg1 bea");
        System.out.println("Result of addition is "+result);
    }
}
