import com.engeto.restaurant.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String DISH_FILENAME = "dish.txt";
    public static final String MENU_FILENAME = "menu.txt";
    public static final String ORDER_FILENAME = "orders.txt";

    public static void main(String[] args) throws RestaurantException {
        RestaurantList restaurantList = new RestaurantList();
        restaurantList.addItemsFromDish(DISH_FILENAME);
        restaurantList.addItemsFromMenu(MENU_FILENAME);
        restaurantList.addItemsFromOrder(ORDER_FILENAME);



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