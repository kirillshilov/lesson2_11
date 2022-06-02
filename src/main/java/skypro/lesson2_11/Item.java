package skypro.lesson2_11;

import java.util.Objects;

public class Item {
    int number;

    public Item(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Item{" +
                "number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(number, item.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
