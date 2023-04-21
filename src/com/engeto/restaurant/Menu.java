package com.engeto.restaurant;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.List;

public class Menu {
    Dish food = new Dish(
            "Kuřecí stroganov", BigDecimal.valueOf(135.2), LocalTime.of(0, 32, 24, 0), "kureci-stroganov", "strogan-kureci", Category.CHICKEN);
    Dish food2 = new Dish(
            "Hranolky", BigDecimal.valueOf(130.4), LocalTime.of(0, 15, 17, 0), "hranolky-01", "hranolky", Category.ATTACHMENT);
}
