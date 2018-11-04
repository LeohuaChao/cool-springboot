package me.leohuachao;

import me.leohuachao.domain.Author;
import me.leohuachao.service.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class JdbcTest {

    @Resource
    private AuthorService authorService;

    @Test
    public void test() {
        List<Author> result = authorService.findAll();
        for (Author author : result) {
            System.out.println(author);
        }
    }
}
