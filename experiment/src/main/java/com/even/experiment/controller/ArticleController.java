package com.even.experiment.controller;

import com.even.experiment.model.domain.Article;
import com.even.experiment.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author :liyanwei
 * @date :2019-04-24 17:11
 */
@RestController
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("article/{id}")
    public String findArticleById(@PathVariable Integer id){
        return articleService.selectArticleByIdOne(id).toString();
    }

    @PostMapping("article/add")
    @ResponseBody
    public Integer addArticle(@RequestBody Article article){
        return articleService.addArticle(article);
    }

}
