package com.ll.exam.article.controller;

import com.ll.exam.annotation.Controller;
import com.ll.exam.annotation.GetMapping;

@Controller // 아래 aticleController 클래스는 Controller 이다.
public class ArticleController {
    @GetMapping("/usr/article/list")
    // 아래 showList 는 Get /usr/article/list 으로 요청이 왔을 때 실행 되어야 하는 함수이다.
    public void showList() {

    }
}
