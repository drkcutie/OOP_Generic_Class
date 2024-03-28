package Map;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Map <K, V> {

    ArrayList <K> keyArray;
    ArrayList <V> valueArray;

    public Map() {
        keyArray = new ArrayList<>();
        valueArray = new ArrayList<>();
    }

    public void put( K key, V value) throws InputMismatchException
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
    public V get(K key) throws InputMismatchException
    {
        int index = keyArray.indexOf(key);
        if(index != -1)
        {
            return valueArray.get(index);
        }
            return null;

    }
    public V remove(K key) throws InputMismatchException
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
