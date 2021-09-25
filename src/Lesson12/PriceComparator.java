package Lesson12;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    public int compare(Product a, Product b) {
        return a.getPrice().compareTo(b.getPrice());
    }

}
