package me.leohuachao.service.impl;

import me.leohuachao.dao.AuthorDao;
import me.leohuachao.domain.Author;
import me.leohuachao.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/2
 */
@Service("authorService")
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao dao;

    @Override
    public int add(Author author) {
        return dao.add(author);
    }

    @Override
    public int remove(Long id) {
        return dao.remove(id);
    }

    @Override
    public int update(Author author) {
        return dao.update(author);
    }

    @Override
    public Author findAuthor(Long id) {
        return dao.findAuthor(id);
    }

    @Override
    public List<Author> findAll() {
        return dao.findAll();
    }
}
