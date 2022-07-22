package com.codegym.ss7_c0222g1.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class MusicDto {

    private Integer id;

    @Pattern(regexp = "^[a-zA-Z0-9]{1,800}$",message = "No special characters and number of characters bigger than 0 lower than 800")
    private String nameMusic;

    @Pattern(regexp = "^[a-zA-Z0-9]{1,300}$",message = "No special characters and number of characters bigger than 0 lower than 300")
    private String nameArtist;

    @Pattern(regexp = "^[a-zA-Z0-9,]{1,1000}$",message = "No special characters and number of characters bigger than 0 lower than 1000")
    private String type;

    @NotBlank(message = "Can't blank or empty")
    private String url;

    public MusicDto() {
    }

    public MusicDto(Integer id, String nameMusic, String nameArtist, String type, String url) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.nameArtist = nameArtist;
        this.type = type;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
