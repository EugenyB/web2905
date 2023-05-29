package com.example.web2905.beans;

import com.example.web2905.dao.KafedraDao;
import com.example.web2905.entities.Kafedra;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class KafedraBean implements Serializable {

    @EJB
    private KafedraDao kafedraDao;

    @Getter
    private Kafedra kafedra;

    public List<Kafedra> getKafedraList() {
        return kafedraDao.findAll();
    }

    public String showTeachers(int id) {
        kafedra = kafedraDao.find(id);
        return "teachers_of_kafedra";
    }
}
