package skypro.lesson2_11;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Store {
    private final List <Item> itemList = new ArrayList<>();

    public List <Item> getItemList() {
        return itemList;
    }
    public void addItem (int one) {
        itemList.add(new Item(one));
    }
}
