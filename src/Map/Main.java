package Map;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Object key, value;
        Scanner sc = new Scanner(System.in);
        Map map = new Map();

        char task;
        Object obj;
        do {
            System.out.print("Enter operation (p - put, g - get, r - remove , s - size): ");
            task = sc.next().charAt(0);
            sc.nextLine();
            switch (task) {
                case 'p':
                    System.out.print("Enter key: ");
                    key = sc.nextLine();

                    System.out.print("Enter value: ");
                    value = sc.nextLine();
                    map.put(key, value);
                    break;
                case 'g':

                    System.out.print("Enter key: ");
                    key = sc.nextLine();
                    obj = map.get(key);
                    System.out.println(obj == null ? "Key value pair doesn't exist" : "Element: " + obj);
                    break;
                case 'r':

                    System.out.print("Enter key: ");
                    key = sc.nextLine();
                    obj = map.remove(key);
                    System.out.println(obj == null ? "Key value pair doesn't exist" : "Element removed: " + obj);
                    break;
                case 's':
                    System.out.println("Size: " + map.keyArray.size());
                    break;
                default:
                    System.out.println("wrong input");
            }
        } while (task != 'x');


    }

}
