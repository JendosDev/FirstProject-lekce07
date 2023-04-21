package com.engeto.restaurant;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Waiter {
    List<Dish> dishList = new ArrayList<>();

    public void addDish(Dish dish) {
        dishList.add(dish);
    }

    // Metoda pro odebrání jídla z repertoáru
    public void removeDish(Dish dish) {
        dishList.remove(dish);
    }

    // Metoda pro upravení jídla v repertoáru
    public void updateDish(Dish dish, String title, BigDecimal price, LocalTime preparationTime) {
        dish.setTitle(title);
        dish.setPrice(price);
        dish.setPreparationTime(preparationTime);
    }

    // Metoda pro přidání obrázku k jídlu
    public void addImage(Dish dish, String images) {
        dish.setImages(images);
    }

    // Metoda pro odebrání obrázku k jídlu
    public void removeImage(Dish dish) {
        dish.setImages("blank");
    }
}
