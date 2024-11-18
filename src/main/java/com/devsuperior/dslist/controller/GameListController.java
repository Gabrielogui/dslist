package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.dto.ReplacementDto;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    // |=======| GAME LIST SERVICE |=======|
    @Autowired
    private GameListService gameListService;

    // |=======| GAME SERVICE |=======|
    @Autowired
    private GameService gameService;

    // |=======| MÉTODOS |=======|
    // FIND ALL: PEGAR TODOS OS GAMES  
    @GetMapping
    public List<GameListDto> findAll(){
        return gameListService.findAll();
    }

    // FIND BY LIST: ENCONTRAR O GAME POR ID
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId){
        return gameService.findByList(listId); 
    }

    // MOVIMENANDO A LISTA
    @PostMapping(value = "/{listId}/raplacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDto body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
