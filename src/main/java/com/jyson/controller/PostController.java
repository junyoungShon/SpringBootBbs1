package com.jyson.controller;

import com.jyson.entity.Post;
import com.jyson.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jyson on 2016. 7. 4..
 */
@Controller
@RequestMapping("post")
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/write")
    public String write(Post post){
        return "redirect:/post/"+postService.write(post);
    }
    @RequestMapping("/writePage")
    public String writePage(Post post){
        return "writePage";
    }
    @RequestMapping("/list")
    public ModelAndView list(ModelAndView model){
        List<Post> postList = postService.getPostList();
        model.addObject("postList",postList);
        model.setViewName("index");
        return model;
    }

    @RequestMapping("/{id}")
    public ModelAndView viewDetail(ModelAndView modelAndView, @PathVariable int id){
        Post post = postService.getPostDetail(id);
        modelAndView.addObject("postDetail",post);
        modelAndView.setViewName("post");
        return modelAndView;
    }


}
