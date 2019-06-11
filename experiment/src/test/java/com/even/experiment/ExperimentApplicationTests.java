package com.even.experiment;

import com.even.experiment.model.domain.Article;
import com.even.experiment.service.CompareService;
import javafx.util.Pair;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ExperimentApplicationTests {

    @Autowired
    CompareService compareService;


    @Test
    public void contextLoads() {

        List<Article> articles = new ArrayList<>();
        articles.add(Article.builder().title("1.1").version(1).build());
        articles.add(Article.builder().title("2.2").version(2).build());
        articles.add(Article.builder().title("4.0").version(4).build());
        articles.add(Article.builder().title("0").version(null).build());
        articles.add(Article.builder().title("3.0").version(3).build());
        articles.add(Article.builder().title("4.0null").version(null).build());
        Collections.sort(articles);
        System.out.println(articles.get(0).getTitle());
        System.out.println(articles.get(1).getTitle());
        System.out.println(articles.get(2).getTitle());
        System.out.println(articles.get(3).getTitle());
        System.out.println(articles.get(4).getTitle());
        System.out.println(articles.get(5).getTitle());


    }

    @Test
    public void trueAndTrue() {
        assert true == Boolean.TRUE.booleanValue();
    }



    @Test
    public void mapReduce(){
        List<Article> articles = new ArrayList<>();
        articles.add(Article.builder().title("2.2").version(1).build());
        articles.add(Article.builder().title("2.2").version(2).build());
        articles.add(Article.builder().title("4.0").version(4).build());
        articles.add(Article.builder().title("0").version(5).build());
        articles.add(Article.builder().title("4.0").version(3).build());
        articles.add(Article.builder().title("4.0").version(2).build());

//
//        Map<String, Integer> map = articles.stream().collect(
//                Collectors.groupingBy(this:, Collectors.summingInt(c -> 1)));
        System.out.println(articles);

    }
}
