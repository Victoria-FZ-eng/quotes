package quotes;

import java.util.ArrayList;

public class Quotes {

    ArrayList<String> tags = new ArrayList<>();
    String author;
    String likes;
    String text;

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    String quoteText;
    String quoteAuthor;

    public Quotes(String quoteText, String quoteAuthor) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }
    public String toString2(){
        return "Quotes{" +
                ", author='" + quoteAuthor + '\'' +

                ", text='" + quoteText + '\'' +
                '}';
    }
    public Quotes(ArrayList<String> tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "tags=" + tags +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }


}
