package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "instructor_detail")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column(name = "hobby")
    private String hobby;

    public InstructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }
}
