package com.example.shobhitm23.lab13;

/**
 * Created by shobhitm23 on 11/16/2017.
 */
public class Item {
    private String category;
    private String content;
    private String date;

    public Item(String category, String content, String date) {
        this.category = category;
        this.content = content;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
