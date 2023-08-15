package com.spring.news.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "`Advertisement`")
public class Advertisement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "`name`", length = 500)
    private String name;

    //Nội dung
    @Column(name = "`company_name`", length = 500)
    private String company_name;

    //Tiêu đề
    @Column(name = "`image`", length = 500)
    private String image;

    @Column(name = "`contend`", length = 500)
    private String contend;

    @Column(name = "`date`")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;

}

