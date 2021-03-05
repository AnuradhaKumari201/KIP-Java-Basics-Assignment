package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class HasStudent {
    public void condition3() {

//code application logic here

        List<ClassRoom> res = Data.classList().stream().filter(obj -> obj.getStudentList().isPresent())
                .collect(Collectors.toList());


        res.forEach(obj -> System.out.println(obj.getRoomId() + " --->  Hello Student"));
    }
}
