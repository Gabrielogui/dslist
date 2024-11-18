package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

public class GameDto {
   
    // |=======| ATRIBUTOS |=======|
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    // |=======| CONSTRUTORES |=======|
    public GameDto(){
    }

    public GameDto(Game entity){
        BeanUtils.copyProperties(entity, this);
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
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // PLATAFORMA:
    public String getPlatforms() {
        return platforms;
    }
    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    // SCORE:
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    // URL DA IMAGEM:
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    // DESCIÇÃO CURTA:
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
