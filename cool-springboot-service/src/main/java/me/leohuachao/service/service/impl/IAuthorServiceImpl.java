package me.leohuachao.service.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.leohuachao.api.domain.Author;
import me.leohuachao.service.mapper.AuthorMapper;
import me.leohuachao.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/5
 */
@Service(interfaceClass = IAuthorService.class)
@Component
public class IAuthorServiceImpl implements IAuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public Author findAuthor(Long id) {
        return authorMapper.findAuthor(id);
    }

    @Override
    @Transactional(rollbackFor = IllegalArgumentException.class)
    public int add(Author author) {
        int result = authorMapper.add(author);

        if (author.getRealName().length() > 5) {
            throw new IllegalArgumentException();
        }

        return result;
    }

    @Override
    public List<Author> findAll() {
//        throw new IllegalArgumentException();
        return authorMapper.findAll();
    }

}
