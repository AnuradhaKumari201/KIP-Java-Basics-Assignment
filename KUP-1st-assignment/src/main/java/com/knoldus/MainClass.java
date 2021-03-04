package com.knoldus;


import java.util.*;


import java.util.stream.Collectors;



public class MainClass {

    public static void main(String[] args) {

// Condition -1
        List<Student> s = Data.studentList().stream().filter(obj -> obj.getSubject().isEmpty())
                .collect(Collectors.toList());

        List<String> names = new ArrayList<>();

        for (Student t : s) {

            names.add(t.getName());

        }
        System.out.println(" The students associated with a room that have no subjects =" + names);


// Condition -2

        List<List<Student>> t = Data.classList().stream().filter(obj -> obj.getRoomId().equals("xyz")).map(k -> k.getStudentList().get()).collect(Collectors.toList());

        List<List<String>> l = t.get(0).stream().map(a -> a.getSubject().get()).collect(Collectors.toList());

        Set<String> set = l.
                stream().flatMap(j -> j.stream()).collect(Collectors.toSet());

        System.out.println("List of unique subjects of the students that has  roomID  \"XYZ\". " + set);


//Condition -3

        List<ClassRoom> res = Data.classList().stream().filter(obj -> obj.getStudentList().isPresent())
                .collect(Collectors.toList());

        res.forEach(obj -> System.out.println(obj.getRoomId() + " --->  Hello Student"));

    }
}
