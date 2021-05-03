package com.ITFarmerBlog.Entity;

/**
 * 文章对象
 */
public class Article {
    private int article_id;
    private int author_id;
    private String article_title;
    private String article_content;
    private String article_create_time;
    private String article_update_time;

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public String getArticle_create_time() {
        return article_create_time;
    }

    public void setArticle_create_time(String article_create_time) {
        this.article_create_time = article_create_time;
    }

    public String getArticle_update_time() {
        return article_update_time;
    }

    public void setArticle_update_time(String article_update_time) {
        this.article_update_time = article_update_time;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", author_id=" + author_id +
                ", article_title='" + article_title + '\'' +
                ", article_content='" + article_content + '\'' +
                ", article_create_time='" + article_create_time + '\'' +
                ", article_update_time='" + article_update_time + '\'' +
                '}';
    }
}
