package skypro.lesson2_11;


import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("/store/order")

public class StoreController {
    private final StoreService storeService;

    private StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam int item) {
        return storeService.addItem(item);
    }

    @GetMapping("/get")
    public String getItem() {
        return storeService.getAllItem().toString();
    }
}
