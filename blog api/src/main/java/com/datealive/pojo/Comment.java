package com.datealive.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: Comment
 * @Description: TODO
 * @author: zt
 * @date: 2021/1/31  20:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Integer comment_id;
    private String content;
    private Integer blog_id;
    private String nick_name;
    private String avatar;
    private String email;
    private String reply_nick_name;
    private Integer pid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date create_time;
    private String site_url;
    private Integer page;
    private Integer is_check;

    private List<Comment> replyComments=new ArrayList<>();
}
