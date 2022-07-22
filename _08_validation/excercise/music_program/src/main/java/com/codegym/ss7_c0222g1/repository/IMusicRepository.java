package com.codegym.ss7_c0222g1.repository;



import com.codegym.ss7_c0222g1.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IMusicRepository extends JpaRepository<Music, Integer> {


//    @Query(value = "select * from music",nativeQuery = true)
//    List<Music> findAll();
//
//    @Modifying
//    @Query(value = "insert into music (name_music, name_artist, song_type, song_url) value (:name,:artist,:type, :lastName,:url)",nativeQuery = true)
//    void save(@Param("name") String name,
//              @Param("artist") String artist,
//              @Param("type") String type,
//              @Param("url") String url);
//
//
    @Query(value = "select * from music where song_id= :id", nativeQuery = true)
    Music findById2(@Param("id") int id);
//
//
//    void update(int id, Music music);
//
//
//    void remove(Music music);
//
//
//    List<Music> searchByName(Music music);

}
