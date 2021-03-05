package com.knoldus;

public class MainClass {

    public static void main(String[] args) {
 
        System.out.println("-----------------Condtion-1-------------------");

        NoSubjects object = new NoSubjects();
        System.out.println(object.condition());



        System.out.println("-----------------Condtion-2-------------------");

        ParticularRoomId object1 = new ParticularRoomId();

        System.out.println(object1.condition2());






        System.out.println("-----------------Condtion-3-------------------");

        HasStudent object2 = new HasStudent();
        object2.condition3();


    }

}





 