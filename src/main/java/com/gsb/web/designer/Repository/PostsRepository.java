package com.gsb.web.designer.Repository;

import com.gsb.web.designer.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
