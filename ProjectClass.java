/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author Legion
 */
public class ProjectClass {
    Integer instanceVariable;
    static Integer sataticVariable=30;
    private synchronized void nonStaticTest(){
        Integer locaIVariable=20;
        System.out.println("Non static method");
    }
     static void staticTest(){
        System.out.println("static method");
    }
    public static void main(String[] args) {
        ProjectClass project1 = new ProjectClass();
        project1.instanceVariable=40;
        ProjectClass project2 = new ProjectClass();
        project2.instanceVariable=50;
        
        ProjectClass.sataticVariable=100;
        
        System.out.println("Hello  World");
        project1.nonStaticTest();
        staticTest();
    }
    
}
