package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDto {
    
    // |=======| ATRIBUTOS |=======|
    Long id;
    String name;

    // |=======| CONSTRUTORES |=======|
    public GameListDto(){
    }

    public GameListDto(GameList entity){
        this.id   = entity.getId();
        this.name = entity.getName();
    }

    // |=======| MÉTODOS GETS |=======|
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
}
