package com.spring.news.service;

import com.spring.news.dto.NewsFormForCreating;
import com.spring.news.entity.News;

import java.util.List;

public interface INewsService {

//    List<News> getAllNewss();

    void createNews(NewsFormForCreating form);

}
