package com.even.experiment.mappers;

import com.even.experiment.model.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author :liyanwei
 * @date :2019-04-24 16:49
 */
@Mapper
public interface ArticleMapper {

    /**
     * fetch data by rule id
     *
     * @param id rule id
     * @param title page number
     * @param article json format context
     * @return 1
     */
    Integer addArticle(Article article);

    /**
     * query
     * @param id key
     * @return
     */
    Article selectByIdOne(@Param("id") Integer id);

}
