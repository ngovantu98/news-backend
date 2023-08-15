package com.spring.news.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "`News`")
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;

    @Column(name = "`name`", length = 500)
    private String name;

    //Nội dung
    @Column(name = "`content`", length = 500)
    private String content;

    //Tiêu đề
    @Column(name = "`header`", length = 500)
    private String header;

    @Column(name = "`view`", length = 500)
    private String view;

    @Column(name = "`image`", length = 500)
    private String image;

    @Column(name = "`date`")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;

    public News(short id, String name, String content, String header, String view, String image, Date date) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.header = header;
        this.view = view;
        this.image = image;
        this.date = date;

    }

    public News() {
    }
}







