package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.services.GameService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/games")
public class GameController {
    
    // |=======| GAME SERVICE |=======|
    @Autowired
    private GameService gameService;

    // |=======| PEGANDO TODOS OS GAMES |=======|
    @GetMapping
    public List<GameMinDto> findAll(){
        return gameService.findAll();
    }

    // |=======| DETALHANDO UM GAME |=======|
    @GetMapping(value = "/{id}")
    public GameDto EncontrarGame(@PathVariable Long id){
        return gameService.findById(id);
    }
}
