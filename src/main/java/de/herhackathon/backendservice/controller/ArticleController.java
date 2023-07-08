package de.herhackathon.backendservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController(value = "Article Controller")
@RequestMapping("/api/rest/v1/articles")
public class ArticleController {


}
