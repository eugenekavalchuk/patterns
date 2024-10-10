package lazyInit;

public class Main {
    public static void main(String[] args) {
        Item.getItemByTypeName(ItemType.AXE);
        Item.showAll();
        Item.getItemByTypeName(ItemType.SWORD);
        Item.showAll();
    }
}
