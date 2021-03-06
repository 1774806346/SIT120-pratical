package com.datealive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CateGory
 * @Description: TODO
 * @author: zt
 * @date: 2021/1/31  20:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CateGory {

    private Integer category_id;
    private String category_name;

    /**
     * 该分类下的所有文章
     */
    private List<BlogArticle> blogs=new ArrayList<>();

}
