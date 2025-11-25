package org.example.Ch4.main;

import org.example.Ch4.models.Comment;
import org.example.Ch4.proxies.EmailCommentNotificationProxy;
import org.example.Ch4.repositories.DBCommentRepository;
import org.example.Ch4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);


        //var commentRepository = new DBCommentRepository();
        //EmailCommentNotificationProxy commentNotificationProxy;
        //commentNotificationProxy = new EmailCommentNotificationProxy();
        //
        //var commentService = new CommentService(commentRepository, commentNotificationProxy);
        //
        //var comment = new Comment();
        //comment.setAuthor("Laurentiu");
        //comment.setText("Demo comment");
        //
        //commentService.publishComment(comment);

    }


}
