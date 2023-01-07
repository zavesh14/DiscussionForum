package com.forum.units;

public class Reply extends AbstractEntity {
    //repy body
    private String message;
    private User user;
    private Question quetion;
    private static Long lastEntry = 0L;

    public void autoGenerateId(){
        lastEntry = lastEntry + 1;
        super.setId(lastEntry);
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public Question getQuestion(){
        return this.question;
    }

    public void setQuestion(Question question){
        this.question = question;
    }
}