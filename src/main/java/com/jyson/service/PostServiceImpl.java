package com.jyson.service;

import com.jyson.dao.PostDao;
import com.jyson.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by jyson on 2016. 7. 4..
 */
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;


    @Override
    public int write(Post post) {
        post.setRegDate(new Date());
        return postDao.save(post).getId();
    }

    @Override
    public List<Post> getPostList() {
        return postDao.findAll();
    }

    @Override
    public Post getPostDetail(int id) {

        return postDao.findOne(id);

    }
}
