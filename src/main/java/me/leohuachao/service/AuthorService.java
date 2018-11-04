package me.leohuachao.service;

import me.leohuachao.domain.Author;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/2
 */
public interface AuthorService {
    int add(Author author);

    int remove(Long id);

    int update(Author author);

    Author findAuthor(Long id);

    List<Author> findAll();
}
