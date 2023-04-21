package com.engeto.restaurant;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Dish {
    private String title;
    private BigDecimal price;
    private LocalTime preparationTime;
    private String mainImage;
    private String images;
    private Category category;

    public Dish(String title, BigDecimal price, LocalTime preparationTime, String mainImage, String images, Category category) {
        this.title = title;
        this.price = price;
        this.preparationTime = preparationTime;
        this.mainImage = mainImage;
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

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }
}
