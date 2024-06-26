package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "instructor_detail")
@NoArgsConstructor
@Getter
@Setter
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column(name = "hobby")
    private String hobby;

    @OneToOne(mappedBy = "instructorDetail", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Instructor instructor;

    public InstructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "hobby='" + hobby + '\'' +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", id=" + id +
                '}';
    }
}
