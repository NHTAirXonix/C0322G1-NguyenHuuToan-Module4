package main.service;

import main.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    void save(Music music);
    Music findById(int id);
    void update(int id, Music music);
    void remove(Music music);
    List<Music> searchByName(Music music);
}
