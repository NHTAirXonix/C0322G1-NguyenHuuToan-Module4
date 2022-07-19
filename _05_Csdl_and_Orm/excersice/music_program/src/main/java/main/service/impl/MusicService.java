package main.service.impl;

import main.model.Music;
import main.repository.IMusicRepository;
import main.repository.impl.MusicRepositoryImpl;
import main.service.IMusicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    private IMusicRepository iMusicRepository = new MusicRepositoryImpl();

    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        iMusicRepository.save(music);
    }

    @Override
    public Music findById(int id) {
        return iMusicRepository.findById(id);
    }

    @Override
    public void update(int id, Music music) {
        iMusicRepository.update(id,music);
    }

    @Override
    public void remove(Music music) {
        iMusicRepository.remove(music);
    }

    @Override
    public List<Music> searchByName(Music music) {
        return iMusicRepository.searchByName(music);
    }


}
