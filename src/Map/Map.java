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
            valueArray.add(key);
        }
        System.out.println("Inserted [ " + key + " , " + value+" ]\n");
    }
    public Object get(Object key) throws NullPointerException
    {
        try {
            return valueArray.get(keyArray.indexOf(key));
        }catch (Exception e)
        {
            return null;
        }

    }
    public Object remove(Object key) throws NullPointerException
    {
        if(!keyArray.contains(key))
        {
            return null;
        }
        Object temp = get(key);
        valueArray.remove(keyArray.indexOf(key));
        keyArray.remove(key);
        return key;
    }
}
