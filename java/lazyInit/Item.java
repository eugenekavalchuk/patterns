package lazyInit;

import java.util.HashMap;
import java.util.Map;

public class Item {
    public static final Map<ItemType, Item> types = new HashMap<>();

    private Item(ItemType type) {}

    public static Item getItemByTypeName(ItemType type) {
        Item item;

        if (!types.containsKey(type)) {
            item = new Item(type);
            types.put(type, item);
        } else {
            item = types.get(type);
        }

        return item;
    }

    public static Item getItemByTypeNameConcurrentVersion(ItemType type) {
        if (!types.containsKey(type)) {
            synchronized (types) {
                if (!types.containsKey(type)) {
                    types.put(type, new Item(type));
                }
            }
        }

        return types.get(type);
    }

    public static void showAll() {
        if (!types.isEmpty()) {
            for (Map.Entry<ItemType, Item> entry : types.entrySet()) {
                String item = entry.getKey().toString();
                System.out.println(item);
            }
        }
    }
}
