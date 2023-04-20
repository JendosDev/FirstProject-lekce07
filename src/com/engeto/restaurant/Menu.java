import com.engeto.restaurant.Category;
import com.engeto.restaurant.Repertoire;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Menu {

    Repertoire food = new Repertoire(
            "Kuřecí stroganov", BigDecimal.valueOf(135.2), LocalTime.of(0, 32, 24, 0), "kureci-stroganov", Category.CHICKEN);
    Repertoire food2 = new Repertoire(
            "Hranolky", BigDecimal.valueOf(130.4), LocalTime.of(0, 15, 17, 0), "hranolky-01", Category.ATTACHMENT);
}
