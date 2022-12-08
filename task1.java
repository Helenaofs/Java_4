// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        int length = 10;
        for (int i = 0; i < length; i++) {
            list.add(i, random.nextInt(10));
        }
        System.out.println(list);
        list = turn(list);
        System.out.println(list);

    }

    public static LinkedList<Integer> turn(LinkedList<Integer> array) {
        int temp;
        int size = array.size();
        for (int i = 0; i < size / 2; i++) {
            temp = array.get(i);
            array.set(i, array.get(size - i - 1));
            array.set(size - i - 1, temp);
        }
        return array;
    };
}
