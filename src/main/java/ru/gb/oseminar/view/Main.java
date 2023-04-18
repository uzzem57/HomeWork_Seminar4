package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.UserComparator;
import java.time.LocalDate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Teacher teacher1 = new Teacher("teacher1", "teacher1","teacher1",now);
        Teacher teacher2 = new Teacher("teacher2", "teacher2","teacher2",now);
        UserComparator <Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1,teacher2));


        TeacherView teacher3 = new TeacherView();
        teacher3.sendOnConsole(List.of(new Teacher("teacher3","teacher3","teacher3",now)));



    }
}
