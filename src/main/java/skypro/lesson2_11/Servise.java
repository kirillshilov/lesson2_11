package skypro.lesson2_11;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servise {
    private final Store store;

    public Servise(Store store) {
        this.store = store;
    }


    public String addItem(int one) {
        store.addItem(one);
        return ("Вещь добавлена");
    }

    public List <Item> getAllItem() {
        return store.getItemList();
    }

}
