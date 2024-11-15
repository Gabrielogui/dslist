package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameListService {
    
    // |=======| GAME LIS REPOSITORY |=======|
    @Autowired
    GameListRepository gameListRepository;

    // |=======| GAME REPOSITORY |=======|
    @Autowired
    GameRepository gameRepository;

    // |=======| MÉTODOS |=======|
    // FIND ALL:
    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }

    // MOVE: - MOVIMENTAR OS GAMES NA LISTA:
    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min, max;

        if(sourceIndex < destinationIndex){
            min = sourceIndex;
            max = destinationIndex;
        }else{
            min = destinationIndex;
            max = sourceIndex;
        }

        for(int i = min ; i <= max ; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
