package pro.sky.eeee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basket")
public class Controller {
    private final BasketService service;

    public Controller(BasketService service) {
        this.service = service;
    }
}
