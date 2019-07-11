package com.spring_hibernate.repository;

import com.spring_hibernate.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("authorRep")
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
