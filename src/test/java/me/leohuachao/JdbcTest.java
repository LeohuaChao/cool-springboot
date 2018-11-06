package me.leohuachao;

import me.leohuachao.dao.AuthorDao;
import me.leohuachao.domain.Author;
import me.leohuachao.service.AuthorService;
import me.leohuachao.service.AuthorService2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
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
    private AuthorService2 authorService;

//    @Autowired
//    private AuthorDao dao;

    @Autowired
    ApplicationContext context;

//    @Test
//    public void test() {
//        List<Author> result = authorService.findAll();
//        for (Author author : result) {
//            System.out.println(author);
//        }
//    }

    @Test
    public void test1() {
        Author author = new Author();
        author.setNickName("aa");
        author.setRealName("b12344b");
        Assert.assertEquals(authorService.add(author), 1);
    }

    @Test
    public void test2() {
        //String[] rr =  context.getBeanNamesForType(AuthorDao.class);
        Author author = new Author();
        author.setNickName("aa");
        author.setRealName("b12344b");


//        Assert.assertEquals(dao.add(author), 1);
    }
}
