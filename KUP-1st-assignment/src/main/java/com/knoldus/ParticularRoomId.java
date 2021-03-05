package com.knoldus;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ParticularRoomId{

    public String condition2()
    {
        List<List<Student>> t=Data.classList().stream().filter(obj->obj.getRoomId().equals("xyz")).map(k->k.getStudentList().get()).collect(Collectors.toList());

        List<List<String>> l=t.get(0).stream().map(a->a.getSubject().get()).collect(Collectors.toList());

        Set<String> set = l.
                stream().flatMap(j -> j.stream()).collect(Collectors.toSet());

        return "List of unique subjects of the students that has  roomID  \"XYZ\". "+set;
    }
}
