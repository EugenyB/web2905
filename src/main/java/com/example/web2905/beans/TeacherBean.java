package com.example.web2905.beans;

import com.example.web2905.dao.TeacherDao;
import com.example.web2905.entities.Teacher;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named
@SessionScoped
public class TeacherBean implements Serializable {
    @Getter
    @Setter
    private Teacher teacher = new Teacher();

    @EJB
    private TeacherDao teacherDao;

    public String courses(int tId) {
        teacher = teacherDao.find(tId);
        return "courses_for_teacher";
    }
}
