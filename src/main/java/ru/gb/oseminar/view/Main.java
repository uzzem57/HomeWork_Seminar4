package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.UserComparator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacher1", "teacher1","teacher1","data1");
        Teacher teacher2 = new Teacher("teacher2", "teacher2","teacher2","data2");
        UserComparator <Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1,teacher2));


        TeacherView teacher3 = new TeacherView();
        teacher3.sendOnConsole(List.of(new Teacher("teacher3","teacher3","teacher3","data3")));



    }
}
