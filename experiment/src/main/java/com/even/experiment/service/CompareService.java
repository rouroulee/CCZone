package com.even.experiment.service;

import com.even.experiment.model.domain.Article;
import org.springframework.stereotype.Component;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * @author :liyanwei
 * @date :2019-05-27 11:08
 */
@Component
public class CompareService {

    public LinkedList<Article> compare(List<Article> articles){
        LinkedList<Article> result = new LinkedList<>();
        List<Article> articels = new ArrayList<>();
        articels.add(Article.builder().title("null").version(null).build());
        articels.add(Article.builder().title("3.2").version(1).build());
        articels.add(Article.builder().title("3.3").version(2).build());
        articels.add(Article.builder().title("4.0").version(10).build());
        articels.add(Article.builder().title("4.0null").version(null).build());

        articels.forEach(
                article -> {
                    System.out.println(article.getTitle());
                    result.add(article);
                }
        );
        return result;
    }
}
