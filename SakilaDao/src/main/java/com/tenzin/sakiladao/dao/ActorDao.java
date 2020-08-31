/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.sakiladao.dao;

import com.tenzin.sakiladao.dto.Actor;
import com.tenzin.sakiladao.dto.Film;
import java.util.List;

/**
 *
 * @author ttibe
 */
public interface ActorDao {

    public Actor createActor(Actor actor);

    public List<Actor> readAll();

    public Actor readById(int actorId);

    public void delete(Actor actor);
    
    public List<Actor> getActorsForFilm(Film film);

}
