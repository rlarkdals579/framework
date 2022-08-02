package com.ll.exam.article.Controller;

public class Container {
    private static final ArticleController articleController;

    static {
        articleController = new ArticleController();
    }

    public static ArticleController getArticleController() {
        return articleController;
    }
}
