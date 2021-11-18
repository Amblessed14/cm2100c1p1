/*
* order.java, edited/created by <Amblessed Chukwuka John> * Component 1 Part 1 - <19/11/2021>
*/
import java.util.ArrayList;

public class Order implements IOrder {

    private ArrayList<IMenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(IMenuItem item) {
        this.items.add(item);
    }

    @Override
    public int total() {
        return this.items.stream().mapToInt((p) -> p.getPrice()).sum();
    }

    @Override
    public void print() {
        for (IMenuItem item : this.items){
            System.out.println(item.getName() + " " + item.getPrice() + "\n");
        }
    }

    @Override
    public void writeToFile() {

    }
}
