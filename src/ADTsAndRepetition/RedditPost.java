package ADTsAndRepetition;

import java.util.Date;

public class RedditPost {

    private String title;

    public String author;

    private Date date;

    private int downVote;

    private int upVote;

    public RedditPost (String title, String author) {
        this.title = title;
        this.author = author;
        this.date = new Date();
        this.downVote = 0;
        this.upVote = 1;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public int getDownVote() {
        return downVote;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", downVote=" + downVote +
                ", upVote=" + upVote +
                '}';
    }
}
