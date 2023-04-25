import com.engeto.restaurant.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String DISH_FILENAME = "jidlo.txt";
    public static final String MENU_FILENAME = "menu.txt";
    public static final String ORDER_FILENAME = "orders.txt";

    public static void main(String[] args)  {
        RestaurantList restaurantList = new RestaurantList();
        try {
            restaurantList.addItemsFromDish(DISH_FILENAME);
        } catch (RestaurantException e) {
            System.err.println(e.getLocalizedMessage());
        }
        System.out.println(restaurantList.getList());

        try {
            restaurantList.addItemsFromMenu(MENU_FILENAME);
        } catch (RestaurantException e) {
            System.err.println(e.getLocalizedMessage());
        }
        try {
            restaurantList.addItemsFromOrder(ORDER_FILENAME);
        } catch (RestaurantException e) {
            System.err.println(e.getLocalizedMessage());
        }


        Dish kureci_stroganov = new Dish("Kuřecí stroganov", BigDecimal.valueOf(135.2), LocalTime.of(0, 32), "kureci-stroganov","stroganov-02", Category.CHICKEN);
        Dish testoviny_karbonara = new Dish("Těstoviny karbonára", BigDecimal.valueOf(98.34), LocalTime.of(0, 23), "testoviny-karbonara", "", Category.PASTA);
        Dish hranolky = new Dish("Hranolky", BigDecimal.valueOf(130.4), LocalTime.of(0, 15), "hranolky","hranolky-01", Category.ATTACHMENT);

        List<Dish> dishes = new ArrayList<>();
        dishes.add(kureci_stroganov);
        dishes.add(hranolky);

        Order order = new Order(
                1, LocalTime.of(19, 32, 12), hranolky, "William", LocalTime.of(19, 56, 33), "");


    }
}