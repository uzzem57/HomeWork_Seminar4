package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements TeacherViewInterface {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher user: teachers){
            logger.info(user.toString());
        }
    }
}
