package me.leohuachao.service.test;

import me.leohuachao.api.domain.Author;
import me.leohuachao.service.IAuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class IAuthorServiceTest {

    @Autowired
    IAuthorService service;

    @Test
    public void testFindAll() {
        List<Author> list = service.findAll();

        for (Author author : list) {
            System.out.println(author);
        }
    }
}