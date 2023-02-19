package ADTsAndRepetition;

import java.util.ArrayList;

public class RedditFrontPage {

    private static ArrayList<RedditPost> redditPosts = new ArrayList<>();

    public static void main(String[] args) {

        RedditPost otto = new RedditPost("Otto blæser din mormor omkuld","Hans Anteto Harryson Nielsen");
        RedditPost challenger = new RedditPost("Jeg er bedre end din far","Hans Anteto Harryson Nielsen");
        RedditPost beetlejuice = new RedditPost("Be my Beetle","Hans Anteto Harryson Nielsen");
        RedditPost basementBar = new RedditPost("basementBar er kogylle","Hans Anteto Harryson Nielsen");


        redditPosts.add(otto);
        redditPosts.add(challenger);
        redditPosts.add(beetlejuice);
        redditPosts.add(basementBar);

        System.out.println(redditPosts);

        removeRedditPost(3);

        System.out.println(redditPosts);

    }

    public static void removeRedditPost (int index) {
        redditPosts.remove(index);
    }

}
