package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    // |=======| CONSULTA SQL PARA ATUALIZAR A TABELA APÓS MOVIMENTO |=======|
    @Modifying
    @Query(nativeQuery = true,
        value = "UPDATE tb_belonging SET position = :newPosition WHERE list_Id = :listId AND game_Id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
