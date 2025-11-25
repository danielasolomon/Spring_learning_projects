package org.example.Ch6.services;

import org.example.Ch6.main.Main.*;
import org.example.Ch6.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.text());
        return "SUCCESS";
    }

//    public void publishComment(Comment comment) {
//        logger.info("Publishing comment " + comment.text());
//    }
//
//    @ToLog
//    public void deleteComment(Comment comment) {
//        logger.info("Deleting comment: " + comment.text());
//    }
//
//    public void editComment(Comment comment) {
//        logger.info("Editing comment " + comment.text());
//    }

//    public String publishComment(Comment comment) {
//        logger.info("Publishing comment: " + comment.text());
//
//        return "Success";
//    }

//    public void publishComment(Comment comment) {
//        logger.info("Publishing comment: " + comment.text());
//    }

}
