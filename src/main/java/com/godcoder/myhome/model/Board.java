package com.godcoder.myhome.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity // 이 클래스가 데이터베이스 연동을 위한 model 클래스임을 알려주기 위해 annotation 추가
@Data // data annotation을 통해서 나중에 외부에서 해당 클래스를 꺼내쓸 수 있음.
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 2,max = 30, message = "제목은 2자 이상 30자 이하 입니다.")
    private String title;
    private String content;
}
