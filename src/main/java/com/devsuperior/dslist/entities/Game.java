package com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {
    // |=======| ATRIBUTOS |=======|

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year")
    private Integer year;
    private String genere;
    private String plataform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    // |=======| CONSTRUTORES |=======|
    public Game(){
    }

    public Game(Long id, String title, Integer year, String genere, String plataform, String imgUrl, String shortDescription, String longDescription){
        this.id               = id;
        this.title            = title;
        this.year             = year;
        this.genere           = genere;
        this.plataform        = plataform;
        this.imgUrl           = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription  = longDescription;
    }

    // |=======| MÉTODOS GETS E SETS |=======|
    // ID:
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // TÍTULO:
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // ANO:
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    // GÊNERO:
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }

    // PLATAFORMA:
    public String getPlataform() {
        return plataform;
    }
    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    // URL DA IMAGEM:
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    // DESCRIÇÃO CURTA:
    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    // DESCRIÇÃO LONGA:
    public String getLongDescription() {
        return longDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    
}
