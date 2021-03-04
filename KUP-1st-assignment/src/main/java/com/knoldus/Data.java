package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Data {

        Data(){


        }


    static Student student1 =
            new Student("Anuradha", 1, Optional.ofNullable(Arrays.asList("Science", "Maths")));
    static    Student student2 =
            new Student("priya", 2, Optional.ofNullable(Arrays.asList("Hindi", "English", "Maths")));
    static Student student3 =
            new Student("Rasgni", 3, Optional.ofNullable(Arrays.asList("SBT", "Maven", "Geo")));
    static Student student4 =
            new Student("Rohit", 4, Optional.ofNullable(Arrays.asList("c language")));
    static Student student5 =
            new Student("Rakhi", 5, Optional.ofNullable(Arrays.asList("cpp ", "Docker", "Java", "C")));
    static Student student6 =
            new Student("Sanjukta", 6, Optional.ofNullable(null));
    static Student student7 =
            new Student("pratibha", 7, Optional.ofNullable(null));




    public static List<Student> studentList()
    {

        List<Student> st=new ArrayList<>();
        st.add(student1);
        st.add(student2);
        st.add(student3);
        st.add(student4);
        st.add(student5);
        st.add(student6);
        st.add(student7);

        return st;
    }


    public static List<ClassRoom> classList()

    {

        ClassRoom c1 = new ClassRoom("xyz", Optional.ofNullable(Arrays.asList(student1, student2)));
        ClassRoom c2 = new ClassRoom("abc", Optional.ofNullable(Arrays.asList(student3, student4)));
        ClassRoom c3 = new ClassRoom("pqr", Optional.ofNullable(Arrays.asList(student5, student6)));
        ClassRoom c4 = new ClassRoom("klj", Optional.ofNullable(null));



        List<ClassRoom> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        return c;
    }
}
