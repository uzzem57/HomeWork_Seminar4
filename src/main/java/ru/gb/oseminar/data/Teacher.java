package ru.gb.oseminar.data;

import ru.gb.oseminar.view.StudentView;
import ru.gb.oseminar.view.TeacherView;

import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.time.LocalDate;


public class Teacher extends User{

//    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.id = teacherId;
    }

    public Long getTeacherId() {
        return id;
    }

    public void setTeacherId(Long teacherId) {
        this.id = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + id +
                '}';
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
