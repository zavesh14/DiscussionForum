package com.forum.units;

public class Question extends AbstractEntity{

    //brief description pf question
    private String title;
    private String message;
    //user who asked question
    private User user;

    //number of upvotes for the question

    private int upvoteCount = 0;

    // id of the last question asked o the discussion forum
    private static Long lastEntry = 0L;

    public void autoGenerateId(){
        lastEntry = lastEntry + 1L;
        super.setId(lastEntry);
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(Stirng messsage){
        this.message = message;
    }

    public User getUser(){
        return user;
    }
    public void setUser(User user){
        return user;
    }

    public int getUpvoteCount(){
        return upvoteCount;
    }

    public void increaseUpvoteCount(){
        this.upvoteCount = this.upvoteCount + 1;
    }
}