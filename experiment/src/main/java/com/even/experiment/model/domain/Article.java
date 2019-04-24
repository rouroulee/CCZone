package com.even.experiment.model.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author :liyanwei
 * @date :2019-04-24 16:50
 */
@Data
@Builder
public class Article {

    private Integer id;

    private String title;

    private String author;

    private String content;

    private String fileName;

    private String state;

}
