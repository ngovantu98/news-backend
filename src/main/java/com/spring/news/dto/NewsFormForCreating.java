package com.spring.news.dto;

import com.spring.news.entity.News;
import lombok.Data;
import java.util.Date;

@Data

public class NewsFormForCreating {
    private short id;
    private String name;
    private String content;
    private String header;
    private String view;
    private String image;
    private Date date;

    public News toEntity() {
        return new News(id, name, content, header, view, image, date);
    }
}
