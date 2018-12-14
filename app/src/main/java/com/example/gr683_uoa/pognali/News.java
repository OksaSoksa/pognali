package com.example.gr683_uoa.pognali;

public class News {
    private String id;
    private String description;
    private String name;
    private String image;
    private long date;

    public News(){

    }

    public News(String id, String description, String name, String image, long date) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.image = image;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public long getDate() {
        return date;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
