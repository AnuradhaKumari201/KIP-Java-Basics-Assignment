package com.knoldus;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class NoSubjects{

    public String condition(){
        List<Student> s = Data.studentList().stream().filter(obj -> obj.getSubject().isEmpty())
                .collect(Collectors.toList());

        List<String> names = new ArrayList<>();

        for (Student t : s) {

            names.add(t.getName());

        }
        return " The students associated with a room that have no subjects =" + names;
    }

}
    

