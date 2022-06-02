package skypro.lesson2_11;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Service
@SessionScope
public class StoreService {
    private final ArrayList<Item> itemList = new ArrayList<>() {
    };

    public String addItem(int one) {
        itemList.add(new Item(one));
        return new String("Вещь добавлена");
    }

    public ArrayList getAllItem() {
        return itemList;
    }
}
