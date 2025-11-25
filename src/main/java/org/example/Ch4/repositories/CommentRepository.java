package org.example.Ch4.repositories;

import org.example.Ch4.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
