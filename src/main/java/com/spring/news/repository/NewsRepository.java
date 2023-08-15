package com.spring.news.repository;

import com.spring.news.entity.News;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NewsRepository extends JpaRepository<News, Short>, JpaSpecificationExecutor<News> {


    List<News> findByName(String name);

//    List<News> findByNewsId(short id);

    //public boolean existsByName(String name);

    public void deleteByIdIn(List<Short> ids);

}