package com.engeto.restaurant;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantList {
    List<Dish> dishList = new ArrayList<>();
    List<Menu> menuList = new ArrayList<>();
    List<Order> orderList = new ArrayList<>();

    public void add(Dish dish) {
        dishList.add(dish);
    }

    public void addItemsFromDish(String filename) throws RestaurantException {
        long lineNumber = 0;
        String[] dishes = new String[0];
        String line = "";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {
                lineNumber++;
                line = scanner.nextLine();
                dishes = line.split("\t");
                if (dishes.length != 6)
                    throw new RestaurantException("Nesprávný počet položek na řádku číslo: " + lineNumber);
                Dish dish = new Dish(dishes[0], new BigDecimal(dishes[1]), LocalTime.parse(dishes[2]), dishes[3], dishes[5], Category.valueOf(dishes[4]));
                dishList.add(dish);

            }
        } catch (FileNotFoundException e) {
            throw new RestaurantException("Nepodařilo se nalézt soubor: " + filename + "!\n\"" + e.getLocalizedMessage() + "\"");
        } catch (NumberFormatException e) {
            throw new RestaurantException("Špatně zadané číslo na řádku " + lineNumber + ": " + dishes[1] + "\nŘádek: " + line + "\n\"" + e.getLocalizedMessage() + "\"");
        }

    }

    public BigDecimal averagePrice() {
        BigDecimal sum = BigDecimal.ZERO;
        long count = 0;
        for (Dish dish : dishList) {
            sum = sum.add(dish.getPrice());
        }
        return sum.divide(BigDecimal.valueOf(
                dishList.size()));
    }

    public void addItemsFromMenu(String filename) throws RestaurantException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {

            }
        } catch (FileNotFoundException e) {
            throw new RestaurantException(e.getLocalizedMessage());
        }
    }

    public void addItemsFromOrder(String filename) throws RestaurantException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {

            }
        } catch (FileNotFoundException e) {
            throw new RestaurantException(e.getLocalizedMessage());
        }
    }
}
