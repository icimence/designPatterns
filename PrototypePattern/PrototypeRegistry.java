package PrototypePattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class PrototypeRegistry {
    private final HashMap<String, Prototype> itemList = new HashMap<>();

    public void addItem(String name, Prototype prototype) {
        if (itemList.containsKey(name))
            return;
        itemList.put(name, prototype);
    }

    public Prototype getItemByName(String name) {
        if (!itemList.containsKey(name))
            return null;
        return itemList.get(name).clone();
    }

}
