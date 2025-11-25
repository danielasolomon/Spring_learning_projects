package org.example.Ch4.repositories;

import org.example.Ch4.models.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {

        System.out.println("Storing comment: " + comment.getText());

    }

}
