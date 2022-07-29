package com.codegym.ss7_c0222g1.controller;


import com.codegym.ss7_c0222g1.model.Blog;
import com.codegym.ss7_c0222g1.service.IBlogService;
import com.codegym.ss7_c0222g1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ajax")
public class AjaxController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/list/{size}")
    public ResponseEntity<?> index(@RequestParam(name = "page", defaultValue = "0") int page,@PathVariable(name="size") int size) {
        Sort sort = Sort.by("create_day").ascending().and(Sort.by("blog_title"));
        Page<Blog> blogList = iBlogService.findAll(PageRequest.of(page, size, sort));
        return new ResponseEntity<>(blogList.getContent(), HttpStatus.OK);
    }

    @GetMapping("/search/{titleSearch}")
    public ResponseEntity<?> index(@PathVariable(name = "titleSearch") String titleSearch) {
        List<Blog> blogList = iBlogService.findAllTitle(titleSearch);
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
}
