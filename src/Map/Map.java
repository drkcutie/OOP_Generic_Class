package Map;

import java.util.ArrayList;

public class Map {

    ArrayList<Object> keyArray;
    ArrayList<Object> valueArray;

    public Map() {
        keyArray = new ArrayList<>();
        valueArray = new ArrayList<>();
    }

    public void put(Object key, Object value)
    {
        if(keyArray.contains(key))
        {
            int index = keyArray.indexOf(key);
            valueArray.add(index, value);
        }
        else
        {
            keyArray.add(key);
            valueArray.add(value);
        }
        System.out.println("Inserted [ " + key + " , " + value+" ]\n");
    }
    public Object get(Object key)
    {
        int index = keyArray.indexOf(key);
        if(index != -1)
        {
            return valueArray.get(index);
        }
            return null;

    }
    public Object remove(Object key)
    {
        int index = keyArray.indexOf(key);
        if(index != -1)
        {
            keyArray.remove(index);
            return valueArray.remove(index);
        }
        return null;
    }
}
