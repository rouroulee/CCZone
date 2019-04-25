package com.even.experiment.repositries;

import com.even.experiment.model.domain.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author :liyanwei
 * @date :2019-04-25 14:20
 */
public interface ArticleRepository extends MongoRepository<Article,String>{

}
