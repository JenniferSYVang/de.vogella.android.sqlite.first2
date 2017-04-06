package jvang.cs.cis3334.devogellaandroidsqlitefirst;

/**
 * Created by Jenni V on 4/4/2017.
 */

public class Comment {
    private long id;
    private String comment;
    private String rating;

    // getter and setter for the rating variable
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return (comment + " " + rating);
    }
}