package designpatterns.iterator.step2;

import designpatterns.iterator.step1.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);

    }
}
