import java.util.ArrayList;

public class Bag {
    class Item {
        private String nameOfItem;
        private int quantity;

        public Item(String nameOfItem) {
            this.nameOfItem = nameOfItem;
            quantity = 1;
        }

        public String getNameOfTheItem() {
            return nameOfItem;
        }

        public void add() {
            quantity++;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    ArrayList<Item> items = new ArrayList<>();

    public void add(String nameOfItem) {
        boolean found = false;
        for (Item item : items) {
            if (nameOfItem.equals(item.getNameOfTheItem())) {
                item.add();
                found = true;
                break;
            }
        }
        if (found == false) {
            Item newItem = new Item(nameOfItem);
            items.add(newItem);
        }

    }

    public int count(String itemName) {
        int number = 0;
        for (Item item : items) {
            if (itemName.equals(item.getNameOfTheItem())) {
                number = item.getQuantity();
            }
        }
        return number;
    }
}
