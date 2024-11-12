package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
    
    // |=======| GAME REPOSITORY |=======|
    @Autowired
    private GameRepository gameRepository;

    // |=======| PEGAR O GAME QUANDO ELE FOR PEDIDO |=======|
    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDto gameDto = new GameDto(result);
        return gameDto;
    }

    // |=======| PEGAR TODOS OS GAMES |=======|
    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList(); 
        return dto;
    }
}
