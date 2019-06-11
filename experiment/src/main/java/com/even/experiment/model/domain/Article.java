package com.even.experiment.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :liyanwei
 * @date :2019-04-24 16:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article implements Comparable<Article>{

//    private Integer id;

    private String title;

//    private String author;
//
//    private String content;
//
//    private String fileName;

//    private String state;

    private Integer version;

    @Override
    public int compareTo(Article o) {
        if (this.version == null) {this.version =0;}
        if (o.version == null) {o.version =0;}
        return (this.version < o.version) ? 1 : ((this.version.equals(o.version)) ? 0 : -1) ;
    }
}
