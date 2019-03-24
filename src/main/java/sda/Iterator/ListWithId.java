package sda.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ListWithId <V> implements Iterator {

    private Map<Integer, V> elements = new HashMap<>();
    private static Integer id = 0;
    private Integer position = 0;

    public void add(V obj) {
        elements.put(id, obj);
        id++;
    }

    @Override
    public boolean hasNext() {
        if (position >= elements.size() ) {
            return false;
        }
        return true;
    }

    @Override
    public V next() {
        V item = new ArrayList<>(elements.values()).get(position);
        position++;
        return item;
    }

}
