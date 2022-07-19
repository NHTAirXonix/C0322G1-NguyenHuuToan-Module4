package main.repository.impl;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import main.model.Music;
import main.repository.BaseRepository;
import main.repository.IMusicRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.swing.text.html.parser.Entity;

@Repository
public class MusicRepositoryImpl implements IMusicRepository {

    @Override
    public List<Music> findAll() {
        String select = "SELECT m from music m";
        List<Music> musicList = BaseRepository.entityManager.createQuery(select, Music.class).getResultList();
        return musicList;
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(music);
        entityTransaction.commit();
    }

    @Override
    public Music findById(int id) {
        String select = "SELECT m from music m";
        List<Music> musicList = BaseRepository.entityManager.createQuery(select, Music.class).getResultList();
        for (int i = 0; i < musicList.size(); i++) {
            if (id == musicList.get(i).getId()) {
                return musicList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Music music) {
        String select = "SELECT m from music m";
        List<Music> musicList = BaseRepository.entityManager.createQuery(select, Music.class).getResultList();
        for (int i = 0; i < musicList.size(); i++) {
            if (id == musicList.get(i).getId()) {
                musicList.get(i).setNameArtist(music.getNameArtist());
                musicList.get(i).setNameMusic(music.getNameMusic());
                musicList.get(i).setType(music.getType());
                musicList.get(i).setUrl(music.getUrl());
            }
        }
    }

    @Override
    public void remove(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(this.findById(music.getId()));
        entityTransaction.commit();
    }

    @Override
    public List<Music> searchByName(Music music) {
        List<Music> musicListSearch = new ArrayList<>();
        String select = "SELECT m from music m";
        List<Music> musicList = BaseRepository.entityManager.createQuery(select, Music.class).getResultList();
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getNameMusic().contains(music.getNameMusic())) {
                musicListSearch.add(musicList.get(i));
            }
        }
        return musicListSearch;
    }
}
