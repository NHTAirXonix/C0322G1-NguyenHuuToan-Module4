package com.codegym.ss7_c0222g1.service;



import com.codegym.ss7_c0222g1.model.Music;

import java.util.List;
import java.util.Optional;

public interface IMusicService {
    List<Music> findAll();

    void save(Music music);

    Music findById(Integer id);

    void update(Music music);
}
