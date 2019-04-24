package com.even.experiment.service;

import com.even.experiment.mappers.ArticleMapper;
import com.even.experiment.model.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author :liyanwei
 * @date :2019-04-24 17:06
 */
@Component
@CacheConfig(cacheNames = "articleCache")
public class ArticleService {

    private AtomicInteger count =new AtomicInteger(0);


    @Autowired
    private ArticleMapper articleMapper;

    @CachePut
    public Integer addArticle(Article article){
        return articleMapper.addArticle(article);
    }

    @Cacheable(key = "#id",unless = "#result.state=='0'")
    public Article selectArticleByIdOne(Integer id){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("id = [" + id + "]");
        System.out.println("query count = [" + count.incrementAndGet() + " 次 ]");
        return articleMapper.selectByIdOne(id);
    }

}
