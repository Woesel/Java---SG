/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.sakiladao.dao;

import com.tenzin.sakiladao.dto.Film;
import java.util.List;

/**
 *
 * @author ttibe
 */
public interface FilmDao {
    
    public Film createFilm(Film actor);

    public List<Film> readAll();

    public Film readById(int filmId);

    public void delete(Film film);
    
    public List<Film> getFilmsByFilm(Film film);
    
}
