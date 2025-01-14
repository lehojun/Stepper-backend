package com.example.stepperbackend.domain;

import com.example.stepperbackend.domain.common.BaseEntity;
import com.example.stepperbackend.domain.mapping.Badge;
import com.example.stepperbackend.domain.mapping.Scrap;
import com.example.stepperbackend.domain.mapping.Likes;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.util.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicUpdate
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String nickName;

    private String email;

    @Setter
    private String password;

    private String profileImage;

    private Long height;

    private Long weight;

    private boolean communityAlarm;

    private boolean exerciseAlarm;

    private boolean emailAgree;

    private boolean useAgree;

    private boolean perAgree;

    @Getter
    @Setter
    private String firebaseToken;

    //private LocalDate createdAt;
    //private LocalDate updatedAt;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MoreExercise> moreExerciseList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MyExercise> myExerciseList = new ArrayList<>();

  
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Badge> bageList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<ExerciseCard> exerciseCardList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<RateDiary> rateDiaryList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Likes> likesList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Scrap> scrapList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Scrap> commentList = new ArrayList<>();

}
