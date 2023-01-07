package com.forum.units;

public class Upvote extends AbstractEntity {

    private Question question;
    private Reply reply;
    private User user;

    private static Long lastEntry = 0L;

    public void autoGenerateId(){
        lastEntry = lastENtry + 1;
        super.setId(lastEntry);
    }

    public Question getQuestion(){
        return this.question;
    }

    public void setQuestion(Question question){
        this.question = question;
    }

    public Reply getReply(){
        return reply;
    }

    public void setReply(Reply reply){
        this.reply = reply;
    }

    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
}