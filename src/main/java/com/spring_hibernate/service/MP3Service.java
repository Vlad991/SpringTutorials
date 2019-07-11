package com.spring_hibernate.service;

import com.spring_hibernate.configuration.AppConfig;
import com.spring_hibernate.entity.Author;
import com.spring_hibernate.entity.MP3;
import com.spring_hibernate.repository.AuthorRepository;
import com.spring_hibernate.repository.MP3Repository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class MP3Service {

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true, timeout = 500, rollbackFor = TransactionException.class)
    public void insertMP3(MP3 mp3) {
        insertAuthor(mp3.getAuthor());

        MP3Repository mp3Repository = getContext().getBean("mp3Rep", MP3Repository.class);
        mp3Repository.save(mp3);
    }

    @Transactional(propagation = Propagation.MANDATORY, isolation = Isolation.SERIALIZABLE)
    public void insertAuthor(Author author) {
        AuthorRepository authorRepository = getContext().getBean("authorRep", AuthorRepository.class);
        authorRepository.save(author);
    }

    public AnnotationConfigApplicationContext getContext() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        return context;
    }
}
