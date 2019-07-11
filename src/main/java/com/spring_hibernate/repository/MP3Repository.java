package com.spring_hibernate.repository;

import com.spring_hibernate.entity.MP3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("mp3Rep")
public interface MP3Repository extends JpaRepository<MP3, Long> {

//    @Query(value = "select * from mp3 where author=?1", nativeQuery = true)
//    MP3 findMP3ByAuthor(String author);

    MP3 findMP3ByName(String name);

}
