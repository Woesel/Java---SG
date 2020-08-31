/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.sakiladao.dao;

import com.tenzin.sakiladao.App.TestApplicationConfiguration;
import com.tenzin.sakiladao.dto.Actor;
import com.tenzin.sakiladao.dto.Film;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author ttibe
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplicationConfiguration.class)
public class ActorDaoImplTest {

    @Autowired
    ActorDao aDao;

    public ActorDaoImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddGetAll() {

        Actor actor = new Actor();
        
        actor.setActorId(1);
        actor.setFirstName("Tenzin");
        actor.setLastName("Me");
        actor.setLastUpdate(LocalDateTime.MAX);
        
        
        aDao.createActor(actor);
        
        Actor actor1 = new Actor();
        
        actor1.setActorId(1);
        actor1.setFirstName("Tenzin");
        actor1.setLastName("Me");
        actor1.setLastUpdate(LocalDateTime.MAX);
        
        
        aDao.createActor(actor1);
        
        
        Film film = new Film();
        
        film.setTitle("Hey It's ME");
        film.setFilmId(1);
        film.setDescription("Blah blah blah blah");
        film.setLastUpdate(LocalDateTime.MAX);
        film.setReleaseYear(12312020);
        
        List<Actor> fromDao = aDao.getActorsForFilm(film);

    }

}
