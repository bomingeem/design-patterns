package designpatterns.decorator.step2;

public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
