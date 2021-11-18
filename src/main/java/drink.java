/*
* drinks.java, edited/created by <Amblessed Chukwuka John> * Component 1 Part 1 - <19/11/2021>
*/
public class Drink implements IMenuItem {
    private String name;
    private int price;
    private boolean beer;

    public Drink(String name, int price, boolean beer) {
        this.name = name;
        this.price = price;
        this.beer = beer;
    }

    @Override
    public int getPrice() {
        if (beer) {
            return price;
        } else {
            return price + 100;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        if (beer) {
            return this.getName() + ": " + this.getPrice();
        } else {
            return this.getName() + ": " + this.getPrice() + "(beer)";

        }
    }
}
public String toCsv(){
        if (beer)
        return "Drink"+","+this.getName()+","+this.getPrice()+","+"Yes" +"\n";
        else
            return "Drink"+","+this.getName()+","+this.getPrice()+","+"No" +"\n";
    }