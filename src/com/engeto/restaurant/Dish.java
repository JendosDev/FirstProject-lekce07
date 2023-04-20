package com.engeto.restaurant;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Repertoire {
    private String title;
    private BigDecimal price;
    private LocalTime preparationTime;
    private String images;
    private Category category;

    public Repertoire(String title, BigDecimal price, LocalTime preparationTime, String images, Category category) {
        this.title = title;
        this.price = price;
        this.preparationTime = preparationTime;
        this.images = images;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalTime getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(LocalTime preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
