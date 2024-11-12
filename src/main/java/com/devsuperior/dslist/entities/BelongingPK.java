package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
    
    // |=======| ATRIBUTOS |=======|
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;
    
    // |=======| CONSTRUTORES |=======|
    public BelongingPK(){
    }

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    // |=======| MÉTODOS GETS E SETS |=======|
    // GAME:
    public Game getGame() {
        return game;
    }
    public void setGame(Game game) {
        this.game = game;
    }

    // GAMELIST:
    public GameList getList() {
        return list;
    }
    public void setList(GameList list) {
        this.list = list;
    }

    
}
