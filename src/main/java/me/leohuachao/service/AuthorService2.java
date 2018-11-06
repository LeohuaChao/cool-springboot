package me.leohuachao.service;

import me.leohuachao.dao.AuthorMapper;
import me.leohuachao.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/5
 */
@Service
public class AuthorService2 {

    @Autowired
    private AuthorMapper authorMapper;

    public Author findAuthor(Long id) {
        return authorMapper.findAuthor(id);
    }

    @Transactional(rollbackFor = IllegalArgumentException.class)
    public int add(Author author) {
        int result = authorMapper.add(author);

        if (author.getRealName().length() > 5) {
            throw new IllegalArgumentException();
        }

        return result;
    }

}
