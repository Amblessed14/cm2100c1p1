/*
* PizzaToppings.java, edited/created by <Amblessed Chukwuka John> * Component 1 Part 1 - <19/11/2021>
*/
public class PizzaTopping {
    private String name;
    private  int price;

    public PizzaTopping(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
