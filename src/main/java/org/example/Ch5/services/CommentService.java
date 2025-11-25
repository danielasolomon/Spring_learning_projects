package org.example.Ch5.services;

import org.example.Ch5.processor.Comment;
import org.example.Ch5.processor.CommentProcessor;
import org.example.Ch5.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.nio.file.StandardCopyOption;


@Service
// @Lazy
public class CommentService {
    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment comment) {
//        CommentProcessor commentProcessor = new CommentProcessor();

        CommentProcessor commentProcessor = context.getBean(CommentProcessor.class);

        commentProcessor.setComment(comment);
        commentProcessor.processComment(comment);
        commentProcessor.validateComment(comment);

        var c = commentProcessor.getComment();

    }

//    private final CommentRepository commentRepository;
//
//    public CommentService(CommentRepository commentRepository) {
//        this.commentRepository = commentRepository;
//    }
//
//    public CommentRepository getCommentRepository() {
//        return commentRepository;
//    }

//    @Autowired
//    private CommentRepository commentRepository;
//
//    public CommentRepository getCommentRepository() {
//        return commentRepository;
//    }
//
//    public CommentService() {
//        System.out.println("CommentService instance created");
//    }


}
