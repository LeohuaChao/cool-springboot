package me.leohuachao.service;

import me.leohuachao.api.domain.Author;

import java.util.List;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/5
 */
public interface IAuthorService {


    public Author findAuthor(Long id);

    public int add(Author author);

    public List<Author> findAll();

}
