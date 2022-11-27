package com.nakib.javaexercise.sentiment;

public class CustomerComments {
    private String first_name;
    private String last_name;
    private String date;
    private String email;
    private String comment;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
