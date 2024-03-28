package Map;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer key ;
        String value;
        Scanner sc = new Scanner(System.in);
        Map <Integer, String> map = new Map<Integer, String >();

        char task;
        Object obj;
        do {
            System.out.print("Enter operation (p - put, g - get, r - remove , s - size): ");
            task = sc.next().charAt(0);
            sc.nextLine();
            switch (task) {
                case 'p':
                    try {

                        System.out.print("Enter key: ");
                        key = sc.nextInt();
                            sc.nextLine();
                        System.out.print("Enter value: ");
                        value = sc.nextLine();
                        map.put(key, value);
                    }catch (Exception e)
                    {
                        sc.nextLine();
                        System.out.println("Invalid input");
                    }
                    break;
                case 'g':
                    try
                    {

                        System.out.print("Enter key: ");
                        key = sc.nextInt();
                        obj = map.get(key);
                        System.out.println(obj == null ? "Key value pair doesn't exist" : "Element: " + obj);
                    }catch (Exception e )
                    {
                        sc.nextLine();
                        System.out.println("Invalid input");
                    }
                    break;
                case 'r':
                    try
                    {

                        System.out.print("Enter key: ");
                        key = sc.nextInt();
                        obj = map.remove(key);
                        System.out.println(obj == null ? "Key value pair doesn't exist" : "Element removed: " + obj);

                    }catch (Exception e)
                    {
                        sc.nextLine();
                        System.out.println("Invalid input");
                    }
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
