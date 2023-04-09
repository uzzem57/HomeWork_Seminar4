package ru.gb.oseminar.data;

import ru.gb.oseminar.view.StudentView;
import ru.gb.oseminar.view.TeacherView;

import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;


public class Teacher extends User{

    private static Long teacherId;


    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }


    public static Long getTeacherId() {

        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
    Logger logger = Logger.getLogger(TeacherView.class.getName());
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher user: teachers){
            logger.info(user.toString());
        }
    }
}
