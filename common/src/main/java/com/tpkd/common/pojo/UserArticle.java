package com.tpkd.common.pojo;

import java.io.Serializable;

public class UserArticle implements Serializable {
    private Integer userId;

    private Integer articleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}