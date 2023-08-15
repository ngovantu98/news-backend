package com.spring.news.controller;

import com.spring.news.dto.NewsFormForCreating;
import com.spring.news.entity.News;
import com.spring.news.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/newss")
public class NewsController {

    @Autowired
    private INewsService service;

//    @GetMapping()
//    public ResponseEntity<?> getAllNewss() {
//        List<News> entities = service.getAllNewss();
//        return new ResponseEntity<>(entities, HttpStatus.OK);
//    }

    @PostMapping()
    public ResponseEntity<?> createNews(@RequestBody NewsFormForCreating form) {
        service.createNews(form);
        return new ResponseEntity<String>("Create successfully!", HttpStatus.OK);
    }

}
