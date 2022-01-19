package com.riva.odos.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")//, produces= {MediaType.APPLICATION_JSON_VALUE})
public class SearchController {
    
    @RequestMapping(value="search/", method=RequestMethod.GET)
    public String search(@RequestParam(value="searchValue") String searchValue) {
        return "Hello, World!!\n  You searched for " + searchValue;
    }
    
}
