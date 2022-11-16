package mao.mongodb_article.service.impl;

import mao.mongodb_article.dao.CommentDao;
import mao.mongodb_article.entity.Comment;
import mao.mongodb_article.service.CommentService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project name(项目名称)：MongoDB_article
 * Package(包名): mao.mongodb_article.service.impl
 * Class(类名): CommentServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/16
 * Time(创建时间)： 19:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service
public class CommentServiceImpl implements CommentService
{

    @Resource
    private CommentDao commentDao;

    @Override
    public void saveComment(Comment comment)
    {
        commentDao.save(comment);
    }

    @Override
    public void updateComment(Comment comment)
    {
        commentDao.save(comment);
    }

    @Override
    public void deleteCommentById(String id)
    {
        commentDao.deleteById(id);
    }

    @Override
    public List<Comment> findCommentList()
    {
        return commentDao.findAll();
    }

    @Override
    public Comment findCommentById(String id)
    {
        return commentDao.findById(id).get();
    }
}
