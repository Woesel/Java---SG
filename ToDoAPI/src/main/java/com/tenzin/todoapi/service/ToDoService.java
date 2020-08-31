package com.tenzin.todoapi.service;

import com.tenzin.todoapi.data.ToDoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tenzin Woesel Aug 17, 2020
 */
@Service
public class ToDoService {

    @Autowired
    private final ToDoDao dao;

    public ToDoService(ToDoDao dao) {
        this.dao = dao;
    }

}
