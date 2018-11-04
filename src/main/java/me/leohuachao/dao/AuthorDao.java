package me.leohuachao.dao;

import me.leohuachao.domain.Author;

import java.util.List;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/2
 */
public interface AuthorDao {
    int add(Author author);

    int remove(Long id);

    int update(Author author);

    Author findAuthor(Long id);

    List<Author> findAll();
}
