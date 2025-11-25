package org.example.Ch4.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import org.example.Ch4.proxies.CommentNotificationProxy;
import org.example.Ch4.proxies.EmailCommentNotificationProxy;
import org.example.Ch4.repositories.CommentRepository;
import org.example.Ch4.repositories.DBCommentRepository;
import org.example.Ch4.services.CommentService;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = {"org.example.Ch4"})
public class ProjectConfiguration {


    //@Bean
    //public CommentRepository commentRepository() {
    //    return new DBCommentRepository();
    //}
    //
    //@Bean
    //public CommentNotificationProxy commentNotificationProxy() {
    //    return new EmailCommentNotificationProxy();
    //}
    //
    //@Bean
    //public CommentService commentService(
    //        CommentRepository commentRepository,
    //        CommentNotificationProxy commentNotificationProxy) {
    //    return new CommentService(commentRepository, commentNotificationProxy);
    //}

}
