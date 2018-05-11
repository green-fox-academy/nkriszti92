import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPosts;

    public Blog() {
        this.blogPosts = new ArrayList<>();
    }

    public void add(BlogPost blogpost) {
        blogPosts.add(blogpost);
    }

    public void delete(int index){
        blogPosts.remove(index);
    }

    public void update(int index, BlogPost blogPost){
        blogPosts.set(index, blogPost);

    }


}
