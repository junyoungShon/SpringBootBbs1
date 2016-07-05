package com.jyson.service;

import com.jyson.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jyson on 2016. 7. 4..
 */
@Service
public interface PostService {

    int write(Post post);

    List<Post> getPostList();

    Post getPostDetail(int id);
}
