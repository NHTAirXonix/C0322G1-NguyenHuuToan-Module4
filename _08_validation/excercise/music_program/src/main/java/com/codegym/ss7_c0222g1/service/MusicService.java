package com.codegym.ss7_c0222g1.service;


import com.codegym.ss7_c0222g1.model.Music;
import com.codegym.ss7_c0222g1.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;


    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }

    @Override
    public Music findById(Integer id) {
        return iMusicRepository.findById2(id);
    }

    @Override
    public void update(Music music) {
        iMusicRepository.save(music);
    }
}
