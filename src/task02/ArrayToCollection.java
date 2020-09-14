package task02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 2.Write a generic method that takes an array of objects and a collection, and puts all
 * objects from the array into the collection.
 */
public class ArrayToCollection {
    static <T> void fromArrayToCollection(T[] array, Collection<T> collection) {
        for (T object : array) {
            collection.add(object);
        }
    }

    public static void main(String[] args) {
        Object[] array = new Object[10];
        Collection<Object> collection = new ArrayList<>();
        fromArrayToCollection(array, collection);
    }
}
