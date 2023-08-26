package pro.sky.eeee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class Controller {
    private final BasketService basketService;

    public Controller(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add") // получить
    public void add(@RequestParam Integer [] ids) {
        basketService.add(ids);
    }
    @GetMapping("/get") // добавить
    public List<Integer> get() {
        return basketService.all();
    }
}
