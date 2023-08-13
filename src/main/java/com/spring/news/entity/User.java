package com.spring.news.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "`User`")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "`address`", length = 500)
    private String address;

    //Nội dung
    @Column(name = "`email`", length = 500)
    private String email;

    //Tiêu đề
    @Column(name = "`password`", length = 500)
    private String header;

    @Column(name = "`role`", length = 500)
    private String role;
}
