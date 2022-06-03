package skypro.lesson2_11;


import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("/store/order")

public class StoreController {
    private final Servise servise;

    public StoreController(Servise servise) {
        this.servise = servise;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam int item) {
        return servise.addItem(item);
    }

    @GetMapping("/get")
    public List <Item> getItem() {
        return servise.getAllItem();
    }
}
