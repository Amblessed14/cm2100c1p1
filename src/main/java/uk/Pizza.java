/*
* PizzaToppings.java, edited/created by <Amblessed Chukwuka John> * Component 1 Part 1 - <19/11/2021>
*/
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Pizza implements IMenuItem {

    private String name;
    private Crust crust;
    private int BASE_PRICE = 15;
    private List<PizzaTopping> toppings;

    public Pizza(String name, Crust crust) {
        this.name = name;
        this.crust = crust;
        toppings = new ArrayList<>();
    }

    public void addToppings(PizzaTopping... toppings) {
        this.toppings.addAll(Arrays.asList(toppings));
    }

    public Crust getCrust() {
        return crust;
    }

    public List<PizzaTopping> getToppings() {
        return toppings;
    }

    @Override
    public int getPrice() {
        return BASE_PRICE + this.toppings.stream().mapToInt((p) -> p.getPrice()).sum();
    }

    @Override
    public String getDescription() {
        return this.getName() + " " + this.getPrice() + " " + "Crust: " + this.getCrust() + " " + this.getToppings();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getPrice();
    }
}
public String toCsv(){
        return "Pizza"+","+this.getName()+","+this.getPrice()+","+this.getToppingsNames()+"\n";
    }