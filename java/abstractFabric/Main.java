package abstractFabric;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory cf = new ClassicFurnitureFactoryImpl();
        FurnitureFactory mf = new ModernFurnitureFactoryImpl();

        Furniture c1 = cf.createChair();
        Furniture t1 = cf.createTable();
        Furniture w1 = cf.createWardrobe();

        Furniture c2 = mf.createChair();
        Furniture t2 = mf.createTable();
        Furniture w2 = mf.createWardrobe();

        c1.setColor("RED");
        t1.setColor("RED");
        w1.setColor("RED");

        c2.setColor("BLUE");
        t2.setColor("BLUE");
        w2.setColor("BLUE");
    }
}
