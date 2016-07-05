package com.jyson.dao;

import com.jyson.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jyson on 2016. 7. 4..
 */
public interface PostDao extends JpaRepository<Post,Integer> {

}
