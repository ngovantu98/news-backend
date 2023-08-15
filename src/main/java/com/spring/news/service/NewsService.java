package com.spring.news.service;

import com.spring.news.dto.NewsFormForCreating;
import com.spring.news.entity.News;
import com.spring.news.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService implements INewsService {

    @Autowired
    private NewsRepository newsRepository;

//    public List<News> getAllNewss() {
//        return newsRepository.findAll();
//    }

    public void createNews(NewsFormForCreating form) {
        newsRepository.save(form.toEntity());
    }
}
