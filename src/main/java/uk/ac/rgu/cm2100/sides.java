/*
* sides.java, edited/created by <Amblessed Chukwuka John> * Component 1 Part 1 - <19/11/2021>
*/
public class sides implements IMenuItem {

        private String name;
        private int price ;

    public side(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.name + " " + this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return this.getDescription();
    }
}
public String toCsv(){
        return "Side,"+this.getName()+","+this.getPrice()+"\n";