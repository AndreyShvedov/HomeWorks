package Lesson12;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {
    public int compare(Product a, Product b) {
        return a.getId().compareTo(b.getId());
    }
}
