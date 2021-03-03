package com.gsb.web.designer.domain.posts;


import com.gsb.web.designer.Repository.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@RunWith(SpringRunner.class)
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

//    @After
//    // Junit에서 단위 테스트가 끝날 때 마다 수행되는 메소드를 지정(한마디로 테스트 종료 후 실행되는 메소드), 보통은 전체 테스트 할 때 테스트간 데이터 침범을 막기 위해 사용, 여러 테스트가 동시에 수행되면 H2에 데이터가 그대로 남아있어 다음 테스트 실행 시 실패할 수 있음
//    public void cleanup() {
//        postsRepository.deleteAll();// postsRepository의 모든 데이터 삭제
//    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";


        postsRepository.save(Posts.builder() // 테이블 posts에 insert/update 쿼리를 실행, id값이 있으면 update 없으면 insert가 실행됨
                .title(title)
                .content(content)
                .author("jywlsh3@naver.com")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll(); // 테이블 posts에 있는 모든 데이터를 조회해옴

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
