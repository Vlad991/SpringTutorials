package com.spring_hibernate.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "mp3")
public class MP3 {

    @Id
    @GenericGenerator(name = "increment1", strategy = "increment")
    @GeneratedValue(generator = "increment1")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
