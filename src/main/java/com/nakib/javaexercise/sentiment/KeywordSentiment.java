package com.nakib.javaexercise.sentiment;

public class KeywordSentiment {
    private String keyword;
    private boolean is_positive;
    private boolean is_negative;
    private boolean is_neutral;

    public KeywordSentiment(String keyword, boolean is_positive, boolean is_negative, boolean is_neutral) {
        this.keyword = keyword;
        this.is_positive = is_positive;
        this.is_negative = is_negative;
        this.is_neutral = is_neutral;
    }

    public String getKeyword() {
        return keyword;
    }

    public boolean is_positive() {
        return is_positive;
    }

    public boolean is_negative() {
        return is_negative;
    }

    public boolean is_neutral() {
        return is_neutral;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setIs_positive(boolean is_positive) {
        this.is_positive = is_positive;
    }

    public void setIs_negative(boolean is_negative) {
        this.is_negative = is_negative;
    }

    public void setIs_neutral(boolean is_neutral) {
        this.is_neutral = is_neutral;
    }
}
