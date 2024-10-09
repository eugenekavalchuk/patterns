package abstractFabric;

public class ModernFurnitureFactoryImpl implements FurnitureFactory {
    @Override
    public Furniture createChair() {
        return new Chair();
    }

    @Override
    public Furniture createTable() {
        return new Table();
    }

    @Override
    public Furniture createWardrobe() {
        return new Wardrobe();
    }
}
