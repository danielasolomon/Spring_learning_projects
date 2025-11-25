package org.example.Ch4.proxies;

import org.example.Ch4.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
