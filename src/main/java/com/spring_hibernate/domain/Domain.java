package com.spring_hibernate.domain;

import com.spring_hibernate.configuration.AppConfig;
import com.spring_hibernate.entity.Author;
import com.spring_hibernate.entity.MP3;
import com.spring_hibernate.repository.AuthorRepository;
import com.spring_hibernate.repository.MP3Repository;
import com.spring_hibernate.service.MP3Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

public class Domain {

    public static void main(String[] args) {

        Author author = new Author(1l, "Travis Scot", null);

        MP3 mp31 = new MP3(1l, "my mp3", author);
        MP3 mp32 = new MP3(2l, "your mp3", author);
        MP3 mp33 = new MP3(3l, "his mp3", author);

        List<MP3> mp3List = Arrays.asList(mp31, mp32, mp33);

        author.setMp3List(mp3List);

        MP3Service mp3Service = new MP3Service();

        mp3Service.insertMP3(mp31);

//        System.out.println(mp3Repository.findMP3ByAuthor("travis"));
    }
}
